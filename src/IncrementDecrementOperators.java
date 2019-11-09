public class IncrementDecrementOperators {
    public static void main(String[] args) {

        int num1=100;
        int num2 = 200;
        num1++; // num1 = num1 + 1 ;
        num2--;  // num2 = num2 - 1 ;
        System.out.println("Number one is : " + num1);
        System.out.println("Number two is : " + num2);

        num1--;
        num2++;

        System.out.println("Number one is: " + num1);
        System.out.println("Number two is : " + num2);

        int num1_1= num1;

        System.out.println(" Number one pre increment : " + ++num1);
        System.out.println("Number one post increment: " + num1_1++);
        System.out.println("Number one.one value : " +  num1_1);
   int y =100;
   int x = 500;
   System.out.println("Y pre increment : " +  ++y); // pre increment y=101
   System.out.println("Y value : " + y); // y=101

   System.out.println("X post increment : " + ++x); //x = 501
   System.out.println("X value : " + x++); // x=501
   System.out.println("X value one more time : " + x); //x=502 because previous line post incremented x
   System.out.println(" X value third time : " + ++x); // x=503
   System.out.println("X value : " + x++); // x=503
   System.out.println(" X value line 38: " + x); // x=504 because previous line post incremented x

   int i =10;
   int z =18;

   int result = i++; // the value of post  increment (i++) doesn't change on the same statement. However it gets a new value
        //in the next statement its (i) used.
   System.out.println("Result value is : " + result); // result is 10 because 10++ still returns 10 on same line;
   System.out.println("I value is : " + i);
   System.out.println("I value is : " + i);
   System.out.println("I post increment : " + i++); // i =11
    System.out.println("I: " +i); //i=12
    System.out.println("I : " +i); // i=12
   System.out.println("I value on the line 62: " + i++); //i=12
   System.out.println("Line 64 i value: " +i); //i=13

  int pre =8;
  int preResult = ++pre;
  System.out.println("The value of pre is: " + pre);
  System.out.println("The value of preResult is:" + preResult);









    }
}
