package com.statistics.day1.standarddeviation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StandardDeviationTest
{

    public static double findStandardDeviation(int a[],int n)
    {
        int sum = 0;
        int mean =0;
        double sd = 0.0;
        for(int i = 0 ; i < n ; i++)
        {
            sum += a[i];
            mean = sum/n;
        }
        double temp = 0.0;
        for(int i = 0 ; i < n ; i++)
        {
            temp = (temp + Math.pow((a[i]-mean),2));
        }
        sd = Math.round(Math.sqrt(temp/n)*10.0)/10.0;
        return sd;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(findStandardDeviation(a, n));
    }

}
