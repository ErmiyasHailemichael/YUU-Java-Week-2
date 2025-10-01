package Exercises;

import java.util.Scanner;

public class FinancialCalculators {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greetings();
    }

    public static void greetings() {
        System.out.println("==== WELCOME TO ERMIYAS COMMERCIAL BANK ====");
        System.out.println("""
                WHAT KIND OF CALCULATION WOULD YOU LIKE TO DO TODAY:\
                
                 1. Mortgage Calculator \
                
                 2. Future Value Calculator \s""");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            System.out.println("Let's get you started with Mortgage Calculator");
            mortgageCalculator();
        } else if (input.equals("2")) {
            System.out.println("Let's get you started with future Value Calculator");
            futureValuesCalculator();
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void mortgageCalculator() {
        System.out.println("How much loan are you getting? ");
        double totalLoanAmount = scanner.nextDouble();
        System.out.println("What is the loan interest? ");
        double interestRate = scanner.nextDouble();
        System.out.println("For how long is the loan? \n(In years) ");
        double loanPeriod = scanner.nextDouble();

        // M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1)
        // M - Monthly Payment
        // P - totalLoanAmount
        // R - interestRate
        // Y - loanPeriod in years
        // N - 12 * y - 12 is the months in 1 year
        // I - MonthlyInterestRate - R/12
        // Total Interest = (M * N) - P
//        System.out.println("Calculating ...");
        // Thread.sleep(4000);
        System.out.println("Calculating ...");
        try {
            Thread.sleep(4000); // 4000 milliseconds = 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // read the totalLoanAmount(P) and convert it to decimal
        double annualRate = interestRate / 100;

        // Monthly interest values
        double monthlyInterest = annualRate / 12;

        // Yearly interest value
        double n = 12 * loanPeriod;

        if (interestRate == 0){
            double monthlyPayment = totalLoanAmount / n;
            System.out.println("The monthly payment is $" + monthlyPayment);
            return;
        } else {
//            double monthlyInterestRate = totalLoanAmount * Math.pow(1 ,monthlyInterest);
            double exponent = Math.pow(1 + monthlyInterest, n);
            double numerator = monthlyInterest * exponent;
            double denominator = exponent - 1;
            double monthlyPayment = totalLoanAmount * (numerator / denominator);

            System.out.println("Your monthly payment is " + monthlyPayment);
//            System.out.println("The total interest is $" + monthlyPayment);
        }

        /**
         * • Calculator 2: A calculator that determines the future value of a
         * one-time deposit assuming compound interest - it is used to help
         * you decide how much a CD will be worth when it matures
         */



    }

    public static void futureValuesCalculator(){
        System.out.println("== WELCOME TO THE FUTURE VALUE CALCULATOR ==");
        System.out.println("How much money do you want to deposit? ");
        double initialDeposit = scanner.nextDouble();
        System.out.println("What's the annual interest rate? ");
        double interestRates = scanner.nextDouble();
        System.out.println("How long will your money be invested? \n(In years) ");
        double depositPeriod = scanner.nextDouble();

        //FV = P × (1 + (r / 365) )^(365 × t)
        /*
          FV - Future value
          P -  initial deposit
          Annual Interest Rate (r) -
          Number of Years(t) -
          Days per Year - 365 days
          Total Numbers of Days - This is 365 × t (because there are 365 days per year).
          Total Interest Earned = FV - P
         */

        // what are the condition that will make this calculation different or zero?
        // if interest rate is 0 , we will ge the initial deposit
        // if the t is 0, we will ge the initial deposit

        // calculation breakdown - BODMAS - Bracket, Order - powers,roots , Division,Multiplication, Add, Sub
        // P, r, t are given
        // normal cal without exponent and only the one in bracket - (1 + (r / 365))
        // then cal the inner bracket - (r/365)
        // then outer bracket - (1 + inner_bracket)
        // then the exponent - 365* t
        // then power -
        // then P * the remaining part
        double annualRate = interestRates / 100; // r = i/100

        if  (annualRate == 0){
            System.out.println("When the annual rate is zero, there is no interest rate applied: " + initialDeposit);
        } else if  (depositPeriod == 0){
            System.out.println("The time is zero means there is no interest rate applied: " + initialDeposit);
        } else{
            System.out.println("Invalid input");
        }
        double innerBracket = annualRate / 365; //(r/365)
        double outerBracket = 1 + innerBracket;
        double exponentCal = 365 * depositPeriod;

        double powerResult = Math.pow(outerBracket, exponentCal);

        double futureValue = initialDeposit * powerResult;
        System.out.println("Your future value is " + futureValue);

        double totalInterest = futureValue - initialDeposit;
        System.out.println("Total interest earned is $" + totalInterest);
    }
}
