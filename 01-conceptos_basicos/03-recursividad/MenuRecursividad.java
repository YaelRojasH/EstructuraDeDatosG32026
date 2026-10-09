package mx.edu.uttt.recursividad;

import mx.edu.uttt.recursividad.recursividadEjercicios.Recursividad;
import mx.edu.uttt.menu.Menu;

import javax.swing.JOptionPane;

public class MenuRecursividad {
    public static void menuRecursividacd(){
        String opcion = "";
        int n = 0, y = 0;
        do {
            opcion = Menu.menuRecursividad();

            switch (opcion){
                case "1":
                    JOptionPane.showMessageDialog(null, "Sumar numeros de 1 a N");
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a sumar de 1 a N: "));

                    JOptionPane.showMessageDialog(null, "Resultado de 1 a " + n + " es: " + Recursividad.sumarN(n));
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Factorial de N numero");
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero N: "));

                    JOptionPane.showMessageDialog(null, "Resultado de Factorial " + n + " es: " + Recursividad.factorial(n));
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Multiplicacion mediante sumas");
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero N: "));
                    y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las veces a sumar (Multiplicar)"));

                    JOptionPane.showMessageDialog(null, "Resultado de la multiplicacion mediante sumas de: " + n + " es: " + Recursividad.multiplicar(n, y));
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Potencia");
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base "));
                    y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el exponente"));

                    JOptionPane.showMessageDialog(null, "Resultado de: " + n + " a la potencia: " + y + " es: " + Recursividad.potencia(n, y));
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Adios");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida 😭👻");
            }
        }while (true);
    }
}

