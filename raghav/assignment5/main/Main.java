package raghav.assignment5.main;

import raghav.assignment5.data.InitializationAssignment;
import raghav.assignment5.singleton.Singleton;

public class Main {
    public static void callingOtherClass()
    {
        Singleton ob=new Singleton();
        ob.printString();
//        System.out.println(ob.returnString());
    }
    public static void main(String[] args) {
        InitializationAssignment ob=new InitializationAssignment();
        ob.method1();//output is 0 & character
        ob.method2();//error :variable not initialized
        callingOtherClass();
    }
}
