public class ComparisonOperators {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 =10;

        System.out.println("Is five equal to ten : " + (5!=10));
        System.out.println("Is five equal to five?: " + (5!=5) );
        System.out.println("Is 5.5 equal to 10.6? " + (5.5 !=10.6));
        System.out.println("Is 5.5 equal to 5 ?? "  + (5.5 != 5));
       // System.out.println("Is true equal to 5 ?? " + (true !=5)); // Does not compile bc two unmatched types..
        System.out.println("Is true equal to 5 ?? " + (true !=false));

        System.out.println("Is char A equal to 65?? " + ('A' != 65));
      //  System.out.println("Is String Hello World equal to char A? " + ("Hello World != 'A'));

        System.out.println("Is Hello World  not equal to Hello world " + ("Hello World" != "Hello World"));
        System.out.println("Is hello World  not equal to Hello World " + ("Hello World" !="Hello World"));
        System.out.println("Is char A equal to B? " + ('A' != 'B'));
        System.out.println("Is 5 not equal to 10? " + (5 !=10));

        System.out.println("Is 10 > than 5? " + (10>5));
        System.out.println("Is 10 less than 5? " + (10<5));
        System.out.println("Is 99.9 less than 99? " + (99.9 >99));
       // System.out.println("Is true less than false ? " + (true<false)); bc boolean can only be compared with == or != ..

        System.out.println("Is A less than 67? " + ('A' <67));
        System.out.println("Is 55 < 55 ? " + (55<55));


        System.out.println("Is 10 less than 5? " + (10<=5));
        System.out.println("Is 99.9 less than 99? " + (99.9 <=99));
        System.out.println("Is A less than 67? " + ('A' <=67));
        System.out.println("Is 55 less or equal to 55  ? " + (55 <= 55));

        int change = (int) ( 10.99*100);

        float domeFloat = 10.5F;

        long someLongNumber = 10000000011L;

        byte someByte = 10;

    }
}
