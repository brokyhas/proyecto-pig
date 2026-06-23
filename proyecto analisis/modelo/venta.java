package modelo;

public class venta{
    private int id;
    private String producto;
    private int cantidad;
    private double total;
    public venta(int id,String prodcuto, int cantidad,double total){
        this.id=id;
        this.producto=prodcuto;
        this.cantidad=cantidad;
        this.total=total;
        
      
    }
    public int getId(){
        return id;

    }
    public String getProducto(){
        return producto;

    }
    public int getCantidad(){
        return cantidad;
    
    }
    public double getTotal(){
        return total;
    }
}
   

    