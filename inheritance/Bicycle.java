package com.java.oop.inheritance;

public class Bicycle {

    // declare two public fields
    public int gear;
    public int speed;

    // declare the constructor
    public Bicycle (int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    // declare three methods

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed -= increment;
    }


    public String diplayStats() {
        return ("No of gear is: " + gear + "\n" + "speed of bicycle is: " + speed);
    }
}
