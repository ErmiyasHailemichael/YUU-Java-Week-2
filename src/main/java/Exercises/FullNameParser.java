package Exercises;

import java.util.Scanner;

/**
 * Create a Java application called FullNameParser that prompts the user to enter a
 * name in one of the following two formats:
 * first last or first middle last
 * Make sure to trim the name before proceeding in case the user entered leading or
 * trailing spaces.
 * Parse the name and process it so that you can display the individual pieces of the
 * name.
 * A sample trace of your program output is shown below. Bolded code is what the
 * user entered.
 */
public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your first, middle initial and last name: ");
        String fullName =scanner.nextLine();

        // Make sure to trim the name before proceeding - remove any white space
        // Locate the first name, middle initial and last name and split them into three strings - index method?
        // then put the names respectively to the index - for example first name is index 0 ,...
        fullName=fullName.trim();
        String[] fullNameArray = fullName.split(" ");
        String firstName = fullNameArray[0];
        String middleInitial = "";
        String lastName =fullNameArray[1];
        if(fullNameArray.length > 2) {
            lastName = fullNameArray[2];
            middleInitial = fullNameArray[1];
        }
//        String lastName = fullNameArray[2];
        System.out.println("first name: " + firstName);
        System.out.println("middle initial: " + middleInitial);
        System.out.println("last name: " + lastName);
    }
}
