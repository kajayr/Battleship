package com.leo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DestroyerTest {
    Destroyer destroyer;
    @BeforeEach
    void setUp() {
        destroyer = new Destroyer();
    }
    @Test
    void shipName(){
        assertEquals("Destroyer", destroyer.getClass().getName().substring(8), "The Destroyer name should be com.leo.BattleShip");
    }
}