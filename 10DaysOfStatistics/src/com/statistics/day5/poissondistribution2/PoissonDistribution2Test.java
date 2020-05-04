package com.statistics.day5.poissondistribution2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PoissonDistribution2Test {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        double costA = 160 + 40 * (a + Math.pow(a,2));
        double costB = 128 + 40 * (b + Math.pow(b,2));
        System.out.println(Math.round(costA*1000.0)/1000.0);
        System.out.println(Math.round(costB*1000.0)/1000.0);
    }
}