package com.chitkara.day52;
// Define Car class with public fields
class hi{
    public String make;
    public int year;
}

public class car {
    public static void main(String[] args) {
        // Create a Car object
        hi myCar = new hi();

        // Assign values to the fields
        myCar.make = "Toyota";
        myCar.year = 2023;

        // Print the car details
        System.out.println("Car Details:");
        System.out.println("Make: " + myCar.make);
        System.out.println("Year: " + myCar.year);
    }
}