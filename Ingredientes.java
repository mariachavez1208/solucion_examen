public class Ingredientes {

    private TipoIngrediente[] ingrediente;
    private static final int MAX_INGREDIENTES = 5;
    private int cantidad;

    public Ingredientes() {
        ingrediente = new TipoIngrediente[MAX_INGREDIENTES];
        cantidad = 0;
    }

    public boolean hayEspacio() {
        return cantidad < MAX_INGREDIENTES;
    }

    public void agregarIngrediente(TipoIngrediente nuevoIngrediente) {

        if (hayEspacio()) {
            ingrediente[cantidad] = nuevoIngrediente;
            cantidad++;
        } else {
            System.out.println("No hay espacio para más ingredientes.");
        }
    }

    public TipoIngrediente[] getIngredientes() {
        return ingrediente;
    }

    public int getCantidad() {
        return cantidad;
    }
}