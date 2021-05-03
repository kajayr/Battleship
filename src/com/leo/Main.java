package com.leo;

import java.lang.annotation.Target;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        Ship destroyer = new Destroyer();
        Ship submarine = new Submarie();
        Ship cruiser = new Cruiser();
        Ship battleShip = new BattleShip();
        Ship carrier = new Carrier();
        Map1 map1 = new Map1();
        Map2 map2 = new Map2();
        System.out.println("Battleship Multiplayer");
        System.out.println("Enter Player 1 name:");
        String player1Name = scanner.next();
        player1.setName(player1Name);
        System.out.println("Enter Player 2 name:");
        String player2Name = scanner.next();
        player2.setName(player2Name);
//Player 1
        System.out.println(player1.getName() + ", please enter the coordinates for your ships");
for(int i = 0; i < 5; i++){
    Ship ship = null;
    switch (i){
        case 0:
            ship = destroyer;
            break;
        case 1:
            ship = submarine;
            break;
        case 2:
            ship = cruiser;
            break;
        case 3:
            ship = battleShip;
            break;
        case 4:
            ship = carrier;
            break;
    }
    int firstPoint;
    int secondPoint;
    String adjacent;
    while(true){
        System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
        System.out.println("First point: ");
        firstPoint = scanner.nextInt();
        System.out.println("Second point: ");
        secondPoint = scanner.nextInt();
        System.out.println("Place horizontally or vertically (h or v)?");
        adjacent = scanner.next();
        if (adjacent.equals("v")) {
            for (int j = 0; j < ship.getLength(); j++) {
                boolean availableSpots = true;
                while(availableSpots){
                    if(!map1.showMap()[firstPoint + j][secondPoint].equals("~")){
                        System.out.println("That spot is merging other ships. Please choose another vertically point");
                        System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
                        System.out.println("First point: ");
                        firstPoint = scanner.nextInt();
                        System.out.println("Second point: ");
                        secondPoint = scanner.nextInt();
                        map1.showMap()[firstPoint + j][secondPoint] = "~";
                    }else{
                        map1.showMap()[firstPoint + j][secondPoint] = ship.getBoardChar();
                        System.out.println(Arrays.deepToString(map1.showMap()).replace("], ", "]\n"));
                        availableSpots = false;
                    }
                }
            }
        } else if (adjacent.equals("h")) {
            for (int p = 0; p < ship.getLength(); p++) {
                boolean availableSpots = true;
                while(availableSpots){
                    if(!map1.showMap()[firstPoint][secondPoint + p].equals("~")){
                        System.out.println("That spot is merging other ships. Please choose another vertically point");
                        System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
                        System.out.println("First point: ");
                        firstPoint = scanner.nextInt();
                        System.out.println("Second point: ");
                        secondPoint = scanner.nextInt();
                        map1.showMap()[firstPoint][secondPoint + p] = "~";
                    }else{
                        map1.showMap()[firstPoint][secondPoint + p] = ship.getBoardChar();
                        System.out.println(Arrays.deepToString(map1.showMap()).replace("], ", "]\n"));
                        availableSpots = false;
                    }
                }
            }
        }
        ship.setCoordinates(firstPoint, secondPoint);
        break;
    }
    System.out.println(Arrays.deepToString(map1.showMap()).replace("], ", "]\n"));
}
        System.out.println(player2.getName() + ", please enter the coordinates for your ships");
        for(int i = 0; i < 5; i++){
            Ship ship = null;
            switch (i){
                case 0:
                    ship = destroyer;
                    break;
                case 1:
                    ship = submarine;
                    break;
                case 2:
                    ship = cruiser;
                    break;
                case 3:
                    ship = battleShip;
                    break;
                case 4:
                    ship = carrier;
                    break;
            }
            int firstPoint;
            int secondPoint;
            String adjacent;
            while(true){
                System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
                System.out.println("First point: ");
                firstPoint = scanner.nextInt();
                System.out.println("Second point: ");
                secondPoint = scanner.nextInt();
                System.out.println("Place horizontally or vertically (h or v)?");
                adjacent = scanner.next();
                if (adjacent.equals("v")) {
                    for (int j = 0; j < ship.getLength(); j++) {
                        boolean availableSpots = true;
                        while(availableSpots){
                            if(!map2.showMap()[firstPoint + j][secondPoint].equals("~")){
                                System.out.println("That spot is merging other ships. Please choose another vertically point");
                                System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
                                System.out.println("First point: ");
                                firstPoint = scanner.nextInt();
                                System.out.println("Second point: ");
                                secondPoint = scanner.nextInt();
                                map2.showMap()[firstPoint + j][secondPoint] = "~";
                            }else{
                                map2.showMap()[firstPoint + j][secondPoint] = ship.getBoardChar();
                                System.out.println(Arrays.deepToString(map2.showMap()).replace("], ", "]\n"));
                                availableSpots = false;
                            }
                        }
                    }
                } else if (adjacent.equals("h")) {
                    for (int p = 0; p < ship.getLength(); p++) {
                        boolean availableSpots = true;
                        while(availableSpots){
                            if(!map2.showMap()[firstPoint][secondPoint + p].equals("~")){
                                System.out.println("That spot is merging other ships. Please choose another vertically point");
                                System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
                                System.out.println("First point: ");
                                firstPoint = scanner.nextInt();
                                System.out.println("Second point: ");
                                secondPoint = scanner.nextInt();
                                map2.showMap()[firstPoint][secondPoint + p] = "~";
                            }else{
                                map2.showMap()[firstPoint][secondPoint + p] = ship.getBoardChar();
                                System.out.println(Arrays.deepToString(map2.showMap()).replace("], ", "]\n"));
                                availableSpots = false;
                            }
                        }
                    }
                }
                ship.setCoordinates(firstPoint, secondPoint);
                break;
            }
            System.out.println(Arrays.deepToString(map2.showMap()).replace("], ", "]\n"));
        }
// end of Player 2
        TargetMessage targetMessage = new TargetMessage();
        boolean endGame = true;
       while(endGame){
           // Player 2 attack
           System.out.println( player2.getName() +", which spot do you want to target?");
           System.out.println("First point");
           int s2targetPoint1 = scanner.nextInt();
           System.out.println("Second point");
           int s2targetPoint2 = scanner.nextInt();
           String sendMessage = map1.showMap()[s2targetPoint1][s2targetPoint2];
           if(!map1.showMap()[s2targetPoint1][s2targetPoint2].equals("~")){
               map1.showMap()[s2targetPoint1][s2targetPoint2] = "x";
               System.out.println(Arrays.deepToString(map1.showMap()).replace("], ", "]\n"));
               targetMessage.message(sendMessage);
           }else{
               map1.showMap()[s2targetPoint1][s2targetPoint2] = "m";
               System.out.println(Arrays.deepToString(map1.showMap()).replace("], ", "]\n"));
               targetMessage.message(sendMessage);
           }
//           for(int i = 0; i < map1.showMap().length; i++){
//               for(int j = 0; j < map1.showMap().length; j++){
//                   if(!map1.showMap()[i][j].contains("d")){
//                       //&& !map1.showMap()[i][j].equals("s") && !map1.showMap()[i][j].equals("c") && !map1.showMap()[i][j].equals("b") && !map1.showMap()[i][j].equals("C")
//
//                   }
//                   else{
//                       System.out.println(player2.getName() + " destroyed all the ships and WON the game!");
//                       endGame = false;
//                       break;
//                   }
//               }
//           }
           // Player 2 attack ends here
           // Player 1 attack
           System.out.println( player1.getName() +", which spot do you want to target?");
           System.out.println("First point");
           int s1targetPoint1 = scanner.nextInt();
           System.out.println("Second point");
           int s1targetPoint2 = scanner.nextInt();
           sendMessage = map2.showMap()[s1targetPoint1][s1targetPoint2];
           if(!map2.showMap()[s1targetPoint1][s1targetPoint2].equals("~")){
               map2.showMap()[s1targetPoint1][s1targetPoint2] = "x";
               System.out.println(Arrays.deepToString(map2.showMap()).replace("], ", "]\n"));
               targetMessage.message(sendMessage);
           }else{
               map2.showMap()[s1targetPoint1][s1targetPoint2] = "m";
               System.out.println(Arrays.deepToString(map2.showMap()).replace("], ", "]\n"));
               targetMessage.message(sendMessage);
           }
           // Player 1 attack ends here
       }
    }
}