package SwithStatements;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("The compare two numbers");

        int num = 25;
        int num2 = 39;


        if (25<39 ){
            System.out.println( "  The first number is smaller: "  );
        }else if (39>25){
            System.out.println("The second number is smaller : ");
        }
        else {
            System.out.println("Invalid number entered ");
        }




    }
}
