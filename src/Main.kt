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

    println("\n--- Parte 3: Lógica condicional con when ---")

    val numeroDia: Int = 4

    val nombreDia = when (numeroDia){
        1-> "Lunes"
        2-> "Martes"
        3-> "Miercoles"
        4-> "Jueves"
        5-> "Viernes"
        6-> "Sábado"
        7-> "Domingo"
        else-> "Número inválido. Debe ser del 1 al 7."
    }
    println("El día número $numeroDia corresponde a $nombreDia")


}