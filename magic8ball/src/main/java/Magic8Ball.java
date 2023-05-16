import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {

    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {

        // 2. Get the user to enter a question for the magic 8-ball to answer
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's up?");
        String userQuestion = scanner.nextLine();


        // 3. Make a variable and initialize it to a random number.
        //
        //    // Get random a number from: [0, 1, 2, 3]
        int randNumber = new Random().nextInt(4);


        // 4. If the random number is 0

        // Tell the user "Yes"
        if (randNumber == 0) {
            System.out.println("Yes.");

            // 5. If the random number is 1

            // Tell the user "No"
        } else if (randNumber == 1) {
            System.out.println("Nope.");

            // 6. If the random number is 2

            // Tell the user a custom response
        } else if (randNumber == 2) {
            System.out.println("I don't see why not.");

            // 7. If the random number is 3

            // Tell the user a custom response
        } else {
            System.out.println("I honestly don't know.");
        }
    }
}

