package com.leo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrierTest {
    Carrier carrier;
    @BeforeEach
    void setUp() {
        carrier = new Carrier();
    }
    @Test
    void shipName(){
        assertEquals("Carrier", carrier.getClass().getName().substring(8), "The Carrier name should be com.leo.BattleShip");
    }

}