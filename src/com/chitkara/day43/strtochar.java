package com.chitkara.day43;

public class strtochar {



        public static void main(String[] args) {
            // Create a string
            String str = "Hello";

            // Convert string to char array
            char[] charArray = str.toCharArray();

            // Change the first character of the array
            charArray[0] = 'Y';

            // Print the modified char array
            System.out.println("Modified char array: " + new String(charArray));

            // Print the original string
            System.out.println("Original string: " + str);
        }
    }

