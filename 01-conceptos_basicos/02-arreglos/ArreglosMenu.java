package mx.edu.uttt.arreglos;

import mx.edu.uttt.arreglos.matrices.Matrices;
import mx.edu.uttt.arreglos.vectores.Vectores;
import mx.edu.uttt.menu.Menu;

import javax.swing.*;
import java.util.Arrays;

public class ArreglosMenu {
    private static Vectores objVector;
    private static Matrices objMatriz;

    private static void inicializar (){
        int tamanio = 0;

        do{
            try {
                tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo"));

                objVector = new Vectores(tamanio);

                return;
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "El tamaño debe ser un numero");
            }
        }while (true);
    }

    private static void inicializarMatriz (){
        int fila = 0, columna = 0;

        do{
            try {
                fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de las filas"));
                columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de las columnas"));


                objMatriz = new Matrices(fila, columna);

                return;
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "El tamaño de la columna y/o fila debe ser un numero");
            }
        }while (true);
    }

   public static void mostrar(){

       String opcion = "";

       do{
           opcion = Menu.menuArreglos();

           switch (opcion){
               case "1":
                   menuVectores();
                   break;
               case "2":
                   menuMatrices();
                   break;
               case "0":
                   return;
               default:
                   JOptionPane.showMessageDialog(null, "Opcion no valida");
           }
       }while (true);
   }

   public static int [] obtenerVector (){
        int tamanio = objVector.obtenerTamanio();
        int vector [] = new int[tamanio];

        llenarVector(vector);

        return  vector;
   }

   private static void llenarVector (int [] vector){
        int valor = 0;

       for (int i = 0; i < vector.length; i++) {
           do{
               try {
                   valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + (i+1)));

                   vector [i] = valor;
                   break;
               }catch (NumberFormatException ex){
                   JOptionPane.showMessageDialog(null, "El tamaño debe ser un numero");
               }
           }while (true);
       }
   }

    public static void menuVectores() {
        inicializar();

        String opcion;

        do {
            opcion = Menu.menuVectores();

            switch (opcion) {

                case "1":
                    objVector.agregarValor();
                    JOptionPane.showMessageDialog(null, objVector.imprimir());
                    break;

                case "2":
                    objVector.llenarVector();
                    JOptionPane.showMessageDialog(null, objVector.imprimir());
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "La suma de los datos es: " + objVector.sumarDatos());
                    break;

                case "4":
                    // Arrays.toString regresa un vector de manera legible
                    int[] otroVector = new int[objVector.obtenerTamanio()];

                    for (int i = 0; i < otroVector.length; i++) {
                        otroVector[i] = Integer.parseInt(
                                JOptionPane.showInputDialog("Valor " + (i + 1) + " del otro vector:")
                        );
                    }

                    int[] vectorSuma = objVector.sumarVector(otroVector);

                    JOptionPane.showMessageDialog(null, "Resultado de la suma: " + Arrays.toString(vectorSuma));
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Números pares: " + Arrays.toString(objVector.calcularPares()));
                    break;

                case "6":
                    JOptionPane.showMessageDialog(null, "Números primos: " + Arrays.toString(objVector.calcularPrimos()));
                    break;

                case "7":
                    JOptionPane.showMessageDialog(null, "Promedio: " + objVector.promedio());
                    break;

                case "8":
                    JOptionPane.showMessageDialog(null, "Valor mayor: " + objVector.valorMayor());
                    break;

                case "9":
                    JOptionPane.showMessageDialog(null, "Valor menor: " + objVector.valorMenor());
                    break;

                case "10":
                    int dato = Integer.parseInt(JOptionPane.showInputDialog("¿Qué valor buscas?"));

                    int posicion = objVector.buscarElemento(dato);

                    if (posicion == -1) {
                        JOptionPane.showMessageDialog(null, "El valor " + dato + " no se encuentra en el vector");
                    } else {
                        JOptionPane.showMessageDialog(null, "El valor " + dato + " se encuentra en la posición " + posicion);
                    }
                    break;

                case "0":
                    JOptionPane.showMessageDialog(null, "Regresando al menú");
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        } while (true);
    }

    /*
    * opciones = "=========== MENU MATRICES ========== \n\n" +
                "1) Reserva de Asientos\n" +
                "2) Acumulado de Ventas\n" +
                "3) Matriz identidad\n" +
                "4) Diagonal principal\n" +
                "5) Transposición\n" +
                "6) Rotación\n" +
                "0) Regresar\n" +
                "Seleccione una opción";
    * */

    public static void menuMatrices() {

        // Inicializamos la matriz preguntando filas y columnas
        inicializarMatriz();

        String opcion;

        int fila, columna;

        do {
            opcion = Menu.menuMatrices();

            switch (opcion) {

                case "1":
                    // Reserva de asientos
                    objMatriz.imprimir();
                    fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la fila del asiento:"));

                    columna = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la columna del asiento:"));

                    objMatriz.reservaAsiento(fila, columna);
                    break;

                case "2":
                    // Acumulado de ventas
                    // El método trabaja directamente con la matriz del objeto
                    JOptionPane.showMessageDialog(null, objMatriz.acumuladoVentas());
                    break;

                case "3":
                    // Verificar si la matriz es identidad
                    if (objMatriz.esIdentidad()) {
                        JOptionPane.showMessageDialog(null, "La matriz es identidad"
                        );
                    } else {
                        JOptionPane.showMessageDialog(null, "La matriz NO es identidad");
                    }
                    break;

                case "4":
                    // Suma de la diagonal principal
                    JOptionPane.showMessageDialog(null, "La suma de la diagonal principal es: " + objMatriz.sumaDiagonal());
                    break;

                case "5":
                    // Obtener matriz transpuesta
                    Matrices transpuesta = objMatriz.obtenerTranspuesta();

                    if (transpuesta != null) {
                        JOptionPane.showMessageDialog(null, "Matriz transpuesta:");

                        transpuesta.imprimir();
                    }
                    break;

                case "6":
                    // Rotar matriz 90 grados
                    Matrices rotada = objMatriz.rotar90Horario();

                    if (rotada != null) {
                        JOptionPane.showMessageDialog(null, "Matriz rotada 90 grados:");

                        rotada.imprimir();
                    }
                    break;

                case "0":
                    JOptionPane.showMessageDialog(null, "Regresando al menú");
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        } while (true);
    }
}
