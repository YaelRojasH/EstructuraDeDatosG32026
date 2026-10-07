# Ejercicios con Matrices

1. Objetivos: Aplicar la logica de arreglos bidimensionales (tambien conocidos como matrices) en JAVA utilizando el paradigma de Prorgamacion Orientada a Objetos (POO) implementando validaciones de dimensiones, recorrido de indices y encapsulacion.

## Ejercicio 1

Sistema de reserva de asientos: 

Diseña un metodo que se llame `reserva de asiento (int fila, int columna)` debe de recibir la fila y la columna, que controle el mapa de ocupacion de un teatro o sala, la matriz iniciara con 0 y eso significa libre, si el asiento solicitado contiene 0 cambialo osea *ocupado* [Es imprimir antes la matriz] y muestre un mensaje de exito. Si el asiento ya contiene 1, se debe indicar que esta ocupado. validar que las coordenadas ingresadas no excedan los limites de la matriz.

Se debe saber antes de que tamaño es la matriz. M*N

## Ejercicio 2 

Acumulado de ventas por sucursal y mes (m*n):
Una empresa registra las ventas enteras de N sucursales en M meses.

1. Implementar un metodo que calcule la suma por cada fila (total por sucursal) [Fila]
2. Calcular la suma por cada columna (total por mes) [Columna]
3. Genera un reporte formateado que muestre ambos totales en un solo panel de texto.

## Ejercicio 3

Diagnostico de matriz identitad y diagonal principal (N*N):

Implementa un modulo para analizis algebraico:

1. **Validacion previa:** Comprueba que la matriz es cuadrada, si no lo es, cancela la operación y muestra un mensaje de advertencia.
2. Si es cuadrada, evalua si es una **matriz identidad** (Unos en la diagonal principal y ceros en el resto)

[1 , 0 , 0]

[0 , 1 , 0]

[0 , 0 , 1]

3. Calcula e imprime la suma de los elementos de la diagonal 

## Ejercicio 4

Transposicion dinamica de matriz (M*N -> N*M):

Crea un metodo de `obtener transpuesta` que invierta la orientacion de los datos:

1. La funcion debe de retornar una nueva instancia de la clase matriz con dimensiones invertidas (N X M)
2. Copia cada elemento siguiendo la regla de transposicion (tranpuesta [j][i] = original [i][j])

## Ejercicio 5

Rotacion de la matriz a 90 grados en sentido horario (N X N)

Simula el giro de una matriz cuadrada de pixeles o mapa:

1. **Validacion previa:** Verifica que la matriz es estrictamente cuadrada
2. Retorna una nueva instancia de matriz rotada 90º a la derecha