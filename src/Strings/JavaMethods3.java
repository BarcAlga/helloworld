package Strings;

import java.util.Scanner;

public class JavaMethods3 {
    public static void main(String[] args) {

        String str = " Hello World";
        String strObject = new String("Hello World") ;

        String strNull = null;

        String a = "java";
        String b = "JAVA";
        String c = "Python";

   //     System.out.println(a=b=c);
   //     System.out.println(2+2+"2"+4*3);

 //      boolean containsBoolean =  a.contains("java");
 //       System.out.println(containsBoolean);

 //       Scanner in = new Scanner(System.in);
  //      System.out.println("Please enter you Last Name");

  //      String lastName = in.nextLine();

   //     if (lastName.contains("ova") || lastName.contains("eva")){
  //          System.out.println("You  are female");
  //      }
   //    else {
  //          System.out.println(" You are not female ");
   //     }

      String str1 = "DevX";
      String str2 = str1.concat("School");
        System.out.println(str2);
        System.out.println(str1);

        System.out.println(str2 =str2.concat(" SDET"));

         str2 = str2.concat(" Fall 2019");

        System.out.println(str2);

        String sumsung = "SAMSUNG Digital World SAMSUNG";
        int index = sumsung.indexOf("S");
        int indexOfSamsung = sumsung.indexOf("SAMSUNG");

        int indexOfTal = sumsung.indexOf("tal");
        int indexOfW = sumsung.indexOf("World");
        int indexOfDD = sumsung.indexOf("aaskljskajfasjl");


        System.out.println(index);
        System.out.println(indexOfSamsung);
        System.out.println(indexOfTal);
        System.out.println(indexOfW);
        System.out.println(indexOfDD);

        int indexOfSum = sumsung.indexOf("SAM", 9);
        System.out.println(indexOfSum);

        int indexOfVAN = sumsung.indexOf("Digital ", 16);
        System.out.println(indexOfVAN);

        int indexOfSAM = sumsung.lastIndexOf("SAM");
        System.out.println(indexOfSAM);

        int indexOfS = sumsung.lastIndexOf("S");
        System.out.println(indexOfS);

        int indexOfG = sumsung.lastIndexOf("G");
        System.out.println(indexOfG);







    }
}
