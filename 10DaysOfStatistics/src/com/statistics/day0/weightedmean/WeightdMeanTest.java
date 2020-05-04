package com.statistics.day0.weightedmean;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeightdMeanTest {

    public static float findWeightedMean( int a[] , int w[] , int N )
    {
        int sum = 0;
        int res = 0;
        for(int i =0 ; i < N ;i++)
        {
           sum = sum + a[i]*w[i] ; 
           res = res + w[i];
        }
        return (float) sum /  res ;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int a[] = new int[N];
        
        int w[] = new int[N];

        for(int i = 0 ; i < N ; i++)
        {
            a[i] = sc.nextInt();
            
        }
        for(int j = 0 ; j < N ; j++)
        {
            w[j] = sc.nextInt();
        }   
        System.out.printf("%,.1f",findWeightedMean(a,w,N));
    }
}
