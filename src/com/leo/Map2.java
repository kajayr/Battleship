package com.leo;

import java.util.Arrays;

public class Map2 extends Player2{
    public void getMap(int firstPoint, int secondPoint, Ship ship, String adjacent) {

        if (adjacent.equals("v")) {
            for (int i = 0; i < ship.getLength(); i++) {
                map[firstPoint + i][secondPoint] = "c";
            }
        } else if (adjacent.equals("h")) {
            for (int i = 0; i < ship.getLength(); i++) {
                map[firstPoint][secondPoint + i] = "c";
            }
        }
        System.out.println(Arrays.deepToString(map).replace("], ", "]\n"));
    }
    public String[][] showMap(){
        // System.out.println(Arrays.deepToString(map).replace("], ", "]\n"));
        return map;
    }
}
