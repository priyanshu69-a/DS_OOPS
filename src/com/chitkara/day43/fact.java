package com.chitkara.day43;

import java.util.Scanner;

public class fact {
    public static long factorial(int n ){
        if(n==0||n==1){
            return 1;

        }
        return n*factorial( n-1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not for negative numbers.");
        } else {
            long result = factorial(num);
            System.out.println( result);
        }

        sc.close();
    }
}



