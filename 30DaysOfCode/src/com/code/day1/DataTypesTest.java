package com.code.day1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypesTest {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        /*int I;
        double D;
        String S;*/

        /* Read and save an integer, double, and String to your variables.*/
        int I = scan.nextInt();
        double D = scan.nextDouble();
        scan.nextLine();
        String S = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        
        System.out.println(i+I);

        /* Print the sum of the double variables on a new line. */
		
        System.out.println(d+D);

        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        System.out.println(s+S);

        scan.close();
    }
}