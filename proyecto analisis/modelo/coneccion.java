package controlador;

import modelo.Conexion;
import modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorVentas {

    public boolean registrarVenta(Venta venta) {
        String sql = "INSERT INTO venta (producto, cantidad, total) VALUES (?, ?, ?)";
        
        
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            
            ps.setString(1, venta.getProducto());
            ps.setInt(2, venta.getCantidad());
            ps.setDouble(3, venta.getTotal());
            
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al registrar la venta: " + e.getMessage());
            return false;
        }
    }
}