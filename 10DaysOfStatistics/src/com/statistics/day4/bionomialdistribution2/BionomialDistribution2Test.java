package com.statistics.day4.bionomialdistribution2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BionomialDistribution2Test {

    public static int fact(int n)
    {
        if(n==0)
           return 1;
        return n*fact(n-1);
    }
    public static double combination(int n ,int x)
    {
        return fact(n)/(fact(x)*fact(n-x));
    }
    public static double bionomial(int n , int x , double p)
    {
        return combination(n,x)*Math.pow(p,x)*Math.pow((1-p),(n-x));
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double p = sc.nextInt();
        p = p/100;
        int n = sc.nextInt();
        double bd = 0.0;
        for(int i = 0 ; i <= 2 ;i++)
        {
            bd  = bd + bionomial(n,i,p);
        }
        System.out.println(Math.round(bd*1000.00)/1000.00);
        double bd1 = 0.0;
        for(int i = 2 ; i <= n ;i++)
        {
            bd1  = bd1 + bionomial(n,i,p);
        }
        System.out.println(Math.round(bd1*1000.00)/1000.00);
    }
}
