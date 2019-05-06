import java.util.Scanner;

public class AscendingDescending {

    public static void main(String[] args) {

        int userEntry1;
        int userEntry2;
        int userEntry3;
        String result;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.\n");
        System.out.println("Its called Ascending or Descending\n");
        System.out.println("Enter 3 numbers >>>>>\n");
        userEntry1 = input.nextInt();
        userEntry2 = input.nextInt();
        userEntry3 = input.nextInt();

        if(userEntry1 > userEntry2 & userEntry1 > userEntry3){
            result = "Numbers are descending";
            System.out.println(result);
        }
        if(userEntry1 < userEntry2 & userEntry1 < userEntry3) {
            result = "Numbers are ascending";
            System.out.println(result);
        }
    }
}
