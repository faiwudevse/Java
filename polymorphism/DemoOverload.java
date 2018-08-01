package com.java.oop.polymorphism;

// Static Polymorphism
public class DemoOverload {

    public int add (int x, int y){
        System.out.println("Method 1");
        return x+y;
    }

    public int add (int x, int  y, int z){
        System.out.println("Method 2");
        return x+y+z;
    }

    public int add (double x , int y) {
        System.out.println("Method 3");
        return (int)x + y;
    }

    public int add(int x, double y){
        System.out.println("Method 4");
        return x+(int)y;
    }
}



