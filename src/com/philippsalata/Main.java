package com.philippsalata;

public class Main {

    public static void main(String[] args) {

        /*Pot pot = new Pot(44, 4);

        String notification = pot.cook();
        System.out.println(notification);

        String doWeAddedSolt = pot.cook(true);
        System.out.println(doWeAddedSolt);

        int waterBoilingTemperature = pot.waterBoilingTemperature();
        System.out.println(waterBoilingTemperature);

        pot.cookWithoutInfo();
        pot.turnOnPot();*/
        //User philipp = new User(22);

        User mari = new User(16, "Mari");


        if (mari.canUserByeAlco()) {
            System.out.println("Can bye alco");
        } else {
            System.out.println("Can not bye alco");
        }




        /*Pot pot = new Pot();

        pot.radius = 7;
        pot.highest = 5;
        pot.colour = "Silver";

        System.out.println(pot.colour);
        System.out.println(pot.highest);
        System.out.println(pot.radius);*/

        /*Pot pot = new Pot(7, 5, "Silver");

        System.out.println(pot.colour);
        System.out.println(pot.highest);
        System.out.println(pot.radius);*/

    }
}
