package com.chitkara.day39;



public class highlow {
    public static void main(String[] args) {
        int i = 1; // start from 1
        while (i <= 10) { // loop until 10
            if (i > 5) {
                System.out.println(i + " -> High");
            } else {
                System.out.println(i + " -> Low");
            }
            i++; // increment counter
        }
    }
}

