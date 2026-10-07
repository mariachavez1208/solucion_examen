import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simulador de Pizzas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel formulario = new JPanel(new GridLayout(6, 2, 5, 5));
        formulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextField nombre = new JTextField();

        JComboBox<String> pago = new JComboBox<>(
            new String[]{"Tarjeta", "Efectivo"}
        );

        JComboBox<String> base = new JComboBox<>(
            new String[]{"Masa", "Pollo"}
        );

        JComboBox<String> salsa = new JComboBox<>(
            new String[]{"Normal", "Picante", "Blanca"}
        );

        formulario.add(new JLabel("Nombre:"));
        formulario.add(nombre);

        formulario.add(new JLabel("Metodo de pago:"));
        formulario.add(pago);

        formulario.add(new JLabel("Base:"));
        formulario.add(base);

        formulario.add(new JLabel("Salsa:"));
        formulario.add(salsa);

        JCheckBox cebolla = new JCheckBox("Cebolla");
        JCheckBox pepperoni = new JCheckBox("Pepperoni");
        JCheckBox jamon = new JCheckBox("Jamon");
        JCheckBox chile = new JCheckBox("Chile Pimiento");
        JCheckBox carne = new JCheckBox("Carne");

        JPanel ingredientes = new JPanel(new FlowLayout());

        ingredientes.add(cebolla);
        ingredientes.add(pepperoni);
        ingredientes.add(jamon);
        ingredientes.add(chile);
        ingredientes.add(carne);

        formulario.add(new JLabel("Ingredientes:"));
        formulario.add(ingredientes);

        JButton crearOrden = new JButton("Crear Orden");

        JTextArea resultado = new JTextArea(10, 30);
        resultado.setEditable(false);

        crearOrden.addActionListener(e -> {

            String nombreCliente = nombre.getText();

            if (nombreCliente.isEmpty()) {
                resultado.setText("Ingrese un nombre.");
                return;
            }

            MetodoPago metodoPago;

            if (pago.getSelectedIndex() == 0) {
                metodoPago = MetodoPago.TARJETA;
            } else {
                metodoPago = MetodoPago.EFECTIVO;
            }

            TipoBase tipoBase;

            if (base.getSelectedIndex() == 0) {
                tipoBase = TipoBase.MASA;
            } else {
                tipoBase = TipoBase.POLLO;
            }

            TipoSalsa tipoSalsa;

            if (salsa.getSelectedIndex() == 0) {
                tipoSalsa = TipoSalsa.NORMAL;
            } else if (salsa.getSelectedIndex() == 1) {
                tipoSalsa = TipoSalsa.PICANTE;
            } else {
                tipoSalsa = TipoSalsa.BLANCA;
            }

            Pizza pizza = new Pizza(tipoBase, tipoSalsa);

            if (cebolla.isSelected()) {
                pizza.agregarIngrediente(
                    TipoIngrediente.CEBOLLA
                );
            }

            if (pepperoni.isSelected()) {
                pizza.agregarIngrediente(
                    TipoIngrediente.PEPPERONI
                );
            }

            if (jamon.isSelected()) {
                pizza.agregarIngrediente(
                    TipoIngrediente.JAMON
                );
            }

            if (chile.isSelected()) {
                pizza.agregarIngrediente(
                    TipoIngrediente.CHILE_PIMIENTO
                );
            }

            if (carne.isSelected()) {
                pizza.agregarIngrediente(
                    TipoIngrediente.CARNE
                );
            }

            Orden orden = new Orden(
                nombreCliente,
                metodoPago,
                1,
                pizza
            );

            String texto = "";

            texto += "===== ORDEN =====\n";
            texto += "Cliente: " + orden.getNombre() + "\n";
            texto += "Numero de orden: "
                    + orden.getNumeroOrden() + "\n";
            texto += "Metodo de pago: "
                    + orden.getPago() + "\n";

            texto += "\n===== PIZZA =====\n";
            texto += "Base: " + pizza.getBase() + "\n";
            texto += "Salsa: " + pizza.getSalsa() + "\n";

            texto += "Ingredientes:\n";

            TipoIngrediente[] lista =
                pizza.getIngredientes().getIngredientes();

            for (int i = 0;
                 i < pizza.getIngredientes().getCantidad();
                 i++) {

                texto += "- " + lista[i] + "\n";
            }

            texto += "\n===== COMPARACION =====\n";

            if (pizza == orden.getPizza()) {
                texto += "La pizza pertenece a esta orden.";
            } else {
                texto += "La pizza no pertenece a esta orden.";
            }

            resultado.setText(texto);
        });

        JPanel centro = new JPanel(new BorderLayout());

        centro.add(formulario, BorderLayout.NORTH);
        centro.add(crearOrden, BorderLayout.CENTER);
        centro.add(
            new JScrollPane(resultado),
            BorderLayout.SOUTH
        );

        frame.add(centro);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}