package com.tobiaswadseth.gitlabb2;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void init() {
        System.out.println("Starting tests of Calculator class");
        calculator = new Calculator();
    }

    @AfterAll
    static void end() {
        System.out.println("Finished tests of Calculator class");
    }

    @Test
    @DisplayName("Testing Calculator#add with values [2, 3, 4, 1]")
    void testAddition() {
        Assertions.assertEquals(10, calculator.add( 2, 3, 4, 1 ));
    }

    @Test
    @DisplayName("Testing Calculator#subtract with values [10, 3, 4]")
    void testSubtract() {
        Assertions.assertTrue(calculator.subtract(10, 3, 4) == 3);
    }

    @Test
    @DisplayName("Testing Calculator#subtract with values [10, 7]")
    @Disabled
    void testSubtract2() {
        Assertions.assertEquals(7, calculator.subtract(10, 3));
    }
    @RepeatedTest(3)
    @DisplayName("Testing Calculator#subtract with values [11, 1]")
    void testSubtract3() {
        Assertions.assertEquals(10, calculator.subtract(11, 1));
    }

    @Test
    @DisplayName("Testing Calculator#multiply with values [10, 2, 3]")
    void testMultiply() {
        Assertions.assertNotNull(calculator.multiply(10, 2, 3));
    }

    @Test
    @DisplayName("Testing Calculator#divide with values [12, 2, 3]")
    void testDivision() {
        Assertions.assertEquals(2, calculator.divide(12, 2, 3));
    }
}
