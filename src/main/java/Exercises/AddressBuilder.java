package Exercises;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder addressBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Billing street: ");
        String address = scanner.nextLine();
        System.out.println("Enter your billing City: ");
        String city = scanner.nextLine();
        System.out.println("Enter your Billing State: ");
        String state = scanner.nextLine();
        System.out.println("Enter your billing Zip Code: ");
        String zip = scanner.nextLine();
        System.out.println("Enter Your Shipping Street: ");
        String shipping = scanner.nextLine();
        System.out.println("Enter Your Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.println("Enter Your Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.println("Enter Your Shipping Zip Code: ");
        String shippingZip = scanner.nextLine();

/**
 * Shipping Street: 456 Big Sky Blvd
 * Shipping City: Outer Rim
 * Shipping State: TX
 * Shipping Zip: 75333
 */
        addressBuilder.append("Billing Street: ").append(address);
        addressBuilder.append("\n");
        addressBuilder.append("Billing City: ").append(city);
        addressBuilder.append("\n");
        addressBuilder.append("Billing State: ").append(state);
        addressBuilder.append("\n");
        addressBuilder.append("Billing Zip: ").append(shipping);
        addressBuilder.append("\n");
        addressBuilder.append("Shipping Street: ").append(shippingCity);
        addressBuilder.append("\n");
        addressBuilder.append("Shipping City: ").append(shippingState);
        addressBuilder.append("\n");
        addressBuilder.append("Shipping State: ").append(shippingZip);
        addressBuilder.append("\n");
        addressBuilder.append("Shipping Zip: ").append(zip);
//        System.out.println(addressBuilder.toString());



        String fullAddress = addressBuilder.toString();
        System.out.println(fullAddress );


        String shippingAddress = addressBuilder.toString();
        System.out.println(shippingAddress);

    }
}
