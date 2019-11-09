package IfStatements;
import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {


        int a,b;

        System.out.print("Input number of terms :  4");
        Scanner in = new Scanner(System.in);
        b = in.nextInt();

        for(a=1;a<=b;a++)
        {
            System.out.println("Number is : " +a+" and cube of " +a+" is : "+(a*a*a));
        }








    }
}
