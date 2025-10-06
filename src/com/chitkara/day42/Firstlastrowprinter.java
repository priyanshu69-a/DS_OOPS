package com.chitkara.day42;

public class Firstlastrowprinter {

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Print the first row
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[0][j] + " ");
            }
            System.out.println();

            int lastRowIndex = matrix.length - 1;
            for (int j = 0; j < matrix[lastRowIndex].length; j++) {
                System.out.print(matrix[lastRowIndex][j] + " ");
            }
            System.out.println();
        }
    }


