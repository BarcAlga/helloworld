package Methods;

import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" What's your average  :  ");

        int average= sc.nextInt();


        if (average >= 80 && average < 90) {

            System.out.println(" Your grade is  'A' : ");
        }
        if ( average >= 60 && average < 70){
            System.out.println("Your grade is 'B' :" );
        }
        if (average >= 40 && average < 50){
            System.out.println("Your grade is 'C' :  ");

        }
        else {
            System.out.println(" Your grade is 'D' : ");
        }



    }
}
