package com.pluralsight.NeighborhoodLibraryWorkShop;

/**
 * Create a Book class with appropriate getters, setters, constructors and
 * methods. The class should have the following properties:
 * o Properties
 * - id: int
 * - isbn: String
 * - title: String
 * - isCheckedOut: boolean
 * - checkedOutTo: String
 * o Methods
 *  - checkOut(name)
 *  - checkIn()
 */
public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // constructor
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut =isCheckedOut();
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // Methods -
    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;

    }
    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }
}
