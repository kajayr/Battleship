package com.leo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubmarieTest {
    Submarie submarie;
    @BeforeEach
    void setUp() {
        submarie = new Submarie();
    }
    @Test
    void shipName(){
        assertEquals("Submarie", submarie.getClass().getName().substring(8), "The Submarie name should be com.leo.BattleShip");
    }
}