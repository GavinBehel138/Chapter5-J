import java.util.Scanner;

public class GradeLevel {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String year;
        String result;
        System.out.println("Please enter what year you are in high school");
        year = input.next();

        switch(year)
        {
            case "Freshmen":
                result = "You are a first year student.";
                break;
            case "Sophomore":
                result = "You are a second year student.";
                break;
            case "Junior":
                result = "You are a third year student.";
                break;
            case "Senior":
                result = "You are a fourth year student.";
                break;
            default:
                result = "Invalid student";
        }
        System.out.println(result);
    }
    public static void aDifferentCaseBreak(){
        String result;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter what year you are in high school");
        int num = input.nextInt();

        switch(num)
        {
            case 1:
                result = "That is the number" + num;
                break;
            case 2:
                result = "That is the number" + num;
                break;
            default:
                result = "That is not a number available";
        }
        System.out.println(result);
    }
}
