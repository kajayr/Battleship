package com.leo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleShipTest {
    BattleShip battleShip;
    @BeforeEach
    void setUp() {
        battleShip = new BattleShip();
    }
    @Test
    void shipLength(){
    assertEquals(4, battleShip.length, "The Battleship length should be 4");
}

    @Test
    void coordnate1(){
        assertEquals(0, battleShip.getCoordinate1(), "The Battleship coordnate1 should be 0");
    }

    @Test
    void coordnate2(){
        assertEquals(0, battleShip.getCoordinate2(), "The Battleship coordnate2 should be 0");
    }

    @Test
    void shipName(){
        assertEquals("BattleShip", battleShip.getClass().getName().substring(8), "The Batthleship name should be com.leo.BattleShip");
    }
}