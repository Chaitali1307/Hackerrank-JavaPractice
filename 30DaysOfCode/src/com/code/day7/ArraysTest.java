package com.code.day7;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArraysTest {



    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        for(int i = n-1 ;i>=0;i--){
            System.out.print(arr[i]+" ");
         }

        scan.close();
    }
}
