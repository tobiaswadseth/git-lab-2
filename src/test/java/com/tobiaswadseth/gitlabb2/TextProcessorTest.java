package com.tobiaswadseth.gitlabb2;

import org.junit.jupiter.api.*;
import org.junit.platform.engine.TestExecutionResult;

public class TextProcessorTest {

    private static TextProcessor textProcessor;

    @BeforeAll
    static void init() {
        System.out.println("Starting tests of TextProcessor class");
        textProcessor = new TextProcessor();
    }

    @AfterAll
    static void end() {
        System.out.println("Finished tests of TextProcessor class");
    }

    @Test
    @DisplayName("Testing TextProcessor#reverse with value \"Tobias Wadseth\"")
    void testReverse() {
        Assertions.assertEquals("htesdaW saiboT", textProcessor.reverse("Tobias Wadseth"));
    }

    @Test
    @DisplayName("Testing TextProcessor#upperCase with value \"Tobias Wadseth\"")
    void testUpperCase() {
        Assertions.assertNotNull(textProcessor.upperCase("Tobias Wadseth"));
    }

    @Test
    @DisplayName("Testing TextProcessor#lowerCase with value \"Tobias Wadseth\"")
    void testLowerCase() {
        Assertions.assertNotEquals("TOBIAS WADSETH", textProcessor.lowerCase("Tobias Wadseth"));
    }
}
