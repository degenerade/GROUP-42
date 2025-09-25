package lawrence;

import java.util.Random;
import java.util.Scanner;

public class Guess_number_game {

    // Standard main method that calls our custom main() method
    public static void main(String[] args) {
        main(); // Call the custom main() method
    }
    // Custom main method without parameters
    public static void main() {
        // Create a Scanner object to read input from the player
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random number
        Random random = new Random();

        // Set the range for the random number (1 to 100)
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange) + 1;

        // Initialize variables for player's guess and attempt counter
        int playerGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and " + maxRange + ".");
        System.out.println("Can you guess what it is?");

        // Loop until the player guesses the correct number
        while (playerGuess != targetNumber) {
            // Prompt the player for a guess
            System.out.print("Enter your guess: ");
            playerGuess = scanner.nextInt();  // Read player input
            attempts++; // Increase the attempt counter by 1

            // Check if the player's guess is correct, too low, or too high
            if (playerGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (playerGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                // Player guessed the correct number
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
