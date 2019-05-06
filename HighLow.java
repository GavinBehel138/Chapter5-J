import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        int userGuess = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.\n");
        System.out.println("Pick a number between 1 to 10\n");
        System.out.println("Guess correctly win a prize.\n");

        int random = (int) (Math.random() * 2);
        while (userGuess == random) {
            System.out.println("Pick a number >>>>");
            userGuess = input.nextInt();
            if (userGuess == random) {
                System.out.println("Guessed Correctly!!! Connor has your prize out back");
            } else if (userGuess > random) {
                System.out.println("Wrong number it was too high " + random);
            } else if (userGuess < random) {
                System.out.println("Wrong number it was too low " + random);
            } else {
                System.out.println("That number was outisde the range of 1-10");
            }
            count = count + 1;
        }
        System.out.println("Guessed in " + count + " tries");
    }
}
