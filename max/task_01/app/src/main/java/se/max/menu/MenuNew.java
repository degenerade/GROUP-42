package se.max.menu;

import java.util.*;

public class MenuNew {
    private final Map<String, Runnable> menuActions = new HashMap<>();
    // Hash map for menu options, storing a string and a runnable operation
    private final Scanner scanner;
    private final Random random;

    public MenuNew(Scanner scanner, Random random) {
        this.scanner = scanner;
        this.random = random;

        // putting menu options into hash map in constructor
        menuActions.put("1", Avatar::print);
        menuActions.put("2", Today::print);
        // lambda to make new game object and run it
        menuActions.put("3", () -> new RockPaperScissorsNew(scanner).play());
        menuActions.put("3A", () -> new RockPaperScissorsNew(scanner).play());
        menuActions.put("3a", () -> new RockPaperScissorsNew(scanner).play());
        menuActions.put("m", this::printMenu);
    }
    
    public void run() {
        printMenu();
        String choice;
        do {
            choice = getChoice();
            if (choice.equalsIgnoreCase("q")) break;

            menuActions.getOrDefault(choice,
                () -> System.err.println("Please enter a valid choice..."))
                .run();
        } while (true);
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

    public String getChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextLine();
    }
    
}
