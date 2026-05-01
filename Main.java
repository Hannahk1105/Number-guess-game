import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        int guess = 0;
        System.out.println("Guess a number between 1 and 10");
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("You got it!");
            }
        }
    }
}
