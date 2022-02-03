package com.assignments;
import java.util.*;
import java.io.File;
//Create a java program to search through the home directory and look for files that match a regular expression.
// The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
public class JavaAssignment1 {

    public static void findFile()
    {


        File file = new File("E://");


        String fileNameInput ;


        Scanner sc = new Scanner(System.in);


        do{
            int flag =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");


            fileNameInput =sc.nextLine();


            String[] files = file.list();


            for (String string : files)
            {

                Boolean str1 = fileNameInput.equals(string);


                if (str1){
                    flag = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);

                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }

            if(flag == 0)
            {
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while(true);
    }
    public static void main(String[] args) {
        findFile();
    }
}
