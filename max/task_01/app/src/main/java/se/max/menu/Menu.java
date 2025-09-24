package se.max.menu;
import java.util.Scanner;

public class Menu {
    public Menu() {

    }
    public void run() {
        String choice = "";
        printMenu();
        do {
            choice = getChoice();
            switch (choice) {
                case "1":
                    Avatar.print();
                    break;
                case "2":
                    Today.print();
                    break;
                case "3A":
                case "3":
                case "3a":
                    RockPaperScissors game = new RockPaperScissors();
                    game.play();
                    break;
                case "m":
                    printMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.err.println("Please enter a valid choice...");
            }
        }
        while ((!choice.equalsIgnoreCase("q")));
        
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
        System.out.println("You entered: " + choice);
        scanner.close();
        return choice;
    }
}

