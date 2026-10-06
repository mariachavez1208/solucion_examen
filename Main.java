import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== CREAR ORDEN =====");

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("\nMetodo de pago:");
        System.out.println("1. Tarjeta");
        System.out.println("2. Efectivo");
        System.out.print("Seleccione una opcion: ");

        int opcionPago = scanner.nextInt();

        MetodoPago pago;

        if (opcionPago == 1) {
            pago = MetodoPago.TARJETA;
        } else {
            pago = MetodoPago.EFECTIVO;
        }

        System.out.println("\nSeleccione la base:");
        System.out.println("1. Masa");
        System.out.println("2. Pollo");
        System.out.print("Seleccione una opcion: ");

        int opcionBase = scanner.nextInt();

        TipoBase base;

        if (opcionBase == 1) {
            base = TipoBase.MASA;
        } else {
            base = TipoBase.POLLO;
        }

        System.out.println("\nSeleccione la salsa:");
        System.out.println("1. Normal");
        System.out.println("2. Picante");
        System.out.println("3. Blanca");
        System.out.print("Seleccione una opcion: ");

        int opcionSalsa = scanner.nextInt();

        TipoSalsa salsa;

        if (opcionSalsa == 1) {
            salsa = TipoSalsa.NORMAL;
        } else if (opcionSalsa == 2) {
            salsa = TipoSalsa.PICANTE;
        } else {
            salsa = TipoSalsa.BLANCA;
        }

        Pizza pizza = new Pizza(base, salsa);

        System.out.print("\nCuantos ingredientes desea agregar? (maximo 5): ");
        int cantidadIngredientes = scanner.nextInt();

        if (cantidadIngredientes > 5) {
            cantidadIngredientes = 5;
            System.out.println("Solo se pueden agregar 5 ingredientes.");
        }

        for (int i = 0; i < cantidadIngredientes; i++) {

            System.out.println("\nSeleccione ingrediente " + (i + 1) + ":");
            System.out.println("1. Cebolla");
            System.out.println("2. Pepperoni");
            System.out.println("3. Jamon");
            System.out.println("4. Chile Pimiento");
            System.out.println("5. Carne");
            System.out.print("Seleccione una opcion: ");

            int opcionIngrediente = scanner.nextInt();

            if (opcionIngrediente == 1) {
                pizza.agregarIngrediente(TipoIngrediente.CEBOLLA);

            } else if (opcionIngrediente == 2) {
                pizza.agregarIngrediente(TipoIngrediente.PEPPERONI);

            } else if (opcionIngrediente == 3) {
                pizza.agregarIngrediente(TipoIngrediente.JAMON);

            } else if (opcionIngrediente == 4) {
                pizza.agregarIngrediente(TipoIngrediente.CHILE_PIMIENTO);

            } else if (opcionIngrediente == 5) {
                pizza.agregarIngrediente(TipoIngrediente.CARNE);

            } else {
                System.out.println("Ingrediente no valido.");
                i--;
            }
        }

        Orden orden = new Orden(
            nombre,
            pago,
            1,
            pizza
        );

        System.out.println("\n===== SU ORDEN =====");

        orden.mostrarOrden();
        orden.pagar();

        Cocina cocina = new Cocina();
        cocina.agregarOrden(orden);

        System.out.println("\n===== COMPARACION =====");

        if (pizza == orden.getPizza()) {
            System.out.println("La pizza creada es la misma pizza que pertenece a la orden.");
        } else {
            System.out.println("La pizza creada no es la misma pizza que pertenece a la orden.");
        }

        scanner.close();
    }
}