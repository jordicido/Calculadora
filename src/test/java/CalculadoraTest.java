import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void pruebaSuma() {
        assertEquals(5,calculadora.sumar(3,2));
    }
}