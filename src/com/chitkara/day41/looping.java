package com.chitkara.day41;
// Declare an array of 5 integers and print all elements using a for loop.
public class looping {
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}




