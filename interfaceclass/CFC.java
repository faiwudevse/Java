package com.java.oop.interfaceclass;

public class CFC {
    public static void useInterface(){
        Shape rect = new Rectangle(2,3);
        System.out.println("Area of rectangle: " + rect.area());

        Shape circle = new Circle(2);
        System.out.println("Area of circle: " + circle.area());
    }
}
