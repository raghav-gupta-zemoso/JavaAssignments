package com.assignments.assignment7.Task2;
//Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
// Create instances of all three types and upcast them to an array of Cycle.
// Try to call balance( ) on each element of the array and observe the results.
// Downcast and call balance( ) and observe what happens.
public class CycleMain {
    public static void main(String[] args) {
        Cycle[] cycles=new Cycle[3];
        cycles[0]=new Unicycle();
        cycles[1]=new Bicycle();
        cycles[2]=new Tricycle();

//      upcast
        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();

//      Downcast
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Tricycle)cycles[2]).balance();

// output: this is balance method of Unicycle class
//this is balance method of Bicycle class
//this is balance method of cycle class
//this is balance method of Unicycle class
//this is balance method of Bicycle class
//this is balance method of cycle class
    }

}
