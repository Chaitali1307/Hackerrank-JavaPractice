package com.statistics.day1.quartiles;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuartilesTest {
    public static int findMedian(int a[],int start,int end)
    {
        Arrays.sort(a);
        if((end-start)%2==0)
        {
            return a[(end+start)/2];
        }
        else
        {
            int value1 = a[(end+start)/2];
            int value2 = a[(end+start)/2+1];
            return Math.round((value1+value2)/2);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            a[i]=sc.nextInt();
        }
        
        int q1 = findMedian(a,0,a.length/2-1);
        int q2 = findMedian(a,0,a.length-1);
        int q3 = findMedian(a,(a.length+1)/2,a.length-1);

        System.out.println(q1+"\n"+q2+"\n"+q3);
    }
}
