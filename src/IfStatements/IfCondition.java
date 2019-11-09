package IfStatements;

import java.util.Scanner;
public class IfCondition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String fullName = input.nextLine();
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {

            System.out.println(fullName + " can vote: ");
            System.out.println("Definitely: ");
            System.out.println("Don't vote for Trump: ");
        }
        System.out.println("Im outside of any if statement: ");
        System.out.println("So I run regardless: ");

        System.out.println("What time is it right now ??? ");
        int hour = input.nextInt();
        if (hour >= 0 && hour <= 11) {
            System.out.println("Good morning my  beautiful world!!!! ");
            hour++;
            System.out.println("The next hour will be: " + hour);
        } else {
            System.out.println("It's not morning any more. You slept the morning away !!");
        }

    }
}