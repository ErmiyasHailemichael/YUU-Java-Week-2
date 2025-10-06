package com.pluralsight.RecapWeekTwoByErmi;

import java.util.Scanner;

/**
 * You will prompt the user to enter the parts of their name. You will then create a
 * new string that holds the user’s full name. -- Done
 *
 * The user will always have a first and last name, they may also have a middle
 * name and a suffix (ex. Jr, PhD). If a user does not enter a value for the middle
 * name or suffix, the full name should not include that part of the name. If the user
 * has a suffix in their name, the full name should include a comma before the
 * suffix.
 * Glen Williams
 * Glen C. Williams
 * Glen Williams, PhD
 * Glen C. Williams, PhD
 * Make sure to trim any leading or trailing spaces that the user may have entered.
 * Note: the ↵ represents the user hitting the ENTER key
 * Please enter your name
 * First name: Glen↵
 * Middle name: ↵
 * Last name: Williams↵
 * Suffix: ↵
 * Full name: Glen Williams
 */
public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FullNameGenerator();
    }

    public static void FullNameGenerator(){
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine().trim();
//        System.out.println("You entered " + firstName +" as your first name");
        System.out.println("Enter your middle initial (if you have one)");
        String middleInitial = scanner.nextLine().trim();
//        System.out.println("You entered " + middleInitial);
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine().trim();
//        System.out.println("You entered " + lastName +" as your last name");
        System.out.println("Enter your suffix (if you have one):");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        if(!middleInitial.isEmpty()){
            fullName += " " + middleInitial +". ";
        }

        fullName += " " + lastName;

        if(!suffix.isEmpty()){
            fullName += ", " + suffix;
        }
        System.out.println(fullName);

//        System.out.println("You entered " + firstName + " " + middleInitial + " and " + lastName);
    }

}
