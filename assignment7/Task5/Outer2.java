package com.assignments.assignment7.Task5;
//Create a class with an inner class that has a non-default constructor (one that takes arguments).
// Create a second class with an inner class that inherits from the first inner class.
public class Outer2 extends Outer1{

    static class Inner2 extends Outer1.Inner1
    {
        Inner2()
        {
            super("Hii");
        }
    }

    public static void main(String[] args) {
        Outer2.Inner2 inner2=new Outer2.Inner2();
    }
}
