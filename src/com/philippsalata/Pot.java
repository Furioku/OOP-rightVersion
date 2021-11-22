package com.philippsalata;

public class Pot {
    int highest;
    String colour;
    int radius;

    public Pot() {

    }

    public Pot(int radius, int highest) {
        this.radius = radius;
        this.highest = highest;
    }

    public Pot (int highest, int radius, String colour) {
        this.colour = colour;
        this.highest = highest;
        this.radius = radius;
    }

    public String cook() {
        return "Cooking in process";
    }

    public String cook(boolean doWeAddedSolt) {
        if (doWeAddedSolt) {
            return "Cooking with solt";
        } else {
            return "Cooking without solt";
        }
    }

    public int waterBoilingTemperature() {
        return 100;
    }

    public void cookWithoutInfo() {
        turnOnPot();
        cookingDuring30Min();
        turnOffPot();
    }

    public void turnOnPot() {
        System.out.println("Pot turning on ");
    }

    private void cookingDuring30Min() {
        System.out.println("Cooking during 30 minutes");
    }

    private void turnOffPot() {
        System.out.println("Pot is turning off");
    }

}
