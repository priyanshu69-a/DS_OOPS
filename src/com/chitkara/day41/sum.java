package com.chitkara.day41;

public class sum {
    public static void main(String[] args) {
//        Write a program to calculate and display the sum of all elements in a given
//        integer array.
        int[] arr={10,20,30,40};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Display the result
        System.out.println("Sum of array elements = " + sum);
    }
}
