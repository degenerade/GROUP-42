
package se.max.menu;

import java.util.*;
import java.util.function.Supplier;

public class RockPaperScissorsNew {
    private int playerScore, spiderScore;
    public enum Move {
        ROCK, PAPER, SCISSORS;
        private static final Move[] VALUES = values();
        private static final Random RANDOM = new Random();
        public static Supplier<Move> randomMove = 
            () -> VALUES[RANDOM.nextInt(VALUES.length)];
    }
    private static final Map<Move, Move> beats = Map.of(
        Move.PAPER, Move.ROCK,
        Move.ROCK, Move.SCISSORS,
        Move.SCISSORS, Move.PAPER
    );
    private final Map<String, Runnable> actions = new HashMap<>();

    public RockPaperScissorsNew() {
        actions.put("r", () -> play(Move.ROCK, Move.randomMove.get()));
        actions.put("p", () -> play(Move.PAPER, Move.randomMove.get()));
        actions.put("s", () -> play(Move.SCISSORS, Move.randomMove.get()));
    }

    public void play(Move user, Move spider) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to a game of rock ✊, scissor ✂, paper ✋!
                You will play against the spider🕷️  and the score will be kept.
                """);
        

    }

    private int playRound(Move user, Move spider) {
        
    }
    
    private String getChoice(Scanner scanner) {
        System.out.println("""
            Enter your next move: 
        \n(Rock = r, Paper = p, Scissors = s)
        """);
        return scanner.nextLine();
    }
    /* 
    public void play() {
    
        String[] gameArray = {"Rock✊ ", "Paper✋ ", "Scissors✂ "};
        int playerScore = 0; int spiderScore = 0; int playerChoice = 0; int spiderChoice = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Score: You " + playerScore + " - Spider " + spiderScore);
        System.out.println("Select rock ✊ [r], scissor ✂ [s], paper ✋ [p] or quit [q]:");
        String choice = scanner.nextLine();
        while (!choice.equalsIgnoreCase("q") &&
        !choice.equalsIgnoreCase("r") &&
        !choice.equalsIgnoreCase("p") &&
        !choice.equalsIgnoreCase("s")) {
            System.out.println("Please enter a valid choice...");
            choice = scanner.nextLine();
            scanner.close();
        }
        while (!choice.equalsIgnoreCase("q")) {
            switch (choice) {
                case "r":
                    playerChoice = 0;
                    break;
                case "p":
                    playerChoice = 1;
                    break;
                case "s":
                    playerChoice = 2;
                    break;
                default:
                    break;
            }
            if (choice.equalsIgnoreCase("r") || choice.equalsIgnoreCase("s") || choice.equalsIgnoreCase("p")) {
            spiderChoice = 0 + (int)(Math.random() * ((2 - 0) + 1));
            System.out.print("You chose " + gameArray[playerChoice] + " and the spider chose " + gameArray[spiderChoice] + ".");
            if (playerChoice == spiderChoice) {System.out.println("It's a draw! No points!");}
            else if (playerChoice == 0 && spiderChoice == 1){
                System.out.println(" " + gameArray[spiderChoice] + " beats " + gameArray[playerChoice] +"! The spider wins this round.");
                spiderScore += 1;
            }
            else if (playerChoice == 0 && spiderChoice == 2) {
                System.out.println(" " + gameArray[playerChoice] + " beats " + gameArray[spiderChoice] + "! You win this round.");
                playerScore += 1;
            }
            else if (playerChoice == 1 && spiderChoice == 0) {
                System.out.println(" " + gameArray[playerChoice] + " beats " + gameArray[spiderChoice] + "! You win this round.");
                playerScore += 1;
            }
            else if (playerChoice == 1 && spiderChoice == 2) {
                System.out.println(" " + gameArray[spiderChoice] + " beats " + gameArray[playerChoice] + "! The spider wins this round.");
                spiderScore += 1;
            }
            else if (playerChoice == 2 && spiderChoice == 0) {
                System.out.println(" " + gameArray[spiderChoice] + " beats " + gameArray[playerChoice] + "! The spider wins this round.");
                spiderScore += 1;
            }
            else if (playerChoice == 2 && spiderChoice == 1) {
                System.out.println(" " + gameArray[playerChoice] + " beats " + gameArray[spiderChoice] + "! You win this round.");
                playerScore += 1;
            }
            System.out.println("Score: You " + playerScore + " - Spider " + spiderScore);
            choice = scanner.nextLine();
            while (!choice.equalsIgnoreCase("q") &&
                   !choice.equalsIgnoreCase("r") &&
                   !choice.equalsIgnoreCase("p") &&
                   !choice.equalsIgnoreCase("s")) {
                System.out.println("Please enter a valid choice...");
                choice = scanner.nextLine();
            }
            }
        } 
        System.out.println("The final score is " + playerScore + "-" + spiderScore + "!");
        if (playerScore > spiderScore) {System.out.println("You win!!!");}
        if (playerScore < spiderScore) {System.out.println("The spider won...");}
        else if (playerScore == spiderScore) {System.out.println("It was a draw! What are the odds?");}
        System.out.println("Thank you for playing my game against the spider!");
    }*/
}

