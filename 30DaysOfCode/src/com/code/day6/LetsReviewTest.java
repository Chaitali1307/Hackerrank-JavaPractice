package com.code.day6;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LetsReviewTest {
    public static String printString(String str)
    {
        String se = "";
        String so = "";
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(i==0 || i%2==0)
            {
                se = se+str.charAt(i);
            }
            else if(i%2!=0)
            {
                so = so+str.charAt(i);
            }
        }
        return se+" "+so;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s = sc.nextLine();
            System.out.println(printString(s));
        }
    }
}
