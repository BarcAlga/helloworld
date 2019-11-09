package IfStatements;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" What's your Gender ?");

        char gender = sc.nextLine().charAt(0);

        switch (gender){
            case 'F' :
                System.out.println(" It's a girl ");
                break;
            case 'M':
                System.out.println("It's a boy");
                break;
            default:
                System.out.println(" Invalid entry ");
        }













    }
}
