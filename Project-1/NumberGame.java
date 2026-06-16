import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        char playAgain;
        do {
            int secretNumber = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            System.out.println("\n=== Number Guessing Game ===");
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("Try to guess it!");
            while (true) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;
                if (guess > secretNumber) {
                    System.out.println("Too High! Try again.");
                } else if (guess < secretNumber) {
                    System.out.println("Too Low! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("Attempts taken: " + attempts);
                    score += Math.max(100 - attempts * 5, 10);
                    break;
                }
            }
            System.out.println("Current Score: " + score);
            System.out.print("Do you want to play another round? (Y/N): ");
            playAgain = sc.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');
        System.out.println("\nFinal Score: " + score);
        System.out.println("Thank you for playing!");
        sc.close();
    }
}