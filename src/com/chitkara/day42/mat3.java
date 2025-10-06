package com.chitkara.day42;
//Print all elements of a 3x3 matrix, row by row, each row on a new line.
public class mat3 {

        public static void main(String[] args) {
            // Define a 3x3 matrix
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


