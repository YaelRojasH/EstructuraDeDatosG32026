package mx.edu.uttt.app;

import mx.edu.uttt.arreglos.ArreglosMenu;
import mx.edu.uttt.menu.Menu;
import mx.edu.uttt.recursividad.MenuRecursividad;

import javax.swing.*;

public class App {
    static void main(String[] args) {
         iniciar ();
    }

    //Metodo para iniciar

    public static void iniciar(){
        String opcion;

        do{
            opcion = Menu.menuPrincipal();

            switch (opcion){
                case "1":
                    JOptionPane.showMessageDialog(null, "Arreglos");
                    ArreglosMenu.mostrar();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Recursividad");
                    MenuRecursividad.menuRecursividacd();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Listas");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Pilas");
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Colas");
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Arboles");
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while (true);
    }
}
