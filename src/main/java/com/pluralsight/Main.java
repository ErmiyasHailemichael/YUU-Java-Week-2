package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Section 1—1
        //Strings
        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-");
        System.out.println("Dash Position: " + dashPosition);

        String trackingCode = "USA-12981-Y-22";
        char hasShipped = trackingCode.charAt(10);
        // hasShipped contains 'Y'
        System.out.println("Has Shipped: " + hasShipped);

        String names = "Wiesjie and Zia";
        int indexZ = names.indexOf('Z');
        String name = names.substring(indexZ);
        System.out.println("Name: " + name);
        System.out.println(names);

        String[] arrNames = {"Vice", "Nicolas", "Emmanuel"};
        System.out.println(arrNames[1]);
    //  String[] namesArray = namesWithPipe.split

        // String with quotes - \" the word\"
        String welcome = "Big Tex says \"Howdy\"!";
        System.out.println(welcome);
        // we can use the ' in string but just for
        String welcome2 = "Let's get this started!";
        System.out.println(welcome2);

        //comparing strings
        // Don't use == operator to compare strings
        // use equals() method to compare strings
        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = "A" + "B" + "C";
        if (s1.equals(s2)) {
            System.out.println("Same String");
        }
        if (s1.equals(s3)) {
            System.out.println("Same String");
        }

        // equalsIgnoreCase() to ignore the capitalization of characters

        String st1 = "ABC";
        String st2 = "abc";
        String st3 = "A" + "b" + "C";
        if (st1.equalsIgnoreCase(st2)) {
            // this will be true
            System.out.println("equal String");
        }
        if (st1.equalsIgnoreCase(st3)) {
            System.out.println("equal String");
            // this will be true
        }

        // string methods examples
        // string length
        String fullName = "Dana Wyatt";
        int length = fullName.length();
        System.out.println(length);

        // string Trim leading and trailing spaces from a string
        String username = " danaw ";
        username = username.trim();
        // now it contains "danaw"
        System.out.println(username);

        // Converts a string to uppercase.
        String usernames = "danaw";
        usernames = usernames.toUpperCase();
        // now it contains "DANAW"
        System.out.println(username);

        // You can chain the calls.
        String usernamess = " danaw ";
        usernamess = usernamess.trim().toUpperCase();
        // now it contains "DANAW"
        System.out.println(usernamess);

        String state = "New Mexico";
        state = state.toLowerCase();
        // now it contains "new mexico"
        System.out.println(state);

        // You can determine if a string starts with a particular substring
        String discountCode = "FAIR-15OFF";
        if (discountCode.startsWith("FAIR")) {
            // this is true
        }

    }
}