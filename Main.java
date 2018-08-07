package com.java.oop;

import com.java.oop.encapsulation.Encapsulate;
import com.java.oop.inheritance.MountainBike;
import com.java.oop.inheritance.Bicycle;
import com.java.oop.interfaceclass.CFC;
import com.java.oop.polymorphism.Car;
import com.java.oop.polymorphism.DemoOverload;
import com.java.oop.polymorphism.MotorBike;
import com.java.oop.polymorphism.Vehicle;
import com.java.oop.abstraction.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //inheritanceDemo();
        //staticPolymorphismDemo();
        //dynamicPolymorphismDemo();
        //abstaractionDemo();
        interfaceDemo();
    }

    // the advantage of using inhereitance is reusability.
    // when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class.
    /*
           Super class, Parent class, base class
           Sub class, Derived class, extended class , child class
     */

    public static void inheritanceDemo() {

        Bicycle bicycle = new Bicycle(5,5);
        System.out.println(bicycle.diplayStats());

        System.out.println("");
        MountainBike mb = new MountainBike(5,5,5);
        System.out.print(mb.diplayStats());
    }

    /*
    The word 'polymorphism' literally means a 'state of having many shapes' or 'the capacity to take on different forms'
    In Java OPP, it describes a language's ability to process objects of various types and classes through a single, uniform interface

     */

    /*
    Static polymorphism in Java is achieved by method overloading
    Compile Time
     */
    public static void staticPolymorphismDemo(){
        DemoOverload demo = new DemoOverload();
        System.out.println(demo.add(2,3));      //method 1 called

        System.out.println(demo.add(2,3,4));    //method 2 called

        System.out.println(demo.add(2,3.4));    //method 4 called

        System.out.println(demo.add(2.5,3));    //method 3 called
    }

    /*
    Dynamic polymorphism in Java is achieved by method overriding

    Run Time

    It allows a class to specify methods that will be common to all of its der
     */
    public  static  void dynamicPolymorphismDemo(){

        Vehicle vh;
        vh = new MotorBike();

        vh.move();

        vh = new Vehicle();

        vh.move();

        vh = new Car();

        vh.move();

        System.out.println("------------------------------");

        Vehicle[] arr = new Vehicle[3];

        Vehicle motorbike = new MotorBike();

        Vehicle vehicle = new Vehicle();

        Vehicle car = new Car();
        arr = new Vehicle[]{motorbike, vehicle, car};
        for (int i= 0; i < arr.length; i++){
            arr[i].move();
        }
    }
    /*
    Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates.
    The data of a class will be hidden from other classes, and can be accessed only through the methods of their current class is known as data hiding.
    advantage
    Data Hiding : The user will have no idea about the inner implementation of the class. It will not be visible to the user that how the class is storing values in the variables.
    He only knows we are passing the values to a setter method and variables are getting initialized with that value.
     */
    public static  void encapsulationDemo() {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " + obj.geekName);

    }

    /*
    Data Abstraction is the property by virtue of which only the essential details are displayed to the user. Data Abstraction may also be defined the process of identifying only the required
  charateristics of an object ignoring the irrelevant details.

    There are situations in which we will want to define a superclass that declares the structure of a given abstraction without providing a complete implementation of every method.
     */
    public static void abstaractionDemo() {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }

    /*
     Interface is also using as abstraction. And it has only allowed abstract method
     An interface is an empty shell. There are only the abstract method
     */
    public static void interfaceDemo(){
        CFC.useInterface();
    }
    /*
    Abstract class
    1. Abstract class can have abstract and non-abstract methods.
    2. Abstract class doesn't support multiple inheritance.
    3. Abstract class can have final, non-final, static and non-static variables.
    4. Abstract class can provide the implementation of interface.

    Interface
    1. Interface can have default, static and abstract methods.
    2. Interface supports multiple inheritance.
    3. Interface has only static and final variables.
    4. Interface can't provide the implementation of abstract class.

     */

    /*
    Final Variable -> To create constant variables
    Final Methods -> Prevent Method Overriding
    Final Classes -> Prevent inheritance
     */

    public  static void finalKeyWordDemo(){

    }


}
