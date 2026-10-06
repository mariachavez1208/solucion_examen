public class Orden {

    private String nombre;
    private MetodoPago pago;
    private int numeroOrden;

    public String getNombre() {
        return nombre;
    }

    public MetodoPago getPago() {
        return pago;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void mostrarOrden() {

    }

    public void pagar() {

    }

    public Orden(
            String nombre,
            MetodoPago pago,
            int numeroOrden) {

        this.nombre = nombre;
        this.pago = pago;
        this.numeroOrden = numeroOrden;
    }
}