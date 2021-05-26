package com.leo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CruiserTest {
    Cruiser cruiser;
    @BeforeEach
    void setUp() {
        cruiser = new Cruiser();
    }
    @Test
    void shipName(){
        assertEquals("Cruiser", cruiser.getClass().getName().substring(8), "The Cruiser name should be com.leo.BattleShip");
    }
}