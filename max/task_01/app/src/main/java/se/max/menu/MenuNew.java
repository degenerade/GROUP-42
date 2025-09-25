package se.max.menu;

import java.util.*;

public class MenuNew {
    private final Map<String, Runnable> menuActions = new HashMap<>();
    // Hash map for menu options, storing a string and a runnable operation
    public MenuNew() {
        // putting menu options into hash map in constructor
        menuActions.put("1", Avatar::print);
        menuActions.put("2", Today::print);
        // lambda to make new game object and run it
        menuActions.put("3", () -> new RockPaperScissors().play());
        menuActions.put("3A", () -> new RockPaperScissors().play());
        menuActions.put("3a", () -> new RockPaperScissors().play());
        menuActions.put("m", this::printMenu);
    }
    
    public void run() {
        printMenu();
        try (Scanner scanner = new Scanner(System.in)) {
            String choice;
            while (true) {
                choice = getChoice(scanner);
                if (choice.equalsIgnoreCase("q")) break;
                // exit if choice = q
                menuActions.getOrDefault(choice, 
                () -> System.err.println("Please enter a valid choice..."))
                .run();
                // takes choice and runs mapped operation,
                // if nothing is mapped to choice, prints error message
            }
        }
    }

    public void printMenu() {
        System.out.println("""
                 -----------------
                | 1) Print the spider
                | 2) Print today date/time
                | 3A) Rock, scissors, paper
                | m) Print menu
                | qQ) Quit
                 -----------------""");
    }

    public String getChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        return scanner.nextLine();
    }
    
}
