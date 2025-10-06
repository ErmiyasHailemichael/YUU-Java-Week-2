package com.pluralsight.NeighborhoodLibraryWorkShop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NeighborhoodLibrary {
    public static Scanner scanner = new Scanner(System.in);
    private static Book[] books = new Book[20];
    public static void main(String[] args) {
        initializeLibrary();
        showHomeScreen();
        showAvailableBooks();
    }

    private static void initializeLibrary() {
        books[0] = new Book(1, "978-0439708180", "Harry Potter and the Sorcerer's Stone");
        books[1] = new Book(2, "978-0061120084", "To Kill a Mockingbird");
        books[2] = new Book(3, "978-0743273565", "The Great Gatsby");
        books[3] = new Book(4, "978-0451524935", "1984");
        books[4] = new Book(5, "978-0618260300", "The Hobbit");
        books[5] = new Book(6, "978-0316769488", "The Catcher in the Rye");
        books[6] = new Book(7, "978-0141439518", "Pride and Prejudice");
        books[7] = new Book(8, "978-0307743657", "The Hunger Games");
        books[8] = new Book(9, "978-0060850524", "Brave New World");
        books[9] = new Book(10, "978-0547928227", "The Lord of the Rings");
        books[10] = new Book(11, "978-0735211292", "Atomic Habits by James Clear");
        books[11] = new Book(12, "978-0316017930", "Outliers by Malcolm Gladwell");
        books[12] = new Book(13, "978-1501110368", "The 5 AM Club by Robin Sharma");
        books[13] = new Book(14, "978-0062457714", "The Subtle Art of Not Giving a F*ck by Mark Manson");
        books[14] = new Book(15, "978-1591846447", "Start With Why by Simon Sinek");
        books[15] = new Book(16, "978-0062457738", "Grit by Angela Duckworth");
        books[16] = new Book(17, "978-0062315007", "Mindset by Carol Dweck");
        books[17] = new Book(18, "978-0143126560", "Thinking, Fast and Slow by Daniel Kahneman");
        books[18] = new Book(19, "978-1501144318", "Can't Hurt Me by David Goggins");
        books[19] = new Book(20, "978-1591847809", "Deep Work by Cal Newport");
    }

    public static void showHomeScreen(){
        System.out.println("Welcome to the Neighbourhood Library");

        System.out.println("1. Show Available Books");
        System.out.println("2. Show Checked Out Books");
        System.out.println("3. Exit");
        System.out.println("Please select an option form the given options: ");

        String option = scanner.nextLine();

        if(option.equals("1")){
            System.out.println("You chose: Show Available Books");
        } else if (option.equals("2")){
            System.out.println("You chose: Show Checked Out Books");
        } else if (option.equals("3")){
            System.out.println("Thank you for visiting the Neighbourhood Library");
        } else{
            System.out.println("Invalid option");
        }
    }

    public static void showAvailableBooks(){
        System.out.println("  Available Books  ");

        for(int i = 0; i < books.length; i++){
            Book book = books[i];
            if(book.isCheckedOut() == false){
                System.out.println("ID: " + book.getId() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle());
            }
        }

        System.out.println();
    }
}
