

// Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one
package com.assignments.assignment6;

public class Task2 {

    public Task2() {
        this(2);
        System.out.println("Hi I am in constructor 1");
    }
    public Task2(int var)
    {
        System.out.println("Hi I am in constructor "+var);
    }

    public static void main(String[] args) {
        Task2 ob=new Task2();
//        output:
//        Hi I am in constructor 2
//        Hi I am in constructor 1
    }
}
