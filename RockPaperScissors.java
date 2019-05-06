import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        int userEntry;
        String result = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.\n");
        System.out.println("Its called Rock Paper Scissors\n");
        System.out.println("Enter 0, 1, or 2 >>>>>\n");
        userEntry = input.nextInt();
        int random = (int) (Math.random() * 2);

        if(userEntry > random){
            result = "You win";
        }
        if(2 == random && 0 == userEntry){
            result = "You win";
        }
        if(userEntry < random) {
            result = "You lose";
        }
        if(userEntry == random) {
            result = "Its a tie";
        }
        System.out.println(result);
    }
}
