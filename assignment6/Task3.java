
//Create a class with a constructor that takes a String argument. During construction, print the argument.
// Create an array of object references to this class, but don’t actually create objects to assign into the array.
// When you run the program, notice whether the initialization messages from the constructor calls are printed.
// Complete the previous exercise by creating objects to attach to the array of references.
package com.assignments.assignment6;

public class Task3 {

    public Task3(String string) {

        System.out.println(string);
    }

    public static void main(String[] args) {
        //create array of object
        Task3 Task3Array[]=new Task3[3];

        //assign object to the array
        Task3Array[0]=new Task3("hii");
        Task3Array[1]=new Task3("hello");
        Task3Array[2]=new Task3("hey");

        //display object data
        for(int i=0;i<Task3Array.length;i++)
        {
            System.out.println(Task3Array[i]);
        }
//        output:
//        hii
//        hello
//        hey
//        com.assignments.Task3@1cd072a9
//        com.assignments.Task3@7c75222b
//        com.assignments.Task3@4c203ea1
    }
}
