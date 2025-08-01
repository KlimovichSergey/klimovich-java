package by.itacademy.klimovich;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void calculator_create_initialize() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        int actual = calculator.sum(10, 20);
        assertEquals(30, 30, "10 + 20 равно 30");
    }

    @ParameterizedTest
    @CsvSource({
            "-20, -10, -30",
            "20, -10, 10",
            "20,-20, 0"
    })
    @DisplayName("Проверка метода сложения разными аргументами")
    public void testSum(int a, int b, int actual) {
        assertEquals(actual, calculator.sum(a, b));
    }

    @Test
    public void testSubtract() {
        int actual = calculator.sum(20, 10);
        assertEquals(actual, 30, "20 - 10 равно 10");
    }

    @ParameterizedTest
    @CsvSource({
            "-25, -10, -15",
            "20, -10, 30",
            "20,-20, 0",
            "-20, 0, -20"
    })
    @DisplayName("Проверка метода вычетание разными аргументами")
    public void testSubtract(int a, int b, int actual) {
        assertEquals(actual, calculator.subtract(a, b));
    }

    @Test
    public void testDivide() {
        double actual = calculator.divide(10, 2);
        assertEquals(5, actual);
    }

    @Test
    public void testDivideException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    public void testMultiplay() {
        int actual = calculator.multiplay(10, 6);
        assertEquals(60, actual);
    }
}
