package design.patterns.design.patterns.calculadora

class Calculadora {

    fun sumar (a: Double, b: Double):Double{
        return a + b
    }
    fun restar (a: Double, b: Double):Double{
        return a - b
    }
    fun multiplicar (a: Double, b: Double):Double{
        return a * b
    }
    fun dividir (a: Double, b: Double):Double{
        if (b == 0.0) {
            println("la division no se puede efectuar")
        }
        return a / b
    }
}