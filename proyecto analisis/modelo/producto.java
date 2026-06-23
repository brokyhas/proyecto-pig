package modelo;

public class producto{
    private int id;
    private String nombre;
    private double precio;
    public producto(int id,String nombre, double precio){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;


    }
    public int getId(){
        return id;

    }
    public String getNombree(){
        return nombre;

    }
    public double getPrecio(){
        return precio;
    }
}