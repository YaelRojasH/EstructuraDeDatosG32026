package mx.edu.uttt.recursividad;

public class Recursividad {
    public static void saludar1(int n){

        // Caso base

        if (n == 1){
            System.out.println("Hola saludo " + n);
        } else {
            //Caso general
            saludar1(n-1);
            System.out.println("Hola saludo " + n);
        }
    }

    public static void saludar2(int n){
        //Caso general
        if (n != 1){
            saludar1(n-1);
            System.out.println("Hola saludo " + n);
        } else {
            // Caso base
            System.out.println("Hola saludo " + n);
        }
    }

    public static void saludar3(int n){
        if(n == 0){
            return;
        } else {
            saludar3(n - 1);
            System.out.println("Hola saludo " + n);
        }
    }


    public static int multipliacionSuma(int x, int y){
        if (y == 0){
            return 0;
        } else {
            return x + multipliacionSuma(x, y - 1);
        }
    }


    // EJERCICIO 1
    
    public int sumarN(int n) {

        // Caso base
        if (n == 1) {
            return 1;
        }
        return n + sumarN(n - 1);
    }


    // EJERCICIO 2

    public int factorial(int n) {

        // Caso base
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }


    // EJERCICIO 3

    public int multiplicar(int numero, int veces) {

        // Caso base
        if (veces == 0) {
            return 0;
        }
        return numero + multiplicar(numero, veces - 1);
    }


    // EJERCICIO 4

    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }
}
