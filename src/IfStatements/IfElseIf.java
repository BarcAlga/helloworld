package IfStatements;
import java.util.Scanner;
public class IfElseIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create a scanner to be able to get
        // input(value) from a user

        int numberFromUser = input.nextInt(); // get a number from user

        if (numberFromUser >= 0){
            System.out.println("Your Number is positive ");
        }else if (numberFromUser == 0){
            System.out.println("Your number is zero ");
        }else
         {
            System.out.println("Your number is negative ");
            System.out.println("Else statement line 2 ");
          if (numberFromUser % 2 ==0){
              System.out.println("Your number is even");
          }
        }
    }
}
