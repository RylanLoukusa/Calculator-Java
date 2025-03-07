package com.houarizegai.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.houarizegai.calculator.util.CalculatorLogic;

class CalculatorLogicTest {

    @Test
    void testAddition() {
        assertEquals(8, CalculatorLogic.calculate(5, 3, '+'));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, CalculatorLogic.calculate(5, 3, '-'));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, CalculatorLogic.calculate(5, 3, '*'));
    }

    @Test
    void testDivision() {
        assertEquals(2, CalculatorLogic.calculate(10, 5, '/'));
    }

    @Test
    void testModulo() {
        assertEquals(2, CalculatorLogic.calculate(8, 3, '%'));
    }

    @Test
    void testExponentiation() {
        assertEquals(25, CalculatorLogic.calculate(5, 2, '^'));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            CalculatorLogic.calculate(5, 0, '/');
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculatorLogic.calculate(5, 2, '?');
        });
        assertEquals("Invalid operator: ?", exception.getMessage());
    }
}
