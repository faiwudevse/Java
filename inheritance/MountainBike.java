package com.java.oop.inheritance;

import com.java.oop.inheritance.Bicycle;

public class MountainBike extends Bicycle {

    // Mountain Bike has one more field

    public int seatHeight;

    // Mountain Bike Constructor

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newValue){
        seatHeight = newValue;
    }

    @Override
    public String diplayStats() {
        return super.diplayStats() + "\n seat height is " + seatHeight;
    }
}
