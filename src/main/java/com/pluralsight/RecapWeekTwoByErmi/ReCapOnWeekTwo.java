package com.pluralsight.RecapWeekTwoByErmi;

import java.util.Scanner;

public class ReCapOnWeekTwo {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        UserInput();
        StringMethods();
        LengthStringMethod();
        TrimStringMethods();
        ConvertAStringToUpperCase();
        ChainingStringMethodsTogether();
        ParticularSubString();
        ParticularSubString2();
        CharacterPosition();
        SubStringBegins();
        SubstringFromLargeString();
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

    // Examples - String Methods

    // You can get the length of a string using .length() method
    public static void LengthStringMethod(){
        String fullName = "Dana Wyatt";
        int lengthOfFullName = fullName.length();
        System.out.println("The word have " + lengthOfFullName);
    }

    // Trim string method - Trim leading and trailing spaces from a string
    public static void TrimStringMethods(){
        String userName = " Dana    ";
        userName = userName.trim();
        System.out.println("The word after trim is applied --> " + userName);
    }

    public static void ConvertAStringToUpperCase() {
        String userName = "Dana";
        userName = userName.toUpperCase();
        System.out.println("The word after converting A String to UpperCase ---> " + userName);
    }

    // Chaining the calls
    // Examples
    public static void ChainingStringMethodsTogether() {
        String userName = "Dana    ";
        userName = userName.toLowerCase();
        userName = userName.toUpperCase();
        System.out.println(userName);
    }

    // You can determine if a string starts with a particular substring
    public static void ParticularSubString() {
    String discountCode = "FAIR-15OFF";
        System.out.println("It starts with FAIR");
    }

    // You can determine if a string ends with a particular substring
    public static void ParticularSubString2() {
    String discountCode = "SAVE-50";
    if (discountCode.endsWith("-50")) {
        System.out.println("It ends with SAVE-50");
    } else  {
        System.out.println("It does not end with SAVE-50");
    }
    }

    // Character position
    public static void CharacterPosition() {
        String trackingCode = "USA-12981-Y-22";
        char hasShipped = trackingCode.charAt(10);
        System.out.println("The position at 10 is " + hasShipped);
    }

    // You can return the position where a substring begins. It returns -1 if it doesn't find it
    public static void SubStringBegins() {
        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-");
        System.out.println("The begins at index " + dashPosition);

    }

    // You can return a substring from a larger string if you know the starting and ending
    //index. The ending index is exclusive (that is, it is not included in the substring. If you
    //omit the ending index, it takes the remainder of the string.
    public static void SubstringFromLargeString() {
        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-");
        String vendor = productCode.substring(0, dashPosition);
        String productNum = productCode.substring(dashPosition + 1);
        System.out.println(vendor + "  " + productNum);

    }
}
