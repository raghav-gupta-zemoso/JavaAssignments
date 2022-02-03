package com.assignments.assignment7.Task3;
//Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method.
// Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods,
// each of which takes one of the four interfaces as an argument. In main( ),
// create an object of your class and pass it to each of the methods.
public class MyCalculator {
    public void add(double x, double y)
    {
        double result = x + y;
        printResult(result);
    }

    public void subtract(double x, double y)
    {
        double result = x - y;
        printResult(result);
    }


    public void multiply(double x, double y)
    {
        double result = x * y;
        printResult(result);
    }

    public void divide(double x, double y)
    {
        double result = x / y;
        printResult(result);
    }

    public void printResult(double result)
    {
        System.out.println("The result is : " + result);
    }

    public static void main(String[] args) {
        MyCalculator c = new MyCalculator();
        c.add(5, 10);
        c.subtract(35, 15);
        c.multiply(6, 9);
        c.divide(45, 6);
    }
}
