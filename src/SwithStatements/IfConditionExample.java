package SwithStatements;

import java.util.Scanner;

public class IfConditionExample {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println(" Input the first number :  ");
        int firstInput = input.nextInt();
        System.out.println(" Input the second number :  ");
        int secondInput = input.nextInt();
        System.out.println(" Input the third number : ");
        int thirdInput = input.nextInt();

        if (firstInput+secondInput == thirdInput){
            System.out.println("The result is: " + true);
        } else {
            System.out.println("The result is: " + false);

        }












    }
}
