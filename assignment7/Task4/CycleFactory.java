package com.assignments.assignment7.Task4;

import com.assignments.assignment7.Task4.Cycle;

public class CycleFactory {
    public Cycle getInstance(String str)
    {
        if(str.equals("Unicycle"))
        {
            return new Unicycle();
        }
        else if(str.equals("Bicycle"))
        {
            return new Bicycle();
        }
        else
        {
            return new Tricycle();
        }
    }
}
