package com.chitkara.day42;

public class columnsum {

        public static void main(String[] args) {
            // 4x4 integer array
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            // Loop through each column
            for (int col = 0; col < matrix[0].length; col++) {
                int sum = 0;
                // Add up elements in this column
                for (int row = 0; row < matrix.length; row++) {
                    sum += matrix[row][col];
                }
                // Print the sum of the current column
                System.out.println("Sum of column " + col + " = " + sum);
            }
        }
    }


