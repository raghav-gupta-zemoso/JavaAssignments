package com.assignments.assignment7.Task4;

import java.util.Scanner;

//Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
// Create factories for each type of Cycle, and code that uses these factories
public class CyclesMain {
    public static void rideCycle(String str) {

        Cycle c= new CycleFactory().getInstance(str);
        c.ride();
    }
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        rideCycle(sc.next());
    }
}
