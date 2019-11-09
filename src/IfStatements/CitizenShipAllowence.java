package IfStatements;

import java.util.Scanner;

public class CitizenShipAllowence {

    // find out if the user is eligible for citizenship
    // must have a greencard
    // must have lived for 5 years
    // must pass the exam
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Are you a permanent resident of US ? please enter true or false ");
        boolean greenCardHolder = sc.nextBoolean();

        System.out.println(" How long have you lived in US ? ");
        int yearsInUs = sc.nextInt();

        System.out.println("Did you pass the exam ? true  or false ");
        boolean examPassed = sc.nextBoolean();

        if (greenCardHolder) {

            if (yearsInUs >= 5) {

                if (examPassed) {
                    System.out.println(" You are eligible to get a Citizenship ");
                }

                else{
                    System.out.println("You failed the exam . Prepare for next time");
                }

            }

            else{
                System.out.println("You are not eligible for Citizenship. You need to be in US" + (5 - yearsInUs) + "more years ");
            }
        } else {
            System.out.println("You are not eligible for Citizenship because of you are not greencard holder ");
        }










    }
}
