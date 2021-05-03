package com.leo;

public interface Ship {
    int length = 0;
    int getLength();
    int getCoordinate1();
    int getCoordinate2();
    void setCoordinates(int coordinate1, int coordinate2);


    void addingShipMessage();
    void destroyedShipMessage();
}
