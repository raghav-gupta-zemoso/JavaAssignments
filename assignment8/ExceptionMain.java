package com.assignments.assignment8;
//Create three new types of exceptions. Write a class with a method that throws all three. In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
// Add a finally clause and verify that your finally clause is executed
public class ExceptionMain {
    public static void checkName(String str) throws NameException
    {
        if(!(str.equals(str.toUpperCase())))
        {
            throw new NameException("please write name in upper case");
        }
        else
        {
            System.out.println("name is in right format");
        }
    }
    public static void checkAge(int age ) throws AgeException
    {
        if(age <18 )
        {
            throw new AgeException("you are not eligible to watch this web series");
        }
        else
        {
            System.out.println("Go Ahead");
        }
    }
    public static void checkDiv(int x,int y ) throws CalcException{
        if(y==0)
        {
            throw new CalcException("number cannot divisible by 0");
        }
        else
        {
            System.out.println(x/y);
        }
    }
    public static void main(String[] args) {
        try {
            checkName("raghav");
        } catch (NameException e) {
            e.printStackTrace();
        }

        try {
            checkAge(18);
        } catch (AgeException e) {
            e.printStackTrace();
        }
        try {
            checkDiv(25,0);
        } catch (CalcException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("always executed");
        }
    }
}
