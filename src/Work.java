import java.util.Scanner;
public class Work {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNum = 25;
        int secondNum = 5;
        int sum;
        System.out.println("Enter first Integer " );
        firstNum = sc.nextInt();
        System.out.println("Enter second Integer");
        secondNum = sc.nextInt();
        sum = firstNum + secondNum;
        System.out.println(" The sum of two integers: " +sum);

        int difference = firstNum - secondNum;
        System.out.println("Difference of first Integer ");
        firstNum =sc.nextInt();
        System.out.println("Difference of second Integer");
        secondNum = sc.nextInt();
        System.out.println("Difference of two Integer: " + difference);

        int Multiplication = firstNum * secondNum;
        System.out.println("The product of first Integer  ");
        firstNum= sc.nextInt();
        System.out.println("The product of second Integer");
        secondNum=sc.nextInt();
        System.out.println("The product of two Integer :" +Multiplication);

        Scanner bug= new Scanner(System.in);
         int a,b,sum1;
         float avg;
         System.out.println(" Enter first number : ");
         a = bug.nextInt();
         System.out.println("Enter second number: ");
         b=bug.nextInt();
         sum1 = a+b;
         avg = (float) (a+b)/2;
         System.out.println("Sum1: " +sum +"/nAverage :" +avg);
    }
}