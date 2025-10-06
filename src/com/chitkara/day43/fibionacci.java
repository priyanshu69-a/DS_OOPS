package com.chitkara.day43;

import java.util.Scanner;

public class fibionacci {


    public static int fibonaccii(int n) {
        if (n == 0) {
            return 0;                // 0th term = 0
        } else if (n == 1) {
            return 1;                // 1st term = 1
        } else {
            return fibonaccii(n - 1) + fibonaccii(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Fibonacci of 5 numbers is " + n );
        for (int i = 0; i < n; i++) {
            System.out.print(fibonaccii(i) + " ");
        }
        System.out.println();

        sc.close();
    }
}
