package IfStatements;

import java.util.Scanner;
public class IfStatement {

    public static void main(String[] args) {

        System.out.println("Please enter some number...");
        Scanner sc = new Scanner(System.in);

        int givenNumber = sc.nextInt();
        boolean positiveNumber = givenNumber >= 0;
       boolean negativeNumber = givenNumber < 0;

       System.out.println("Your number is positive " + positiveNumber);
        System.out.println("Your number is negative " + negativeNumber);


        if (givenNumber > 0) {
            System.out.println("your number is positive");
            System.out.println("We are inside the first IF statement");
            System.out.println("Lol aI am still here");


        }

     if(givenNumber <= 0) {
          System.out.println("Your number is negative");


      }

      if (givenNumber >= 0 && givenNumber <=10){
          System.out.println("Your number is between  0-10 ");
      }
    }

}