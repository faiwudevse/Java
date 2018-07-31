package com.java.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inheritanceDemo();
    }

    public static void inheritanceDemo() {

        // the advantage of using inhereitance is reusability.
        // when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class.

        Bicycle bicycle = new Bicycle(5,5);
        System.out.println(bicycle.diplayStats());

        System.out.println("");
        MountainBike mb = new MountainBike(5,5,5);
        System.out.print(mb.diplayStats());
    }
}
