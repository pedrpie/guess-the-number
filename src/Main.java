import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("---GUESS THE NUMBER---");

        int secretNumber = random.nextInt(10) + 1;
        int choice = 0;
        int attempts = 3;

        System.out.println("choose a number between 1 and 10:");

        while (choice != secretNumber && attempts > 0) {
            choice = scanner.nextInt();
            attempts--;

            if (choice == secretNumber){
                System.out.println("Victory! You guessed it right.");
            } else if (choice < secretNumber){
                System.out.println("Wrong! The number is bigger. (" + attempts + " attempts left)");
            } else if (choice > secretNumber) {
                System.out.println("Wrong! The number is smaller. (" + attempts + " attempts left)");
            }
        }

        if (choice != secretNumber){
            System.out.println("You lost! the number is " + secretNumber + ".");
        }

        scanner.close();
    }
}
