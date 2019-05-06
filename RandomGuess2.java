import java.util.Scanner;

public class RandomGuess2
{
    public static void main(String[] args) {

        int userEntry;
        String result = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.\n");
        System.out.println("Its called Random Guess\n");
        System.out.println("Enter 0, 1, or 2 >>>>>\n");
        userEntry = input.nextInt();
        int random = (int) (Math.random() * 2);

        if(userEntry > random){
            result = "Lower";
        }
        if(userEntry < random) {
            result = "Higher";
        }
        if(userEntry == random) {
            result = "You win";
        }
        System.out.println(result);
    }
}
