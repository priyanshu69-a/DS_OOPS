package com.chitkara.day43;

public class vowel {
        public static String replaceVowels(String str) {
            return str.replaceAll("[AEIOUaeiou]", "*");
        }
        public static void main(String[] args) {
            String original = "Hello World";
            String modified = replaceVowels(original);
            System.out.println("Original string: " + original);
            System.out.println("Modified string: " + modified);
        }
    }

