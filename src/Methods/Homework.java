package Methods;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        int number1, number2, number3;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter the First Number : ");
        number1 = sc.nextInt();

        System.out.print(" Please Enter the Second Number : ");
        number2 = sc.nextInt();

        System.out.println("Please enter the Third Number : ");
        number3 = sc.nextInt();

        if(number1 > number2)
        {
            System.out.println("\n The greatest number is  = " + number1);
        }
        else if (number2 > number1)
        {
            System.out.println("\n The greatest  Number is  = " + number2);
        }
        else if (number3 > number2)
        {
            System.out.println("\n The greatest Number is = " + number3);
        }else{
            System.out.println("This numbers are equal : ");
        }















    }
}
