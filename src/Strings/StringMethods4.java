package Strings;

import java.util.Scanner;

public class StringMethods4 {
    public static void main(String[] args) {

        String str1 = "Dev X School" ;
        System.out.println( str1.equals("DevX School"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Are you left Handed or Right Handed ?");

        String str = sc.nextLine();

        if (str.equals("Left")){
            System.out.println("Sit on the right corner of the table ");
        }
        else if (str.equals("right")){
            System.out.println("Sit on the left corner of the table");
        }
        else{
            System.out.println("Invalid input . Enter left or right ");
        }

        String passWord = "ChaseBankPass222";
        String userName = "DevX School";

        System.out.println("Please Enter your user Name ");
        String userNameEntered = sc.nextLine();
        System.out.println("Please Enter you password ");

        String passEntered = sc.nextLine();

        if (userName.equalsIgnoreCase(userNameEntered) && passEntered.equals(passWord)){
            System.out.println("You are Successfully  Logged in   ");
        }
        else {
            System.out.println("Invalid Password entered ");
        }

        System.out.println("Where are you from ? ");

        String origin = sc.nextLine();

        System.out.println(origin.toLowerCase());

        if (origin.toLowerCase().contains("stan")){
            System.out.println("Central Asian Folk ");
        }

        if (origin.toUpperCase().contains("STAN")){
            System.out.println("Central Asian Folk Uppercase ".toUpperCase() + " " + origin);
        }

        String strTrim = "    {John Doe  }    ";

        System.out.println(strTrim);
        System.out.println(strTrim.length());
        System.out.println(strTrim.indexOf("{"));
        System.out.println(strTrim.trim());
        System.out.println(strTrim.trim().length());
        System.out.println(strTrim.trim().indexOf("{"));


        String lone = "Lone";
        String bone = lone.replace('L', 'B');
        System.out.println(bone);

        String chrome = lone.replace("Lon", "Chrom");
        System.out.println(chrome);

        System.out.println("Please enter you Name ");
        String name = sc.nextLine();
        name = name.trim();
        name = name.toLowerCase();
        String leaveOnlyFirstLetter = name.substring(0,1);
        System.out.println("First letter of my name : " + leaveOnlyFirstLetter);
        String convertToUpperCase = leaveOnlyFirstLetter.toUpperCase() ;
        System.out.println("First letter after upper case " + convertToUpperCase);
        char firstLetterUpperCased = convertToUpperCase.charAt(0);
        System.out.println(name.replace(name.charAt(0),firstLetterUpperCased));
        // " john " ;

        String animal = "animal";
        System.out.println(animal.replace('a' , 'A'));

        



    }
}
