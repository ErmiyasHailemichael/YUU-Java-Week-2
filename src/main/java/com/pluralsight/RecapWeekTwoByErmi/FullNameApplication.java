package com.pluralsight.RecapWeekTwoByErmi;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        infoCollecting();
    }

    public static void infoCollecting(){
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
//        System.out.println("You entered " + firstName +" as your first name");
        System.out.println("Enter your middle initial (if you have one)");
        String middleInitial = scanner.nextLine();
//        System.out.println("You entered " + middleInitial);
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
//        System.out.println("You entered " + lastName +" as your last name");

        //

//        System.out.println("You entered " + firstName + " " + middleInitial + " and " + lastName);
    }
}
