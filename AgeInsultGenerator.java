import java.util.Scanner;

public class AgeInsultGenerator {

    public static void main(String[] args){

        int age;
        String job;
        String result = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my age insult generator.");
        System.out.print("Please enter your age >>>>");
        age = input.nextInt();

        if(age <= 12){
            result = "You are not a teenager, and probably need to learn how to use deodorant.";
        }
        else if(age > 12 && age < 20){
            result = "You might be a teenager";
        }
        else if(age >= 21 && age < 30){
            result = "I hope you went to college and got a job!";
            System.out.print("Did you get a job >>>>");
            job = input.next();
            if(job == "Yes"){
                result = "Yes, I have a job";
            }
            else
                result = "No, I am a dead beat";
        }
        if(age <= 65){
            result = "You are a pretty old dude and are going to pass away very soon.";
        }
        displayResult(result);
    }
    public static void displayResult(String result){
        System.out.println(result);
    }
}
