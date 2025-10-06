package com.pluralsight.RecapWeekTwoByErmi;

import java.util.Scanner;

public class ReCapOnWeekTwo {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        UserInput();
        StringMethods();
    }

    public static void UserInput() {
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

    public static void StringMethods(){

        System.out.println("Enter your name");
        String myName = scan.nextLine();
        int len =  myName.length();
        System.out.println("Your name is " +myName + " and it is " + len + " characters long");
    }



}
