package IfStatements;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter your Quiz score ");
        int quiz = input.nextInt();
        if (quiz < 0 || quiz > 100){
            System.err.println("Your score is invalid. please enter a number 0-100 ");
        }
        System.out.println("Please enter your mid-term score : ");
        int midTerm = input.nextInt();
        System.out.println("Please enter your final Score : ");
        int finalScore = input.nextInt();
        int average = (quiz + midTerm + finalScore)/3;
        if (average >= 90 && average <= 100  ){
            System.out.println(" You grade is 'A' ");
        }
     else  if (average >= 70 && average < 90){
           System.out.println(" Your grade is  ' B ' ");
       }
    else  if (average <= 50 && average < 70){
          System.out.println(" Your grade is  ' C ' ");
      }
   else  if (average < 50 && average > 0){
         System.out.println(" Your grade is ' F '");
     }
   else {
       System.out.println("Average score must be in range of 0 -100... Please try again!!!! ");
        }








    }


}