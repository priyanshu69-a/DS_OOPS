package com.chitkara.day43;
import java.util.Scanner;

public class cache {
    String[] cache = new String[5];  // cache with 5 slots
    int next = 0;                    // next position to insert

    // Method to add a page to the cache
    public void addPage(String page) {
        cache[next] = page;
        next = (next + 1) % cache.length; // circular index
    }

    // Method to print the cache content
    public void printCache() {
        System.out.println("Current cache content:");
        for (int i = 0; i < cache.length; i++) {
            System.out.println("Slot " + i + ": " + cache[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cache c = new cache();

        System.out.print("How many pages do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter page name " + (i + 1) + ": ");
            String page = sc.nextLine();
            c.addPage(page);
        }

        c.printCache();
        sc.close();
    }
}
