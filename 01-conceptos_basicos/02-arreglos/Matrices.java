package mx.edu.uttt.arreglos.matrices;

import javax.swing.*;

public class Matrices {
    //Variable de instancia
    private int [][] m;

    public Matrices (){
        m = new int [2][2];
    }

    public Matrices (int fila, int columna){
        if (validar(fila, columna)){
            this.m = new int [fila][columna];
        } else {
            m = new int [2][2];
        }
    }

    private boolean validar (int fila, int columna){
        boolean valido = true;

        if (fila <= 0 && columna <= 0){
            valido = false;
        }

        return valido;
    }

    private boolean validarTamanos (int [][] m){
        return this.m.length == m.length && this.m[0].length == m[0].length;
    }

    public  void llenarMatriz (int [][] m){
        if (validarTamanos(m)){
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[i].length; j++) {
                    this.m[i][j] = m[i][j];
                }
            }
        } else {
            System.out.println("La matriz no es del mismo tamaño");
        }
    }

    public void imprimir (){
        for (int fila [] : this.m) {
            for(int valor : fila){
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public String obtenerTamanio (){
        return "Tamaño: (" + this.m.length + "," + this.m[0].length + ")";
    }

    /* En una matriz o arreglo bidimensional
    * m.length -> Numero de filas
    * m[0].length O m[m.length - 1]-> Numero de columnas
    * */

    private boolean validarCuadrada(){
        return m.length == m[0].length;
    }

    // 1) Reserva de Asientos

    public void reservaAsiento (int fila, int columna){

        if (fila >= 0 && this.m.length > fila && columna >= 0 && this.m[0].length > columna){
            if (this.m[fila][columna] == 0){
                JOptionPane.showMessageDialog(null, "El asiento esta reservado por ti");
                m[fila][columna] = 1;
            } else {
                JOptionPane.showMessageDialog(null, "Ocupado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Posicion invalida");
        }
    }

    // 2) Acumulado de ventas por sucursal y mes (m*n)
    // m[fila][columna]
    public String acumuladoVentas() {
        String mensaje = "";

        for (int i = 0; i < m.length; i++) {
            int fila = 0;

            for (int j = 0; j < m[0].length; j++) {
                fila += m[i][j];
            }

            mensaje += "Sucursal " + i + ": " + fila + "\n";
        }
        for (int j = 0; j < m[0].length; j++) {
            int columna = 0;

            for (int i = 0; i < m.length; i++) {
                columna += m[i][j];
            }

            mensaje += "Mes " + j + ": " + columna + "\n";
        }

        return mensaje;
    }

    // 3) Diagnostico de matriz identitad y diagonal principal (N*N)
    // Método que verifica si la matriz es una matriz identidad

    public boolean esIdentidad(){
        boolean identidad = true;
        if (validarCuadrada()){
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {

                    if (i == j){
                        if (m[i][j] != 1){
                            identidad = false;
                        }
                    } else {
                        if (m[i][j] != 0){
                            identidad = false;
                        }
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es cuadrada: " + m.length + " , " + m[0].length);
            identidad = false;
        }
        return identidad;
    }


    // Método que calcula la suma de la diagonal principal
    public int sumaDiagonal (){
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i][i];
        }
        return suma;
    }


    // 4) Obtener transpuesta
    public Matrices obtenerTranspuesta(){
        Matrices objMatriz = null;

        if (validarCuadrada()){
            int [][] transpuesta = new int[this.m.length][this.m.length];

            objMatriz = new Matrices(this.m.length, this.m.length);

            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    transpuesta [j][i] = this.m[i][j];
                }
            }
            objMatriz.llenarMatriz(transpuesta);
        } else {
            System.out.println("Advertencia: La matriz no es cuadrada: ");
        }
        return objMatriz;
    }

    // 5) Rotación de la matriz a 90 grados en sentido horario (N x N)
    public Matrices rotar90Horario() {
        Matrices objMatriz = null;

        if (validarCuadrada()){
            int [][] rotada = new int[this.m.length][this.m.length];

            objMatriz = new Matrices(this.m.length, this.m.length);
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    rotada[j][this.m.length - 1 - i] = this.m[i][j];

                }
            }
            objMatriz.llenarMatriz(rotada);
        }
        return objMatriz;
    }
}


