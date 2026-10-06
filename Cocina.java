public class Cocina {

    private static final int MAX_ORDEN = 10;
    private Orden[] espacio;
    private int cantidadOrdenes;

    public Cocina() {
        espacio = new Orden[MAX_ORDEN];
        cantidadOrdenes = 0;
    }

    public boolean hayEspacio() {
        return cantidadOrdenes < MAX_ORDEN;
    }

    public void agregarOrden(Orden orden) {

        if (hayEspacio()) {

            espacio[cantidadOrdenes] = orden;
            cantidadOrdenes++;

            System.out.println("Orden agregada a cocina.");

        } else {

            System.out.println("No hay espacio para más órdenes.");
        }
    }
}