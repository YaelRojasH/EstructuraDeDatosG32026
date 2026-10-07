# Tipos de Datos Abstractos (TDA)

La cental es que no se memorice TDA como una 
definición.

La secuencia para entenderlo:

**problema**=>**datos**=>**operaciones**=>**reglas**=>**abstracción**=>**TDA**=>**implementación**=>**Clase Java**=>**Estrcutra de Datos**

para derspues entrar a lo que una *pila*, *cola*, *lista* y *arboles*

1. Problema:

> Supongamos que tenemos un sistema escolar y queremos manejar estudiantes 

Cada estudiante:

- matricula,
- nombre,
- carrera,
- promedio

Hasta ahora estamos de **datos** 

Pero el programa no solamente necesita almacenar esos datos.
Tambien necesita hacer cosas con ellos:

- registrar un cliente
- consultar sus datos
- cambiar su promedio
- verificar si está aprobado
- mostrar información 

entonces aparece una idea importante:

En prorgamación no soloamente importa **que datos tenemos** sino tambien **qué operaciones podemos hacer con ellos**.

Nota: este es el primer paso hacia un TDA 

2. Dato simple vs algo más complejo

Ya conocemos:

```Java
int edad;
double promedio;
String nombre;
```

Estos tipos de datos ya los conoce Java.

por ejemplo:

`int edad = 20;`

Java sabe:

- Que tipo de valor puede almacenar (números enteros)
- Cuanto espacio de memoria necesita (4 bytes)
- Que operaciones se pueden realizar

Con un int podemos hacer:

```Java
edad + 1;
edad - 1;
edad > 18;
edad ++;
++ edad;
```

Pero si pensamos en:

`Estudiante`

Java originalmente no tiene un tipo llamado **Estudiante**

Necesitamos construirlo 

Aquí comienza a aparecer la idea de **crear nuestros propios tipos de datos**.

3. ¿Qué seria un tipo de dato?

Se puede definir inicialmente así:

> Un tipo de dato define qué valores puede exiatir y que operaciones pueden realizarse con esos valores.

Por ejemplo:

*int*

valores posibles:

-10
0
5
100
2500

Operaciones: Aritméticas y Relaciones

**boolean**

valores posibles:
```
true
false
```

Opersiones: Lógicas y Relaciones