package com.statistics.day1.interquartilerange;

import java.util.Scanner;
import java.util.Arrays;

public class InterquartileRangeTest {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        /*scan interger n, elements and frequency of array*/
        int n = sc.nextInt();
        int elements[] = new int[n];
        int frequency[] = new int[n];

        for(int i=0; i<n;i++)
        {
            elements[i]=sc.nextInt();
        }

        /*find size of dataset array*/
        int size = 0 ;
        for(int i=0;i<n;i++)
        {
            frequency[i]=sc.nextInt();
            size = size+frequency[i];
        }

        /*create and sort the dataset*/
        int dataset[] = new int[size];
        int dataindex = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<frequency[i];j++)
            {
                dataset[dataindex]=elements[i];
                dataindex++;
            }
        }
        Arrays.sort(dataset);
         /* Works with both even and odd length arrays */
        double q1 = findMedian(dataset, 0, dataset.length / 2 - 1);
        double q3 = findMedian(dataset, (dataset.length + 1) / 2, dataset.length - 1);
        
        System.out.println(q3 - q1);
    }
    
    /* Treats elements from "start" to "end" as an array and calculates its median */
    private static double findMedian(int [] array, int start, int end) {
        if ((end - start) % 2 == 0) { // odd number of elements
            return (array[(end + start) / 2]);
        } else { // even number of elements
            int value1 = array[(end + start) / 2];
            int value2 = array[(end + start) / 2 + 1];
            return (value1 + value2) / 2.0;
        }
    }
}