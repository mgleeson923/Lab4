import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Calculate the factorial of a number

        Scanner scnr = new Scanner(System.in);
        int userNum = 0;

        System.out.println("Let's calculate Factorials!");

        System.out.print("Please input an integer from 1 to 10: ");
        while (!scnr.hasNextInt()) {
            System.out.println("That is not a number. Please enter a number.");
            scnr.next();
        }
        userNum = scnr.nextInt();

        
    }
}
