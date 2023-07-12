package com.epam.mjc.stage0;


public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }


      public String getDescription(){
            String paws = "paw";
            String fur = "no";
        String Paws = Integer.toString(numberOfPaws);
        if(numberOfPaws > 1) paws = "paws";
        if(hasFur) fur = "a";
       String result = "This animal is mostly " + color + ". " + "It has " + Paws +" "+paws + " and " + fur +" fur.";
       return result;
    }




}
