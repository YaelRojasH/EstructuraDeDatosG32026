package mx.edu.uttt.arreglos.vectores;
import javax.swing.*;

public class Vectores {

    // Variable de instancia
    private int[] vector;

    // Constructor
    public Vectores() {
        vector = new int[2];
    }

    public Vectores(int tamanio) {
        if (validarTamanio(tamanio)) {
            vector = new int[tamanio];
        } else {
            vector = new int[2];
        }
    }

    private boolean validarTamanio(int tamanio) {
        return tamanio > 1;
    }

    // Utilidades
    public int obtenerTamanio() {
        return vector.length;
    }

    public int[] obtenerVector() {
        return copiarVector();
    }

    public int[] copiarVector() {
        int[] copiaVector = new int[this.obtenerTamanio()];
        int i = 0;
        for (int valor : this.vector) {
            copiaVector[i] = valor;
            i++;
        }
        return copiaVector;
    }

    // 1) Agregar valor al vector
    // this.vector.length - 1 Para obtener la ultima posicion
    public void agregarValor() {
        int posicion, valor;

        posicion = Integer.parseInt(JOptionPane.showInputDialog("Posición (0 a " + (this.vector.length - 1) + "):"));

        if (posicion >= 0 && posicion < this.vector.length) {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Valor a agregar:"));
            this.vector[posicion] = valor;
        } else {
            JOptionPane.showMessageDialog(null, "Posición inválida");
        }
    }

    // 2) Llenar el vector
    public void llenarVector() {
        int numero;

        for (int i = 0; i < this.vector.length; i++) {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero"));

            if (numero > 0) {
                this.vector[i] = numero;
            } else {
                JOptionPane.showMessageDialog(null, "Invalido");
                i--;
            }
        }
    }

    // 3) Sumar los datos del vector
    public int sumarDatos() {
        int suma = 0;

        for (int valor : this.vector) {
            suma += valor;
        }
        return suma;
    }

    // 4) Sumar los datos del vector de instancia con otro vector
    public int[] sumarVector(int[] otroVector) {
        if (otroVector.length != this.vector.length) {
            JOptionPane.showMessageDialog(null, "Los vectores deben tener el mismo tamaño");
        }

        int[] vectorSuma = new int[this.vector.length];

        for (int i = 0; i < this.vector.length; i++) {
            vectorSuma[i] = this.vector[i] + otroVector[i];
        }
        return vectorSuma;
    }

    // 5) Calcular los pares
    public int[] calcularPares() {
        int cantidadPares = 0;

        for (int numero : this.vector) {
            if (numero % 2 == 0) {
                cantidadPares++;
            }
        }

        int[] pares = new int[cantidadPares];
        int i = 0;

        for (int numero : this.vector) {
            if (numero % 2 == 0) {
                pares[i] = numero;
                i++;
            }
        }
        return pares;
    }

    // 6) Calcular los primos
    public int[] calcularPrimos() {
        int cantidadPrimos = 0;
        for (int numero : this.vector) {
            if (esPrimo(numero)) {
                cantidadPrimos++;
            }
        }

        int[] primos = new int[cantidadPrimos];
        int i = 0;
        for (int numero : this.vector) {
            if (esPrimo(numero)) {
                primos[i] = numero;
                i++;
            }
        }
        return primos;
    }

    private boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 7) Promedio de los valores
    public double promedio() {
        double suma = 0.0;
        for (int numero : this.vector) {
            suma += numero;
        }
        return (double) suma / this.vector.length;
    }

    // 8) Valor mayor
    public int valorMayor() {
        int mayor = this.vector[0];

        for (int numero : this.vector) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    // 9) Valor menor
    public int valorMenor() {
        int menor = this.vector[0];
        for (int numero : this.vector) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    // 10) Buscar un elemento
    public int buscarElemento(int dato) {
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] == dato) {
                return i;
            }
        }
        return -1;
    }

    // Extra: Imprimir
    public String imprimir (){
        String salida = "";

        for(int valor : this.vector){
            salida += valor + " ";
        }

        return salida;
    }
}