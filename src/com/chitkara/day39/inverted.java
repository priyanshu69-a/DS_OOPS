package com.chitkara.day39;


    public class inverted {
        public static void main(String[] args) {
            // Outer loop for rows
            for (int i = 1; i <= 4; i++) {
                // Inner loop for numbers in each row
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                // Move to the next line after each row
                System.out.println();
            }
        }
    }


