package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OddEvenTest {

    private final OddEven oddEven = new OddEven();

    @Test
    void isOdd_withOddNumber_returnsTrue() {
        assertTrue(oddEven.isOdd(1));
        assertTrue(oddEven.isOdd(3));
        assertTrue(oddEven.isOdd(-7));
    }

    @Test
    void isOdd_withEvenNumber_returnsFalse() {
        assertFalse(oddEven.isOdd(2));
        assertFalse(oddEven.isOdd(4));
        assertFalse(oddEven.isOdd(0));
    }

    @Test
    void isEven_withEvenNumber_returnsTrue() {
        assertTrue(oddEven.isEven(0));
        assertTrue(oddEven.isEven(2));
        assertTrue(oddEven.isEven(-4));
    }

    @Test
    void isEven_withOddNumber_returnsFalse() {
        assertFalse(oddEven.isEven(1));
        assertFalse(oddEven.isEven(3));
        assertFalse(oddEven.isEven(-5));
    }
}
