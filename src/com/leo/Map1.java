package com.leo;

import java.util.Arrays;
import java.util.Scanner;

public class Map1 extends Player1 {
    public void enterData(Ship ship, Map1 map1){

    }
    public void getMap(Ship ship, Map1 map1) {

//        int firstPoint;
//        int secondPoint;
//        String adjacent;
//        boolean pass = ship.getClass().getSimpleName().equals("Carrier") && ship.getCoordinate2() != 0;
//        while(!pass){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
//            System.out.println("First point: ");
//            firstPoint = scanner.nextInt();
//            System.out.println("Second point: ");
//            secondPoint = scanner.nextInt();
//            System.out.println("Place horizontally or vertically (h or v)?");
//            adjacent = scanner.next();
//            if (adjacent.equals("v")) {
//                for (int i = 0; i < ship.getLength(); i++) {
//                    boolean availableSpots = true;
//                    while(availableSpots){
//                        if(!map[firstPoint + i][secondPoint].equals("~")){
//                            System.out.println("That spot is merging other ships");
//                            System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
//                            System.out.println("First point: ");
//                            firstPoint = scanner.nextInt();
//                            System.out.println("Second point: ");
//                            secondPoint = scanner.nextInt();
//                            System.out.println("Place horizontally or vertically (h or v)?");
//                            adjacent = scanner.next();
//                        }else{
//                            map[firstPoint + i][secondPoint] = "c";
//                            System.out.println(Arrays.deepToString(map).replace("], ", "]\n"));
//                            pass = ship.getClass().getSimpleName().equals("Carrier") && ship.getCoordinate2() != 0;
//                            availableSpots = false;
//                        }
//                    }
//                }
//            } else if (adjacent.equals("h")) {
//                for (int i = 0; i < ship.getLength(); i++) {
//                    map[firstPoint][secondPoint + i] = "c";
//                   System.out.println(Arrays.deepToString(map).replace("], ", "]\n"));
//                }
//            }
//            ship.setCoordinates(firstPoint, secondPoint);
//        }
//        System.out.println(Arrays.deepToString(map).replace("], ", "]\n"));
    }
    public String[][] showMap(){
       // System.out.println(Arrays.deepToString(map).replace("], ", "]\n"));
        return map;
    }
}