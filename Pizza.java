public class Pizza {
    private TipoBase base;
    private TipoSalsa salsa;

    public TipoSalsa getSalsa() {
        return salsa;
    }

    public TipoBase getBase() {
        return base;
    }

    public TipoIngredientes getIngredientes() {
        return ingredientes; }
    
    public Pizza(TipoBase base, TipoSalsa salsa) {
        this.base = base;
        this.salsa = salsa;
    }

    public void agregarIngrediente(TipoIngrediente ingrediente1, Tipoingrediente ingrediente2) {}
    
    public void agregarIngrediente(TipoIngrediente ingrediente1, TipoIngredeinte ingreidente2) {}
}


