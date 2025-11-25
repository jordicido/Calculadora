import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void pruebaSuma() {
        assertEquals(5, calculadora.sumar(3,2));
    }

    @Test
    public void pruebaResta() {
        assertEquals(13, calculadora.restar(23,10));
    }

    @Test
    public void divisionEntreZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(13.0, 0.0));
    }

    @Test
    public void pruebaDivision() {
        assertEquals(1.0, calculadora.dividir(13,13));
    }

    @Test
    public void pruebaMultiplicacion() {
        assertEquals(25, calculadora.multiplicar(5, 5));
    }
}