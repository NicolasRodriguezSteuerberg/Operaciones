# Calculadora

---
### Procedimiento:

Para el caso de esta 'calculadora', como es obvio, se requiere ingresar: **números** para realizar las operaciones, además de **pedir al usuario** la acción matemática deseada.

Estos datos  no son más que solicitudes de entrada de datos de la clase **Integer**; estas solicitudes fueron importadas de la clase *EntradaSalida* mediante la librería que tiene el mismo nombre (formato JAR).

___File > Project Structure... > Libraries > + > Seleccionar el JAR (EntradaSalida) en la ruta que lo contiene___

---
### Manejo de Errores:

Como es de esperarse, el programa debe estar preparado para reaccionar ante una entrada de información no adecuada para la operación. Para ello se empleó el uso de [excepciones.](https://jarroba.com/excepciones-exception-en-java-con-ejemplos/)

En este caso, capturamos el error en caso de que los valores (clase Integer) para operar fuesen letras (valores nulos), se visualice un mensaje reiterando esta condición.

Ahora bien, para el caso del **resultado** (clase Float), este podía arrojar el error de que sea NaN.

___NaN: significa "no es un número". Se produce "Nan" si una operación de punto flotante tiene algunos parámetros de entrada que hacen que la operación produzca algún resultado indefinido. Por ejemplo, 0,0 dividido por 0,0 no está definido aritméticamente.___

Una manera de comprobar que el resultado produzca este valor (al no ser un error de manera subjetiva), se empleó el método: .isNaN()

*Para saber más de este método, haga click [aquí.](https://www.geeksforgeeks.org/float-isnan-method-in-java-with-examples/)*

---

### Parámetros:

Los parámetros son una forma de intercambiar información con el método, por lo que pueden servir para introducir datos para ejecturar el método (entrada) o para obtener o modificar datos tras su ejecución (salida).

De aquí viene el nombre de la clase/librería que importamos en el siguiente proyecto.

---

***A DESTACAR***

> Los valores a operar y el resultado fueron declarados en la clase a la que pertenecen, de tal manera, poder contar con los métodos que estas clases poseen. Ej: el método para comprobar si el resultado es NaN