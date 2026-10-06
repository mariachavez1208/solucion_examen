public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza(
                TipoBase.MASA,
                TipoSalsa.NORMAL
        );

        pizza.agregarIngrediente(
                TipoIngrediente.PEPPERONI,
                TipoIngrediente.JAMON,
                TipoIngrediente.CEBOLLA
        );

        Orden orden = new Orden(
                "Maria",
                MetodoPago.TARJETA,
                1,
                pizza
        );

        orden.mostrarOrden();
        orden.pagar();

        Cocina cocina = new Cocina();

        cocina.agregarOrden(orden);
    }
}