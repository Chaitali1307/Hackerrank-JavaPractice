package com.statistics.day4.geometricdistribution1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GeometricDistribution1Test {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        double p = (double)a/b;
        double gp = Math.pow((1-p),(n-1))*p;
        System.out.println(Math.round(gp*1000.0)/1000.0);
    }
}

