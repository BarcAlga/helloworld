package IfStatements;
import java.util.Scanner;
public class NestedIfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int userGivenNumber = input.nextInt();

        if (userGivenNumber > 0) {
            System.out.println("Your number is positive ");

            if (userGivenNumber % 2 == 0) {
                System.out.println("Even number");
                if (userGivenNumber > 20) {
                    System.out.println("Your number is more than twenty ");
                }
            } else {
                System.out.println("Your number is ODD ");
            }
        } else if (userGivenNumber < 0) {
            System.out.println("Your number is negative ");
        } else {
        }
        System.out.println("Your number is zero ");
    }
}