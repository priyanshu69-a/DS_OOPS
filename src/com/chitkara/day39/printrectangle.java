package com.chitkara.day39;


import java.util.Scanner;

public class printrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read rows and columns from the user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Nested loops to print the rectangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}

