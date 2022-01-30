package com.assignments;
import java.util.*;
import java.io.File;
public class JavaAssignment1 {

    public static void findFile()
    {

        // address of files or folder where to search
        File file = new File("E://");

        //string to store the name of the file
        String fileNameInput ;

        //  Scanner is declare
        Scanner sc = new Scanner(System.in);

        // do while is used to run the program repeatedly
        do{
            int flag =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");

            //take input
            fileNameInput =sc.nextLine();

            //list of file is stored in string
            String[] files = file.list();

            //continous check each file or folder
            for (String string : files)
            {
                //check the name of file present or not and store in boolean str1
                Boolean str1 = fileNameInput.equals(string);

                // str1 is true than print the following
                if (str1){
                    flag = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            //if file not found
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
