fun main(){
    val numeroEntero : Int =10
    val numeroDecimal : Double =2.5

    val suma = numeroEntero + numeroDecimal
    val resta = numeroEntero - numeroDecimal
    val multiplicacion = numeroEntero * numeroDecimal
    val division = numeroEntero / numeroDecimal

    println("La suma es: $suma")
    println("La resta es: $resta")
    println("La multiplicacion es: $multiplicacion")
    println("La division es: $division")


    println("\n--- PARTE 2: Seguridad ante Nulos ---")

    var miTexto: String? = "Hola a todos"
    println("La longitud del texto es: ${miTexto?.length}")

    miTexto = null
    println("La longitud ahora es: ${miTexto?.length}")



}