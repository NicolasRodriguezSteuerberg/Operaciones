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

---
---
***PARTE DEL EXAMEN***

### METODO AÑADIDO:

En el examen se nos pide crear un nuevo metodo para calcular raices, por lo que creando una rama raices cree el método raices. Para calcular las raices utilice el **Math.pow(base, expoñente)**. Las raices son un expoñente siendo la raiz cuadrada 2 elevado a ½, siguiendo esto en el expoñente dividi 1 entre el numero recibido.


### PARAMETROS AÑADIDO:

Para poder usar en la main la raiz creé en la clase OperacionesBasicas una variable RAICES que la igualé al numero 5. De esta manera en la main si le damos la opción numero 5 haremos una raiz

### FINALIZACIÓN PROYECTO:

Al tener todo funcionando habia que juntar la rama ___raices___ a la ___main___. En este caso utilice el merge squash ya que me lo pediá el enunciado. Una vez finalizado el merge squash me di cuenta que en el metodo raiz habia puesto al revés los datos, así que lo corregí. *Con esto solo me faltaba crear una nueva ___release___ con el nuevo jar del proyecto*.

### RECORDATORIO DE CREAR UN JAR Y UNA RELEASE:

> Para la creación del jar, en mi caso al utilizar IntelliJ, hay que ir: -file
-project structure
-artifacts
- + jar  from modules with dependeces
Al hacer esto aplicamos y seguimos los siguientes pasos:
-Build
-Build artifacts
-Build

---

> Para la creación de la release hay que tener en cuenta que hay que tener una etiqueta, por si no sabes como subirla te dejo aquí los pasos:
-git tag nombreEtiqueta. En mi caso la llame OperacionesConRaiz
-git push origin --tags. De esta manera subes todas las etiquetas que tengas
Teniendo la etiqueta subida procederemos a realizar la release desde el repositorio de github:
-Vamos a tags
-Releases
-Draft a new release
-Escogemos la etiqueta
-Ponemos una descripcion(opcional)
-Y en _Attach binaries by dropping them here or selecting them_ arrastramos nuestro jar
-Publish release

