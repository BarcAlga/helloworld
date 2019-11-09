package SwithStatements;

import java.util.Scanner;

public class OddNaturalSum {
    public static void main(String[] args) {

        int a,b,sum=0;

        System.out.print("Input number of terms is: ");
        {
            Scanner in = new Scanner(System.in);
            b = in.nextInt();
            System.out.println ("\nThe odd numbers are :");
            for(a=1;a<=b;a++)

            {
                System.out.println (2*a-1);
                sum+=2*a-1;
            }
            System.out.println ("The Sum of odd Natural Number up to " +b+" terms is: " +sum);

        }














    }
}
