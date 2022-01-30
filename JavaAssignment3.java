package com.assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaAssignment3 {

    public static void pingIp(String ip)
    {
        try {

            Process p = Runtime.getRuntime().exec(ip);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String s = inputStream.readLine();

            while ( (s = inputStream.readLine())!= null)
            {
                System.out.println(s);
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        pingIp("ping "+"www.facebook.com");
    }
}
