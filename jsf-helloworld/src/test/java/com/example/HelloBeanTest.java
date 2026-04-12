package com.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HelloBeanTest {

    private static final List<String> VALID_DICE = Arrays.asList("⚀", "⚁", "⚂", "⚃", "⚄", "⚅");

    @Test
    void init_setsMessage() {
        HelloBean bean = new HelloBean();
        bean.init();
        assertEquals("Hello, World!", bean.getMessage());
    }

    @Test
    void init_setsDice() {
        HelloBean bean = new HelloBean();
        bean.init();
        assertNotNull(bean.getDice());
        assertTrue(VALID_DICE.contains(bean.getDice()));
    }

    @Test
    void init_diceIsRandom() {
        boolean different = false;
        String first = null;
        for (int i = 0; i < 20; i++) {
            HelloBean bean = new HelloBean();
            bean.init();
            if (first == null) {
                first = bean.getDice();
            } else if (!first.equals(bean.getDice())) {
                different = true;
                break;
            }
        }
        assertTrue(different, "dice should vary across calls");
    }
}
