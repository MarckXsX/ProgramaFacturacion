package ventas;

public class Cliente {
    private int idCliente;
    private String nombreCliente;
    TipoPago tipoPago;

    public Cliente(String nombreCliente, TipoPago tipoPago) {
        this.nombreCliente = nombreCliente;
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return  " " + nombreCliente + ", Tipo de Pago: " + tipoPago + " ";
    }
}
