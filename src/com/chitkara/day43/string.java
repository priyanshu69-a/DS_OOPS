package com.chitkara.day43;

public class string {
    public static void main(String[] args) {
        int iterations = 10000;
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += i;
        }
        long endTime = System.nanoTime();
        long stringTime = endTime - startTime;
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("Time taken with String: " + stringTime + " ns");
        System.out.println("Time taken with StringBuilder: " + stringBuilderTime + " ns");
    }
}