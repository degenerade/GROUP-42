package lawrence;

import java.util.Random;
import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;
import java.util.function.Consumer;

public class Guess_number_game_refractored {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            int maxRange = 100;

            // Suppliers & functions = functional "building blocks"
            IntSupplier targetGenerator = () -> new Random().nextInt(maxRange) + 1; // lambda (Supplier)
            final int targetNumber = targetGenerator.getAsInt();                    //

            ToIntFunction<Integer> compareToTarget = guess -> Integer.compare(guess, targetNumber); // pure comparator
            IntPredicate isCorrect = cmp -> cmp == 0;                                                // predicate
            IntFunction<String> hintText = cmp -> switch (cmp) {                                     // pure mapper
                case -1 -> "Too low! Try again.";
                case 1  -> "Too high! Try again.";
                default -> ""; // 0 means correct; prints a separate message then break
            };
            Consumer<String> printer = System.out::println; // method reference

            printer.accept("Welcome to the Number Guessing Game!");
            printer.accept("I'm thinking of a number between 1 and " + maxRange + ".");
            printer.accept("Can you guess what it is?");

            int attempts = 0;

            while (true) {
                System.out.print("Enter your guess: ");
                int playerGuess = scanner.nextInt();
                attempts++;

                int cmp = compareToTarget.applyAsInt(playerGuess);
                if (isCorrect.test(cmp)) {
                    System.out.printf("Congratulations! You guessed the number in %d attempts.%n", attempts);
                    break;
                } else {
                    printer.accept(hintText.apply(cmp));
                }
            }
        }
    }
}

