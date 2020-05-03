package com.statistics.day5.poissondistribution1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PoissonDistribution1Test {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        int x = sc.nextInt();
        double e = 2.71828;
        sc.close();       
        double pd = 0.0;
        pd = (Math.pow(m,x)*Math.pow(e,-m))/fact(x);
        System.out.println(Math.round(pd*1000.0)/1000.0);
    }
}

