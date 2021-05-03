package com.leo;

public class Submarie implements Ship{
    int length = 3;
    private int coordinate1;
    private int coordinate2;
    @Override
    public void addingShipMessage(){
        System.out.println("The " + this.getClass().getSimpleName() + " had added to the board");
    }
    @Override
    public void destroyedShipMessage(){
        System.out.println("The " + this.getClass().getSimpleName() + " is destroyed!");
    }
    @Override
    public int getCoordinate1(){
        return this.coordinate1;
    }
    @Override
    public int getCoordinate2(){
        return this.coordinate2;
    }
    @Override
    public int getLength(){
        return this.length;
    }
    @Override
    public void setCoordinates(int coordinate1, int coordinate2){
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }
}
