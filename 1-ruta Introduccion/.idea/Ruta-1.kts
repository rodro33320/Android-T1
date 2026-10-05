/**
 * ==========================================================================
 * ANDROID BASICS CON COMPOSE - UNIDAD 1, RUTA 1: INTRODUCCIÓN A KOTLIN
 * ==========================================================================
 * IMPORTANTE: Kotlin solo permite UNA función main() por archivo.
 * Este documento junta TODO tu progreso como referencia y respaldo,
 * pero cada bloque marcado con "SCRATCH #" debe copiarse y ejecutarse
 * POR SEPARADO en el Kotlin Playground (play.kotlinlang.org).
 * ==========================================================================
 */


// ==========================================================================
// RUTA: Codelab "Tu primer programa en Kotlin"
// SCRATCH 1 - Hello World + comentarios
// ==========================================================================

fun main() {
    // Programa básico de introducción
    println("Hello, world!")

    // Comentario de una línea
    println("Hola") // también puede ir al final de una línea

    /*
      Comentario de varias líneas
    */
    println("Chao")
}



// ==========================================================================
// RUTA: Codelab "Crea y usa variables en Kotlin"
// SCRATCH 2 - Actualización de variables (val vs var)
// ==========================================================================

fun main() {
    var cartTotal = 0
    println("Total: $cartTotal")

    cartTotal = 20
    println("Total: $cartTotal")
}


// SCRATCH 3 - Operadores de incremento/disminución

fun main() {
    var count = 10
    println("You have $count unread messages.")
    count++
    println("You have $count unread messages.")
    count--
    println("You have $count unread messages.")
}


// SCRATCH 4 - Tipos de datos: Double, String, Boolean

fun main() {
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)

    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
}



// ==========================================================================
// RUTA: Codelab "Cómo crear y usar funciones en Kotlin"
// SCRATCH 5 - Función birthdayGreeting() completa
// (parámetros, retorno de String, argumentos con nombre y predeterminados)
// ==========================================================================

fun main() {
    // Llamadas usando argumentos posicionales y con nombre
    println(birthdayGreeting(name = "Rover", age = 5))
    println(birthdayGreeting("Rex", 2))
    println(birthdayGreeting(name = "Rex", age = 2))
    println(birthdayGreeting(age = 2, name = "Rex"))

    // Llamadas usando el valor por defecto del parámetro 'name'
    println(birthdayGreeting(age = 5))
    println(birthdayGreeting(age = 2))
}

// Función que genera un mensaje de cumpleaños usando un parámetro con valor por defecto
fun birthdayGreeting(name: String = "Rover", age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}


// ==========================================================================
// RUTA: Codelab "Práctica: Conceptos básicos de Kotlin"
// (10 ejercicios - cada uno va en su propio scratch)
// ==========================================================================

// --------------------------------------------------------------------------
// SCRATCH 6 - Ejercicio 2: Impresión de mensajes
// --------------------------------------------------------------------------

fun main() {
    // Imprime cada mensaje en una línea separada usando println()
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}


// --------------------------------------------------------------------------
// SCRATCH 7 - Ejercicio 3: Corrección de un error de compilación
// --------------------------------------------------------------------------

fun main() {
    // Error original: comilla simple en vez de doble al cerrar el string,
    // y llave '}' en vez de paréntesis ')' al cerrar println()
    println("New chat message from a friend")
}



// --------------------------------------------------------------------------
// SCRATCH 8 - Ejercicio 4: Plantillas de cadenas
// --------------------------------------------------------------------------

fun main() {
    // discountPercentage e item son de solo lectura (val), no se reasignan.
    val discountPercentage = 20
    val item = "Google Chromecast"

    // "offer" usa una plantilla de cadena: $discountPercentage y $item
    val offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}


// --------------------------------------------------------------------------
// SCRATCH 9 - Ejercicio 5: Concatenación de cadenas
// --------------------------------------------------------------------------

fun main() {
    // Sin comillas: son Int, no String. Así + suma en vez de concatenar texto.
    val numberOfAdults = 20
    val numberOfKids = 30

    val total = numberOfAdults + numberOfKids // 20 + 30 = 50
    println("The total party size is: $total")
}


// --------------------------------------------------------------------------
// SCRATCH 10 - Ejercicio 6: Formato de mensajes
// --------------------------------------------------------------------------

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000

    // "$baseSalary + $bonusAmount" es una plantilla de cadena:
    // primero se evalúa cada variable y LUEGO se concatena como texto.
    // Resultado: el string literal "5000 + 1000" (no la suma 6000).
    val totalSalary = "$baseSalary + $bonusAmount"

    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}


// --------------------------------------------------------------------------
// SCRATCH 11 - Ejercicio 7: Operaciones matemáticas básicas (add / subtract)
// --------------------------------------------------------------------------

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}


// --------------------------------------------------------------------------
// SCRATCH 12 - Ejercicio 8: Parámetros predeterminados (alerta de Gmail)
// --------------------------------------------------------------------------

fun main() {
    val firstUserEmailId = "user_one@gmail.com"
    // No pasamos operatingSystem, así que usa el valor predeterminado "Unknown OS"
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}


// --------------------------------------------------------------------------
// SCRATCH 13 - Ejercicio 9: Podómetro (buenas prácticas de nombres)
// --------------------------------------------------------------------------

fun main() {
    // Nombres en camelCase
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}


// --------------------------------------------------------------------------
// SCRATCH 14 - Ejercicio 10: Comparación de dos números
// --------------------------------------------------------------------------

fun main() {
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}") // true
    println("Have I spent more time using my phone today: ${compareTime(300, 300)}") // false
    println("Have I spent more time using my phone today: ${compareTime(200, 220)}") // false
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}


// --------------------------------------------------------------------------
// SCRATCH 15 - Ejercicio 11: Mover código duplicado a una función (clima)
// --------------------------------------------------------------------------

fun main() {
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}

