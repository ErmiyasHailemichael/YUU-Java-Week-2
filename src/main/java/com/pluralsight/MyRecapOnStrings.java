package com.pluralsight;

import java.util.Scanner;

public class MyRecapOnStrings {
    public static void main(String[] args) {
/**
 * ### Exercise 3: User Input
 * Write a program that:
 * - Asks the user to enter two words.
 * - Prints whether they are **exactly the same** (`equals`) or **the same ignoring case** (`equalsIgnoreCase`).
 * ```
 */
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String name1 = scan.nextLine();
        System.out.println("Enter the second word: ");
        String name2 = scan.nextLine();

        if(name1.equalsIgnoreCase(name2)){
            System.out.println("You entered the same name!");
        } else {
            System.out.println("You entered different name!");
        }
    }
}
