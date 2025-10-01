package Exercises;

import java.util.Scanner;

public class FinancialCalculators {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        greetings();

    }
    public static void greetings(){
        System.out.println("==== WELCOME TO ERMIYAS COMMERCIAL BANK ====");
        System.out.println("""
                WHAT KIND OF CALCULATION WOULD YOU LIKE TO DO TODAY:\
                
                 1. Mortgage Calculator \
                
                 2. Future Value Calculator \s""");
        String input=scanner.nextLine();
        if (input.equals("1")) {
            System.out.println("Let's get you started with this calculation");
        } else if (input.equals("2")) {
            System.out.println("Let's get you started with this calculation and its interest");
        } else{
            System.out.println("Invalid input");
        }
    }
}
