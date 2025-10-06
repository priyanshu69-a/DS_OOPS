package com.chitkara.day39;


import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read height of pyramid from user
        System.out.print("Enter the number of rows (N): ");
        int N = sc.nextInt();

        // Loop through rows
        for (int i = 1; i <= N; i++) {
            // Loop through columns (spaces + stars)
            for (int j = 1; j <= 2 * N - 1; j++) {
                // Condition for printing stars in pyramid shape
                if (j >= N - (i - 1) && j <= N + (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}


