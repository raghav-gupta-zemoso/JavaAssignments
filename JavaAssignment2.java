package com.assignments;

import java.util.Locale;
import java.util.Scanner;
//Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
// Write time and space complexity of your solution as comments in the source file.
public class JavaAssignment2 {

    static boolean checkString(String s)
    {
        s=s.toLowerCase();
        boolean visited[]=new boolean[26];
        boolean flag=true;

        for(int i=0;i<s.length();i++)   //time complexity depends on length of string o(n)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                visited[ s.charAt(i) - 'a']=true;
            }
            else
            {
                flag=false;
                return flag;
            }
        }

        for(int i=0;i<26;i++)  // length of loop is 26 so time complexity o(26) which is also o(n);
        {
            if(!visited[i])
                return false;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        if(checkString(str))
        {
            System.out.println("string contain all the letters of the alphabet a-z");
        }
        else
        System.out.println("does not contain all letters of alphabet");
    }
}
