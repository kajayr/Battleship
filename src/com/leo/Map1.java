package com.leo;

import java.util.Arrays;
import java.util.Scanner;

public class Map1 extends Player1 {
    public void enterData(Ship ship, Map1 map1){

    }
    public void getMap(Ship ship, Map1 map1) {
        int firstPoint;
        int secondPoint;
        String adjacent;
        while(true){
            System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
            System.out.println("First point: ");
            Scanner scanner = new Scanner(System.in);
            firstPoint = scanner.nextInt();
            System.out.println("Second point: ");
            secondPoint = scanner.nextInt();
            System.out.println("Place horizontally or vertically (h or v)?");
            adjacent = scanner.next();
            if(map1.showMap()[firstPoint][secondPoint].equals("~")){
                ship.setCoordinates(firstPoint, secondPoint);
                break;
            }else{
                System.out.println("The chosen coordinates are already filed. Please try again");
            }
        }
        if (adjacent.equals("v")) {
            for (int i = 0; i < ship.getLength(); i++) {
                if(!map[firstPoint + i][secondPoint].equals("~")){
                    System.out.println("That spot is merging other ships");
                }
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