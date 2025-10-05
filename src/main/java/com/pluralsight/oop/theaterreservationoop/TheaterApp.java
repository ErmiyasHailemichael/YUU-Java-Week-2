package com.pluralsight.oop.theaterreservationoop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Reservation reservation = getReservation();
        displayReservation(reservation);
    }

    public static Reservation getReservation() {
        Reservation reservation = new Reservation();
        System.out.println("Please enter the name of the reservation: ");
        reservation.setName(scanner.next());


        System.out.println("What date will be coming? (MM/DD/YYYY): ");
        String strDate = scanner.next();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        reservation.setDate(LocalDate.parse(strDate, dtf));

        System.out.println("How many tickets would you like?");
        reservation.setNumberOfTickets(scanner.nextInt());
        scanner.nextLine();

        return reservation;
    }

    public static void displayReservation(Reservation reservation) {
        System.out.printf("%d %s reserved for %s under %s",
                reservation.getNumberOfTickets(),
                reservation.getNumberOfTickets() > 1 ? "tickets" : "ticket",
                reservation.getDate(),
                reservation.getName());
    }

}
