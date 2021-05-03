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
        System.out.println("Battleship Multiplayer");
        System.out.println("Enter Player 1 name:");
        String player1Name = scanner.next();
        player1.setName(player1Name);
        System.out.println("Enter Player 2 name:");
        String player2Name = scanner.next();
        player2.setName(player2Name);
        Map1 map1 = new Map1();
        Map2 map2 = new Map2();
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
map1.getMap(ship, map1 );
//while(true){
//    System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
//    System.out.println("First point: ");
//    int firstPoint = scanner.nextInt();
//    System.out.println("Second point: ");
//    int secondPoint = scanner.nextInt();
//    System.out.println("Place horizontally or vertically (h or v)?");
//    String adjacent = scanner.next();
//    if(map1.showMap()[firstPoint][secondPoint].equals("~")){
//        ship.setCoordinates(firstPoint, secondPoint);
//        map1.getMap(firstPoint, secondPoint, ship, adjacent);
//        break;
//    }else{
//        System.out.println("The chosen coordinates are already filed. Please try again");
//    }
//}
}
//Player 2
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
            System.out.println(player2.getName() + ", please enter the coordinates for your ships");
            System.out.println("Enter the coordinates for the " + ship.getClass().getSimpleName() + ": ");
            System.out.println("First point: ");
            int firstPoint = scanner.nextInt();
            System.out.println("Second point: ");
            int secondPoint = scanner.nextInt();
            System.out.println("Place horizontally or vertically (h or v)?");
            String adjacent = scanner.next();
            ship.setCoordinates(firstPoint, secondPoint);
            map2.getMap(firstPoint, secondPoint, ship, adjacent);
        }
        System.out.println("This is " + player1.getName() + " map:");
        System.out.println(Arrays.deepToString(map1.showMap()).replace("], ", "]\n"));
        System.out.println("This is " + player2.getName() + " map:");
        System.out.println(Arrays.deepToString(map2.showMap()).replace("], ", "]\n"));

    }
}