package com.gdstruc.otie.module4;

public class Player {

    private String name;

    public Player( String name)
    {

        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Player{" +
                ", name='" + name + '\'' +
                '}';
    }


}