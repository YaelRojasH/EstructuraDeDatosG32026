import javax.swing.*;

public class TestEmpleado {
    private static Empleado empl; // Composicion
    public static void main(String[] args) {
        iniciar();
    }

    // Un metodo estatico puede invocar a otro metodo estatico, pero un metodo no estatico puede invocar a uno estatico
    // y un estatico no puede invocar a un no estatico
    public static void iniciar (){
        String numeroNomina = solicitarTexto("Numero Nomina");
        String nombre = solicitarTexto("Nombre Completo");

        empl = new Empleado(numeroNomina, nombre, "Masculino", 34000.56, true);

        imprimir();
    }

    public static String solicitarTexto (String valor){
        return JOptionPane.showInputDialog("Introduce el valor: " + valor);
    }

    public static void imprimir (){
        String salida = "Datos del Empleado: \n " +
                empl.toString() +
                "\n Numero de objetos creados: " +
                Empleado.getContarObjetos();

        JOptionPane.showMessageDialog(null, salida);
    }
}
