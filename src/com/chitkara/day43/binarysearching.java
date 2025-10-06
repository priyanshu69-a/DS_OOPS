package com.chitkara.day43;
import java.util.Scanner;
import java.util.Arrays;

    public class binarysearching {

        // Recursive method for binary search
        public static int binarySearch(int[] arr, int low, int high, int key) {
            if (low > high) {
                return -1;   // Key not found
            }

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;  // Key found at mid
            }
            else if (key < arr[mid]) {
                return binarySearch(arr, low, mid - 1, key); // Search left half
            }
            else {
                return binarySearch(arr, mid + 1, high, key); // Search right half
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array size and elements
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Array must be sorted for Binary Search
            Arrays.sort(arr);

            System.out.print("Enter the element to search: ");
            int key = sc.nextInt();

            int result = binarySearch(arr, 0, n - 1, key);

            if (result == -1) {
                System.out.println("Element not found.");
            } else {
                System.out.println("Element found at index: " + result);
            }

            sc.close();
        }
    }


