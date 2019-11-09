package Strings;

import java.util.Scanner;

public class StringMethod2 {
    public static void main(String[] args) {
         // how tp find the first o in DevX School

      int indexOfO = "DevX School".indexOf("o");
        System.out.println("DevX School".charAt(indexOfO));

       System.out.println( "DevX School".substring("DevX School".indexOf("S")));

       String str = "American Dream Dream De Big";

        System.out.println(str.substring(str.lastIndexOf("Dream")));

        System.out.println(str.substring(15));

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter you Last Name and First Name inside {}");

        String name = sc.nextLine();
        name = name.trim();
        System.out.println(name);

        int openingCurly = name.indexOf("{");
        System.out.println("opening " + openingCurly);
        String nameWithoutOpenCurly = name.substring(openingCurly +1);

        int closingCurly = name.indexOf("}");
        System.out.println("index of closing " + closingCurly);
        String nameWithoutClosingCurly = nameWithoutOpenCurly.substring(openingCurly +1 ,closingCurly -1);
        System.out.println(nameWithoutClosingCurly);



    }
}
