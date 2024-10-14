import java.util.Random;// makes the random happen
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;
        int userGuess;
        boolean done = false;

        do {
            System.out.print("Guess the number (between 1 and 10): ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();

                if (userGuess < 1 || userGuess > 10) {
                    System.out.println("Enter a guess from 1-10.");
                } else {

                    System.out.println("The number was: " + randomNumber);

                    if (userGuess == randomNumber) {
                        System.out.println("Congratulations! Your guess is correct!");
                    } else if (userGuess < randomNumber) {
                        System.out.println("Too low. Try again.");
                    } else {
                        System.out.println("Too high. Try again.");
                    }
                    done = true;
                }
            } else {
                System.out.print("Invalid input. Please enter a valid integer between 1 and 10: ");
            }

            in.nextLine();

        } while (!done);


        in.close();
    }

}
