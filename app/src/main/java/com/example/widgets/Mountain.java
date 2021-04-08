package com.example.widgets;

public class Mountain {
    private String name;

    Mountain(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
