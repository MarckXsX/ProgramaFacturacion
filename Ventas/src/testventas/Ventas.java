package testventas;

import ventas.Cliente;
import ventas.Orden;
import ventas.Producto;
import ventas.TipoPago;
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {

        Scanner variable = new Scanner(System.in);
        TipoPago opcion;
        boolean bandera = true;

        while (bandera){
            System.out.println("Ingrese el nombre del cliente");
            String nombre = variable.nextLine();

            System.out.println("Seleccione el Tipo de Pago: [1=CONTADO] | [2=CREDITO]");
            int val = variable.nextInt();

            if(val == 1){
                opcion = TipoPago.CONTADO;
            }else {
                opcion = TipoPago.CREDITO;
            }

            Cliente cliente = new Cliente(nombre,opcion);

            Orden miOrden = new Orden();
            miOrden.agregarCliente(cliente);

            variable.nextLine();

            System.out.println();

            //Ingreso del producto
            for(int i=0; i<10; i++){

                System.out.println("Ingrese el nombre del producto");
                String nombreProducto = variable.nextLine();

                System.out.println("Ingrese el valor: $");
                int valorProducto = variable.nextInt();

                miOrden.agregarProducto(new Producto(nombreProducto,valorProducto));

                variable.nextLine();

            }

            miOrden.mostrarOrden();

            System.out.println("Quieres ingresar otra factura ? SI=S/NO=N");
            String eleccion = variable.nextLine();
            bandera = eleccion.equalsIgnoreCase("S") == true ? true : false;
        }

    }

}
