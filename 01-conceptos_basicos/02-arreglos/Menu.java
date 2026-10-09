package mx.edu.uttt.menu;

import javax.swing.*;

public class Menu {
    //Metodo static metodo de instancia
    public static String menuPrincipal(){
        String opciones = "=========== ESTRUCTURA DE DATOS ========== \n\n" +
                "1) Arreglos\n" +
                "2) Recursividad\n" +
                "3) Listas\n" +
                "4) Pilas\n" +
                "5) Colas\n" +
                "6) Arboles\n" +
                "0) Salir\n\n" +
                "Seleccione una opción";

        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuArreglos(){
        String opciones = "=========== MENUS ========== \n\n" +
                "1) Vectores\n" +
                "2) Matrices\n" +
                "0) Regresar\n" +
                "Seleccione una opción";

        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuVectores(){
        String opciones = "======== MENÚ VECTORES ========" +
                "\n1) Agregar Valor al Vector" +
                "\n2) Llenar el Vector" +
                "\n3) Sumar los datos del vector" +
                "\n4) Sumar los datos del vector de instancia con otro vector" +
                "\n5) Calcular los pares" +
                "\n6) Calcular los primos" +
                "\n7) Promedio de los valores del Vector" +
                "\n8) Valor Mayor" +
                "\n9) Valor Menor" +
                "\n10) Buscar un elemento" +
                "\n0) Regresar" +
                "\n\nSelecciona una opción:";

        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuMatrices(){
        String opciones = "=========== MENU MATRICES ========== \n\n" +
                "1) Reserva de Asientos\n" +
                "2) Acumulado de Ventas\n" +
                "3) Matriz identidad\n" +
                "4) Diagonal principal\n" +
                "5) Transposición\n" +
                "6) Rotación\n" +
                "0) Regresar\n" +
                "Seleccione una opción";

        // Matriz [i][j]
        // Matriz [j][i] para lo de rotación
        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuRecursividad(){
        String opciones = "=========== ESTRUCTURA DE DATOS ========== \n\n" +
                "1) Sumar números de 1 a N\n" +
                "2) Factorial de un número\n" +
                "3) Multiplicacion mediante sumas\n" +
                "4) Potencia mediante multiplicaciones\n" +
                "0) Salir";

        return JOptionPane.showInputDialog(opciones);
    }

    //Menu listas
    public static String menuListas(){
        String opciones = "=========== ESTRUCTURA DE DATOS ========== \n\n" +
                "1) Vectores\n" +
                "2) Matrices\n" +
                "0) Regresar\n" +
                "Seleccione una opción";

        return JOptionPane.showInputDialog(opciones);
    }

    //Menu Colas
    public static String menuColas(){
        return "";
    }

    //Menu Pilas
    public static String menuPilas(){
        return "";
    }

    //Menu Arboles
    public static String menuArboles(){
        return "";
    }
}
