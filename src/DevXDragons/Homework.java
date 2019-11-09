package DevXDragons;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int pin = 124578;

        System.out.println("WELCOME TO THE BANK OF AMERICA  ");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while ( entry != pin )
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");





    }
}
