package Exercises;
/**
 * You will prompt the user to enter the parts of their name. You will then create a
 * new string that holds the user’s full name.
 * The user will always have a first and last name, they may also have a middle
 * name and a suffix (ex. Jr, PhD). If a user does not enter a value for the middle
 * name or suffix, the full name should not include that part of the name. If the user
 * has a suffix in their name, the full name should include a comma before the
 * suffix.
 * Glen Williams
 * Glen C. Williams
 * Glen Williams, PhD
 * Glen C. Williams, PhD
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Your first name is " + firstName);
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Your last name is " + lastName);

        // check if they have a middle name initial
        System.out.println("Please enter your middle initial (or press enter if you don't have one): ");
        String middleInput = scanner.nextLine();

        String middleInitial = "";
        if (!middleInput.equals("")) {
            middleInitial = middleInput + " . ";
        }

        System.out.println("Please enter if you have any suffix (ex. Jr, Phd) (or press enter if you don't have one):");
        String suffix = scanner.nextLine();

        String suffixInput = "";
        if (!suffix.equals("")) {
            suffixInput = suffix;
        }

        String fullName = firstName + " " + middleInitial + lastName + "," + suffixInput;
        System.out.println("Your full name is " + fullName);
    }
}
