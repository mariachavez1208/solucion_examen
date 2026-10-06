public class Orden {

    private String nombre;
    private MetodoPago pago;
    private int numeroOrden;
    private Pizza pizza;

    public Orden(
            String nombre,
            MetodoPago pago,
            int numeroOrden,
            Pizza pizza) {

        this.nombre = nombre;
        this.pago = pago;
        this.numeroOrden = numeroOrden;
        this.pizza = pizza;
    }

    public String getNombre() {
        return nombre;
    }

    public MetodoPago getPago() {
        return pago;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void mostrarOrden() {

        System.out.println("Orden #" + numeroOrden);
        System.out.println("Cliente: " + nombre);
        System.out.println("Pago: " + pago);

        pizza.mostrarPizza();
    }

    public void pagar() {

        if (pago == MetodoPago.TARJETA) {
            System.out.println("Pago realizado con tarjeta.");
        } else {
            System.out.println("Pago realizado en efectivo.");
        }
    }
}