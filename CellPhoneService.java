import java.util.Scanner;

public class CellPhoneService
{
    public static void main(String[] args) {
        int serviceChoice;
        int servicePrice = 49;
        int servicePrice2 = 55;
        int servicePrice3 = 61;
        int servicePrice4 = 70;
        int wrongChoicePrice = 0;
        Scanner service = new Scanner(System.in);
        System.out.println("Welcome to the Horizon Cell Phone Service.");
        System.out.println("We will help you determine the price of your new phone service.");
        System.out.println("Please enter 1, 2, 3, or 4");
        serviceChoice = service.nextInt();
        switch (serviceChoice) {
            case 1:
                System.out.println("You have chosen Plan A.");
                System.out.println("The price is $" + servicePrice);
                break;
            case 2:
                System.out.println("You have chosen Plan B.");
                System.out.println("The price is $" + servicePrice2);
                break;
            case 3:
                System.out.println("You have chosen Plan C.");
                System.out.println("The price is $" + servicePrice3);
                break;
            case 4:
                System.out.println("You have chosen Plan D.");
                System.out.println("The price is $" + servicePrice4);
                break;
            default:
                System.out.println("You have not chosen Plan A, B, C, or D.");
                System.out.println("The price is $" + wrongChoicePrice);
                break;
        }
    }
}

