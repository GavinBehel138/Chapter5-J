import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("What type of triangle are you solving for?");
        System.out.println("1. Right Triangle");
        System.out.println("2. Isosceles");
        System.out.println("3. Equilateral");

        choice = input.nextInt();

        if (choice == 1)
            rightTriangle();
        else if (choice == 2)
            isoscelesTriangle();
        else if (choice == 3)
            equilateralTriangle();
        else
            triangleDoesNotExist();
    }
    public static void isoscelesTriangle() {
        //triangle with two equal sides always try to find the base and area
        Scanner input = new Scanner(System.in);
        double sideB;
        double sideC;
        String sideChoice;

        System.out.println("What side of the triangle are you trying to solve for? B or C");
        sideChoice = input.next();

        if(sideChoice.equals("A")){
            System.out.println("What is side B? >>>");
            sideB = input.nextDouble();
            System.out.println("What is side C? >>>");
            sideC = input.nextDouble();
            System.out.println("What is side B times side C? >>>");
            calculateSideA(sideB, sideC, sideChoice);

        }
        else if(sideChoice.equals("B")){

        }
        else if(sideChoice.equals("C")){

        }
        else
            triangleDoesNotExist();
    }
    public static void equilateralTriangle() {
        //all sides are equal find the parameter and height
        Scanner input = new Scanner(System.in);
        double sideA;
        String sideChoice;

        System.out.println("What is the height of side A?");
        sideChoice = input.next();

        if (sideChoice.equals("A")) {
            System.out.println("What is side A? >>>");
            sideA = input.nextDouble();
            System.out.println("What is side A times 3? >>>");
            calculateSideA(sideA, sideA, sideChoice);
        } else
            triangleDoesNotExist();

    }
    public static void rightTriangle(){
        Scanner input = new Scanner(System.in);
        double sideA;
        double sideB;
        double sideC;
        String sideChoice;

        System.out.println("What side of the triangle are you trying to solve for? A, B, or C");
        sideChoice = input.next();

        if(sideChoice.equals("A")){
            System.out.println("What is side B? >>>");
            sideB = input.nextDouble();
            System.out.println("What is side C? >>>");
            sideC = input.nextDouble();
            calculateSideA(sideB, sideC, sideChoice);

        }
        else if(sideChoice.equals("B")){

        }
        else if(sideChoice.equals("C")){

        }
        else
            triangleDoesNotExist();
    }
    public static void calculateSideA(double b, double c, String choice){
        double a;
        a = Math.sqrt(c*c - b*b);
        System.out.println("The side " + choice + " = " + a);
    }
    public static void triangleDoesNotExist(){
        System.out.print("That side does not exist on a triangle dummy!!!!!!");
    }
}
