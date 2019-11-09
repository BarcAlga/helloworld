package DevXDragons;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Your name :  Duke ");
        System.out.println("Your age : " );

        int age = input.nextInt();

        if (age <= 16 && age < 15){
            System.out.println(" Unfortunately You can not drive , Dukes  ");
        }
        if (age <= 17 && age > 16){
            System.out.println(" You can drive but you can not vote , Dukes  ");
        }
        if (age <= 24 && age < 23){
            System.out.println("You can vote but you can not rent a car , Dukes  ");
        }if (age >= 25 && age > 24){
            System.out.println(" You can do pretty much anything, Dukes ");
        }


    }
}
