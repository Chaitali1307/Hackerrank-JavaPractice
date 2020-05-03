package com.statistics.day0.meanmedianmode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MeanMedianModeTest {

    public static double findMean(int arr[], int N) 
        { 
           int sum = 0; 
           for (int i = 0; i < N; i++)  
            sum += arr[i]; 
      
           return (double)sum / (double)N; 
        }
    public static double findMedian(int arr[], int N)
        {
            Arrays.sort(arr);
            if(N%2!=0)
            return (double) arr[N/2];

            return (double) (arr[(N - 1) / 2] + arr[N / 2]) / 2.0;
        }
    public static int findMode(int arr[],int N)
        {
            int maxValue = 0 ;
            int maxCount = 0;
            for(int i = 0 ; i < N ; i++)
            {
                int count = 0;
                for(int j = 0 ; j < N ; j++)
                {
                    if(arr[j]==arr[i])
                    {
                        count++;
                    }
                }
                if(count>maxCount)
                {
                    maxCount = count;
                    maxValue = arr[i];
                }
            }
            return maxValue;
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int N =  sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N ; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findMean(arr,N));
        System.out.println(findMedian(arr,N));
        System.out.println(findMode(arr,N));
    }
}

