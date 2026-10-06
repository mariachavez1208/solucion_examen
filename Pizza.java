public class Pizza {

    private TipoBase base;
    private TipoSalsa salsa;
    private Ingredientes ingredientes;

    public Pizza(TipoBase base, TipoSalsa salsa) {
        this.base = base;
        this.salsa = salsa;
        this.ingredientes = new Ingredientes();
    }

    public TipoSalsa getSalsa() {
        return salsa;
    }

    public TipoBase getBase() {
        return base;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void agregarIngrediente(TipoIngrediente ingrediente) {
        ingredientes.agregarIngrediente(ingrediente);
    }

    public void agregarIngrediente(
            TipoIngrediente ingrediente1,
            TipoIngrediente ingrediente2) {

        ingredientes.agregarIngrediente(ingrediente1);
        ingredientes.agregarIngrediente(ingrediente2);
    }

    public void agregarIngrediente(
            TipoIngrediente ingrediente1,
            TipoIngrediente ingrediente2,
            TipoIngrediente ingrediente3) {

        ingredientes.agregarIngrediente(ingrediente1);
        ingredientes.agregarIngrediente(ingrediente2);
        ingredientes.agregarIngrediente(ingrediente3);
    }

    public void mostrarPizza() {

        System.out.println("Base: " + base);
        System.out.println("Salsa: " + salsa);
        System.out.println("Ingredientes:");

        TipoIngrediente[] lista =
                ingredientes.getIngredientes();

        for (int i = 0; i < ingredientes.getCantidad(); i++) {
            System.out.println("- " + lista[i]);
        }
    }
}