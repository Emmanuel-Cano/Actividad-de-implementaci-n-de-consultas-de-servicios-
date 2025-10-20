
## **¿Que es Kotlin?** ##

Es un lenguaje de programación moderno, que fue creado por JetBrains (empresa que hizo IntelliJ IDEA).
Fue presentado en 2011 y en 2017 Google lo declaró el lenguaje oficial para desarrollar aplicaciones Android, junto con Java.
Kotlin es un lenguaje de programación moderno que ayuda a los desarrolladores a aumentar su productividad.
Permite se más conciso y escribir menos LOC para la misma funcionalidad en comparación con otros lenguajes de programación.
Las apps compiladas con Kotlin tiene menos probabilidades de fallas, lo que genera una app más estable y sólida para los usuarios.

---
## **Características de Kotlin**##

- **Moderno y conciso** → Necesitas escribir menos código que en Java para hacer lo mismo.
    
- **Seguro** → Reduce errores comunes, como el famoso **NullPointerException** (“crash por null”).
    
- **Compatible con Java** → Puedes usar código Java y Kotlin en el mismo proyecto sin problemas.
    
- **Multipropósito** → No es solo para Android, también sirve para aplicaciones de escritorio, web, servidores e incluso _multiplataforma_ (Kotlin Multiplatform).


---

Introducción al desarrollo de aplicaciones móviles

fun main(){
println("Hello wold")
}

Kotlin: Partes de una función
Una función es un segmento del programa que realiza una tarea especifica. Tu programa podria tener una o mpas funciones.

Estas son las partes clave necesarias para definir una función:
1. La función necesita un nombre 

---

En kotlin tienen la siguiente estructura:

``` Kotlin
fun Nombre (Entradas){
		Cuerpo
}
```
Una entrada es un dato que necesita una función para cumplir su proposito.

Las funciones de Kotlin debe estar definidas (escritas en el archivo .kt) antes de poder ser llamadas en otra parte del código
Una vez existan pueden llamarlas varias veces usando su nombre y parametros (ejemplo: saludar 3 veces).
``` Kotlin
fun saludar (nombre: Strings){

}
fun main(){
println("3 Saludos:")
saludar("Naul")
saludar("Carlos")
saludar("Chema")

}
```

---
#### **Variables en el lenguaje** ####

¿Por que almacenar el valor en una caja y hacer referencia a ella por si nombre cuando puedes usarlo indirectamente? el PROBLEMA ES QUE CUANDO TU CÓDIGO usa valores directamente en todas las instrucciones, el programa solo funcionara para ese caso especifico.

---


| Tipo de datos en Kotlin | Que tipo de datos puede contener           | Ejemplo de valores literales |
| ----------------------- | ------------------------------------------ | ---------------------------- |
| String                  | Texto                                      | "Hola mundo 233"             |
| Int                     | Número entero                              | 23                           |
| Double                  | Núero decimal                              | 2.0 or 23333.99999           |
| Float                   | Número decimal menos preciso que el double | 5 or 3.456556                |
| Boolean                 | true o false                               | true, false                  |

``` Kotlin
fun main(){
var nombre: String = "Max"
saludar(nombre)
nombre = "Getsai"
saludar(nombre)
}
fun saludar(nombre: String){
println ("Hola $nombre")

}

```


Ejemplo:
``` Kotlin
fun main(){
Val saludo = saludar (nombre2 = "Naul", nombre1 = "Carlos")
println(saludo)
}

fun saludar(nombre1: String, nombre2: String): String{
	return "$nombre1 le dice Hola a $nombre2"
}

```

2. 
``` Kotlin
fun main(){
Val saludo = saludar (nombre2 = "Naul")
println(saludo)
}

fun saludar(nombre1: String = "Kevin", nombre2: String): String{
	return "$nombre1 le dice Hola a $nombre2"
}

```

