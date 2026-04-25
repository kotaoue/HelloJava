package com.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HelloActionTest {

    private static final List<String> VALID_DICE = Arrays.asList("⚀", "⚁", "⚂", "⚃", "⚄", "⚅");

    @Test
    void execute_returnsSuccess() throws Exception {
        HelloAction action = new HelloAction();
        String result = action.execute();
        assertEquals("success", result);
    }

    @Test
    void execute_setsHelloWorldMessage() throws Exception {
        HelloAction action = new HelloAction();
        action.execute();
        assertEquals("Hello, World!", action.getMessage());
    }

    @Test
    void execute_setsValidDiceEmoji() throws Exception {
        HelloAction action = new HelloAction();
        action.execute();
        assertTrue(VALID_DICE.contains(action.getDice()),
                "Dice should be one of: " + VALID_DICE);
    }
}
