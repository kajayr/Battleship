package com.leo;

public class TargetMessage {
    public void message(String str){
        System.out.println("the entry value to targetMessage is: " + str);
        switch (str){
            case "~":
                System.out.println("You missed the shot");
                break;
            case "d":
                System.out.println("You have successfully shot a Destroyer!");
                break;
            case "s":
                System.out.println("You have successfully shot a Submarine");
                break;
            case "c":
                System.out.println("You have successfully shot a Cruiser");
                break;
            case "b":
                System.out.println("You have successfully shot a BattleShip");
                break;
            case "C":
                System.out.println("You have successfully shot a Carrier");
                break;
            default:
                System.out.println("There is no result");
        }
    }
}
