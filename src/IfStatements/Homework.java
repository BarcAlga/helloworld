package IfStatements;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {


        int i,numbers=0,sum=0;
        double avg;
        {

            System.out.println(" Input the  5 numbers : ");

        }
        for (i=0;i<5;i++)
        {
            Scanner in = new Scanner(System.in);
            numbers = in.nextInt();

            sum +=numbers;
        }
        avg=sum/5;
        System.out.println("The sum of 5 no is : " +sum+"\nThe Average is : " +avg);




    }
}
