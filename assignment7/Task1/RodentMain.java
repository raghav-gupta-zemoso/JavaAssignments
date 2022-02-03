//Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc.
// In the base class, provide methods that are common to all Rodents,
// and override these in the derived classes to perform different behaviors depending on the specific type of Rodent.
// Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens. Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print a message about that class.
package com.assignments.assignment7.Task1;

public class RodentMain {
    public static void main(String[] args) {
        Rodent rodent[]=new Rodent[3];
        rodent[0]=new Mouse();
        rodent[1]=new Gerbil();
        rodent[2]=new Hamster();

        for(int i=0;i<3;i++)
        {
            rodent[i].eat();
            rodent[i].run();
        }
    }
}
