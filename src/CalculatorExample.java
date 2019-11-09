import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number1:");

        int number1=input.nextInt();
        System.out.println("Please enter your number2:");

        int number2=input.nextInt();


        System.out.println(" Your number is : "+(+number1+number2));
        int sum= number1+number2;
        System.out.println("Your total number is:");
    }
}
