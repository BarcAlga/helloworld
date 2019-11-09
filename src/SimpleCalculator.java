import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers");

        double first = input.nextDouble();
        double second = input.nextDouble();

        System.out.println("Enter the operators: (+,-,*,/,%): ");

        char operator = input.next().charAt(0);

        double result;
        switch (operator){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result= first % second;
                break;
            default:
                System.out.println(" Error !!  The operator is not correct ");
                return;


        }
        System.out.println("The result is: " + result);


    }
}
