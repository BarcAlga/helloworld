package ArithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        int sum = num1+num2;

        long longNum1 = 10000l;
        long longNum2 = 5000l;
        long longSum = longNum1 + longNum2;

        double doubleNumber1 = 59.99;
        double doubleNumber2 = 45.50;
        double doubleSum = doubleNumber1 + doubleNumber2;

        System.out.println("Number one:" + num1);
        System.out.println("Number two:" + num2);
        System.out.println("Sum of the two number: " + sum);

        System.out.println("Sum of the two long numbers:" + longSum);
        System.out.println("Double Sum: " + doubleSum);

         //  int sumofLongAndInt = num1 + longNum1;
         long sumofLongAndInt = num1 + longNum1;
         System.out.println("Long and Integer Sum: " + sumofLongAndInt);

         int sumOfLongAndInt2 = (int) (num1 + longNum1);
         System.out.println("The Sum of long and int after casting: " + sumOfLongAndInt2);

         byte byteNum1 = 24;
         short shortNum1 = 5100;

           // byte sumOfByteAndShort = byteNum1 + shortNum1;
            // short  sumOfByteAndShort = byteNum1 + shortNum1;

        int  sumOfByteAndShort = byteNum1 + shortNum1;
             System.out.println("Sum of byte and short: " + sumOfByteAndShort);


             // casting - changing the data types.
        short sumOfByteAndShorts2 = (short)( byteNum1 + shortNum1);
             System.out.println(" Sum of byte and short after casting: " + sumOfByteAndShorts2);
             int x = 100000;
             short shortNum = 32000;
             short sumOfByteAndShort3 = ( short) (x  + shortNum);

             System.out.println(" The sum of short and integer: "+ sumOfByteAndShort3);

             int numberOne = 60;
             int numberTwo = 20;
             int difference = numberOne - numberTwo;
             System.out.println("the difference of two numbers: " + difference);

             difference = numberOne - 80;

             System.out.println("the difference of two numbers part 2: " + difference);

             int multiplyNum1 = 35;
             int multiplyNum2 = 13;
             int multiplicationResult = multiplyNum1 * multiplyNum2;

             System.out.println("Multiplication result: " + multiplicationResult);

             multiplicationResult =  (int) 60000000000000000l * -10;
             System.out.println("Multiplication result part 2: " + multiplicationResult);

             int divisionNumber = 65;
             int divisionNumber2 = 5;

             int divisionResult = divisionNumber / divisionNumber2;
             System.out.println("Division result is: " + divisionResult);

             divisionResult = 9/2;
             System.out.println("Division result with decimal points: " + divisionResult);

             int  divisionResult2 = (int)( 9./2.0);
             System.out.println("Division result with decimal points stored in a double : " + divisionResult2);

        double  divisionResult3 =  9./2.0;
        System.out.println("Division result with decimal points stored in a double  part 2: " + divisionResult3);

        int round = 17/6;
        System.out.println("The rounded result: " + round);

        double doubleNumber = 6.8;
        int intNumber = (int)6.8;
        System.out.println("double number : " + doubleNumber); //6.8
        System.out.println("intNumber: " + intNumber); //6

       // int divideByZeroResult = 102/0; -> causes ArithmeticException error;

       // System.out.println("Divide be zero : " + divideByZeroResult);

        int  moduloResult = 9 % 3;
        System.out.println("modulo of 9 and 3 is " + moduloResult);

        moduloResult = 10 % 3;
        System.out.println("modulo of 10 and 3 is " + moduloResult);

      double  moduloResult2 = 12.5 % 5.5 ;
      System.out.println("modulo of 12.5 and 5.5 id : " + moduloResult2);








    }
}
