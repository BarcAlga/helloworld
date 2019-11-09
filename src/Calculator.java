import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // define new variable (float) that will represent numbers
        float a;
        float b;

        // define
        char operation;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the first number : ");

        a = keyboard.nextFloat();
        System.out.println("Enter the second number: ");

        b = keyboard.nextFloat();

        //  Prompt the user for the operation to be completed
        System.out.println("Enter the operation: ");
        // Set the operation to the character that user enters
        operation = keyboard.next().charAt(0);

        // output the two values and the operation to the user
        System.out.println(a + " " + operation + " " + b + " = ???");
        //close the keyboard to prevent memory leakage
        keyboard.close();
    }

    private static void multiply(float a, float b) {
        //add the  two values passed
        float c = a * b;
        //print out the result
        System.out.println(a + " *" + b + "*" + c);

       // private static void substruction ( float a, float b){

        }
      //  float d = a - b;

      //  System.out.println(a + " - " + b + " - " + d);
      //  private static void addition ( ){

        }
       // float e = a + b;
       // System.out.println(a + "+ " + b + " +" + e);
     //   private static void Division ( float a, float b){
        //    float f = a / b;
        //    System.out.println(a + "/ " + " / " + f);











         ///   System.out.println("You are totally wrong");


        //}

   // }
//}


