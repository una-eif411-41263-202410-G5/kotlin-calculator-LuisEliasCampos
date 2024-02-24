package design.patterns.calculadora

import design.patterns.design.patterns.calculadora.Calculadora

import org.junit.jupiter.api.Test

import kotlin.test.assertEquals

class CalculadoraTest {

    private val calculadora = Calculadora()

    @Test
    fun testSuma(){
        assertEquals(57.0,calculadora.sumar(25.0,32.0),0.0)
    }

    @Test
    fun testResta(){
        assertEquals(20.0,calculadora.restar(25.0,5.0),0.0)
    }

    @Test
    fun testMultiplicacion(){
        assertEquals(10.0,calculadora.multiplicar(5.0,2.0),0.0)
    }

    @Test
    fun testDivision(){
        assertEquals(50.0,calculadora.dividir(100.0,2.0),0.0)
    }
}