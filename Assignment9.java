package com.assignments;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Using the documentation for java.util.regex.Pattern as a resource,
// write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
public class Assignment9 {
    public static void checkString(String string)
    {

        String regexPattern="[A-Z].*[.]";
        boolean flag=Pattern.matches(regexPattern, string);
        if(flag)
        {
            System.out.print("String match with regular expression");
        }
        else
        {
            System.out.print("String not match with regular expression");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        checkString(string);
    }
}
