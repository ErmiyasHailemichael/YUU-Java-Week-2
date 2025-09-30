package Exercises;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Step 1
 * Prompt the user for a game score.
 * The user will input a score in the following format:
 * Home:Visitor|21:9 , Slytherin:Gryffindor|23:59
 * Based on the user input, you should determine which team had the higher score
 * and display the name of the winning team.
 * Hint: You will have to split the user input multiple times to get all of the
 * information
 * - one split will be on the pipe ( | )
 * - one split will be on the colon ( : )
 */

public class HighsScoreWins {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userInput =  scanner.nextLine();

        // use the index method to separate the team and the score
        String[] parts = userInput.split(Pattern.quote("|")); // Home:Visitor | 21:9
        String teamsPart = parts[0];
        String scoresPart = parts[1];

        String[] teams = teamsPart.split(":");
        String[] scores = scoresPart.split(":");

        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        if(homeScore > visitorScore) {
            System.out.println("The home team won: " + teams[0] + " by scoring "+ homeScore);
        } else{
            System.out.println("The visitor team won: " + teams[1] + " by scoring "+ visitorScore);
        }
    }
}
