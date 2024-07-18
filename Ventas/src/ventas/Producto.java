package ventas;

public class Producto {

    private int idProducto;
    private String nombreProducto;
    private double precio;
    private static int contadorProductos;

    public Producto() {
        this.idProducto = ++contadorProductos;
    }

    public Producto(String nombreProducto, double precio) {
        this();
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + idProducto + ", Nombre: " + nombreProducto + ", precio: $" + precio + " ";
    }
}
