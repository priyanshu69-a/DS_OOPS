package com.chitkara.day43;

import java.util.Scanner;

public class diagonalproduct {
        public static void main(String[] args) {

            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };


            int product = 1;
            for (int i = 0; i < 3; i++) {
                product *= matrix[i][i];
            }

            for (int i = 0; i < 3; i++) {
                matrix[i][i] = product;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
