package ventas;

import java.util.Date;

public class Orden {
    private int idOrden;
    private Producto[] productos;
    private Cliente cliente;
    private Date fecha;
    private static int contadorOrdenes;
    private int contadorProductos;
    private static int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
        this.fecha = new Date();
    }

    public void agregarCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto){
        if(contadorProductos<MAX_PRODUCTOS){
            this.productos[contadorProductos++] = producto;
        }
    }

    public double calcularTotal(){
        double total= 0.0;
        for(Producto item: this.productos){

            total += item.getPrecio();
        }
        return  total;
    }

    public void mostrarOrden(){

        StringBuilder valor = new StringBuilder("Su numero de factura es: ");
        valor.append(idOrden)
                .append("\n Cliente: ")
                .append(cliente)
                .append("\n Fecha de la factura: ")
                .append(fecha)
                .append("\n Productos: ").append("\n ");

        for(Producto item: this.productos){

            valor.append(item.toString())
                    .append("\n ");

        }

        valor.append("\n Su total es: $")
                .append(calcularTotal())
                .append("\n Total de productos: ").append(this.contadorProductos);

        System.out.println(valor);

    }

}
