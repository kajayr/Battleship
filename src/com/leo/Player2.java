package com.leo;

public class Player2 {
    String name = "anonymous";
    String[][] map = new String[][]{
            {"","1","2","3","4","5","6","7","8","9"},
            {"1","~","~","~","~","~","~","~","~","~"},
            {"2","~","~","~","~","~","~","~","~","~"},
            {"3","~","~","~","~","~","~","~","~","~"},
            {"4","~","~","~","~","~","~","~","~","~"},
            {"5","~","~","~","~","~","~","~","~","~"},
            {"6","~","~","~","~","~","~","~","~","~"},
            {"7","~","~","~","~","~","~","~","~","~"},
            {"8","~","~","~","~","~","~","~","~","~"},
            {"9","~","~","~","~","~","~","~","~","~"}
    };
    public String[][] getMap() {
        return map;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
