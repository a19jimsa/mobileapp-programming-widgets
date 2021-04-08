package com.example.widgets;

public class Mountain {
    private String name;
    private String location;
    private int height;

    Mountain(String name){
        this.name = name;
    }

    Mountain(String name, String location, int height){
        this.name = name;
        this.location = location;
        this.height = height;
    }

    @Override
    public String toString(){
        return name;
    }
}
