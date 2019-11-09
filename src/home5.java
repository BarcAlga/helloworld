import java.util.Scanner;
public class home5 {
    public static void main(String[] args) {

        System.out.println("My first input number  125");

        Scanner input=new Scanner(System.in);

        int firstinputnumber=input.nextInt();
        System.out.println("My second input number 24");

        int secondinputnumber=input.nextInt();
        System.out.println("My total number is:  "+(firstinputnumber / secondinputnumber));

    }
}
