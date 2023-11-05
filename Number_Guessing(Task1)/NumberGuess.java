import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 10;
        int rounds = 0;
        int score = 10;

        System.out.println("**************************Welcome to the Number Guessing Game!!!***************************************\n");
        System.out.println("You have to guess Number between 1 to 100");
        System.out.println("You have total 10 attempts to guess the number");
        System.out.println("After Each round your Score will be decresed by 1");
        System.out.println("So try to guess the number in minium attempts\n");
        
        System.out.println("**************************ALL THE BEST!!!***************************************\n");


        while (true) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            System.out.println("Let's Play Game  ");
            System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange);

            while (attempts < attemptsLimit) {
                System.out.println("CAN YOU GUESS THAT?");
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                       score = (score - attempts)*10; 
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("");
                    System.out.println("Try a higher number than "+ userGuess);
                } else {
                    System.out.println("Try a lower number than "+ userGuess);
                }
            }

            System.out.println("The correct number was: " + targetNumber);
            rounds++;

            System.out.println("Your current score: " + score);

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing! You completed " + rounds + " rounds with a final score of " + score);
    }
}
