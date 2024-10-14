package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void triangleBool() {
        assertTrue(Main.TriangleBool(10, 10, 15));
        assertTrue(Main.TriangleBool(1, 1, 1));
    }

    @Test
    void distance() {
        assertEquals(5, Main.Distance(19, 18, 16, 14));
        assertEquals(9.055385138137417, Main.Distance(14, 1, 15, 10));
    }

    @Test
    void powerLoop() {
        assertEquals(16, Main.powerLoop(2, 4));
        assertEquals(0.03125, Main.powerLoop(2, -5));
    }

    @Test
    void power() {
        assertEquals(4096, Main.powerLoop(2, 12));
    }

    @Test
    void tribonacci() {
        assertEquals(5768, Main.tribonacci(18));
    }
}