import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {

        Scanner tom = new Scanner(System.in);
        System.out.println("Please enter your age ");
        int age = tom.nextInt();

        if (age >= 18) {
            System.out.println("You can apply for Driver licence ");
        } else {
            System.out.println("You are not eligible    " + (18 - age));
            System.out.println("You have to wait for  " + (18 - age) + "  few years");

        }
    }
}