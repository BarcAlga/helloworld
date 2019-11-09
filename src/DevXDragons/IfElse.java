package DevXDragons;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" How old are you ? ");

        int age = input.nextInt();


        if (age <= 16){
            System.out.println(" I am sorry you can not drive ");
        }
        else if (age <= 17 ){
            System.out.println("You can drive but you can not vote ");
        }
        else if (age <= 24){
            System.out.println(" You can vote but you can not rent a car ");
        }else if (age >= 25){
            System.out.println("You can do pretty much anything ");
        }
        else {
            System.out.println(" Invalid number entered ");
        }











    }
}
