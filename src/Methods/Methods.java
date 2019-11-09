package Methods;

public class Methods {
    public static void main(String[] args) {

     //   int sum1 = 1+2;
       // System.out.println("The result of sum1 = " + sum1);

//        int sum2 = 2+4;
  //      System.out.println(" The result of sum2 = " + sum2);

      // int firstSum = sumUpTwoNumbers(5,7);
      //  System.out.println(" The value of the first Sum " + firstSum);

       // int secondSum = sumUpTwoNumbers(10,10000);
       // System.out.println("The value of the second Sum " + secondSum);


     //   int  celsius = convertFahrenheitToCelsius(80);

     //   System.out.println("Converted result of your fahrenheit to celsius : " + celsius);



      //  int celsius2 = convertFahrenheitToCelsius(100);
      //  System.out.println(" Converted result of your fahrenheit to celsius : " + celsius2);

        String  nameThatCameFromAMethod = giveYourName( " John Doe ");
        System.out.println(nameThatCameFromAMethod);

        String name2 = giveYourName(" Ketty Perry ");
        System.out.println(name2);

    }

    public static int sumUpTwoNumbers(int num1 , int num2 ){
        int sum =num1 + num2;
        // return is a keyword of a method that specifies an end of the function
        // and returns the result which the programmer has specified.
        // whatever comes after the return keyword is what comes out of the method when it's called .
        return sum;

    }
    public static int  convertFahrenheitToCelsius(int f){
        int celsius = (f -32) * 5/9;
        return celsius;

    }
    public static String giveYourName (String name){
        return "Your name is " + name;
    }
}
