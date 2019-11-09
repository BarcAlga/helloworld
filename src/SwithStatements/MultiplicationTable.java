package SwithStatements;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int number=sc.nextInt();
        for(int a=1; a <= 10; a++)
        {
            System.out.println(number+" * "+a+" = "+number*a);
        }











    }
}
