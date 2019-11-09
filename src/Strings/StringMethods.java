package Strings;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Hello- World!" ;
        String devX = "DevX School";
        int sizeOfMyString = str.length();

        System.out.println(sizeOfMyString);

        String str2 = "124567";

        int sizeOfMyString2 = str2.length();

        System.out.println(sizeOfMyString2);

        System.out.println(str.length());

       char wOfHelloW = str.charAt(6);
        System.out.println(wOfHelloW);

        str.charAt(6);

        char hyphen = str.charAt(5);
        System.out.println(hyphen);

        char hInDevX = devX.charAt(7);
        System.out.println(hInDevX);

        char dInHello = str.charAt(10);
        System.out.println(dInHello);

        char exclamation = str.charAt(12);
        System.out.println(exclamation);

        char lastCh = str.charAt(str.length()-1);

        char hOfDevX = devX.charAt(devX.length()-4);
        System.out.println(hOfDevX);

        char mixOfTwoStrs = str.charAt(devX.length()-6);
        System.out.println(mixOfTwoStrs);

       String world = str.substring(6);
        System.out.println(world);

        String school = devX.substring(5);
        System.out.println(school);
        char indexOutOfBound = str.charAt(12);
        System.out.println(indexOutOfBound);

        char firstChar = str.charAt(0);
        System.out.println(firstChar);

        String ello = str.substring(1,5);
        System.out.println(ello);

        String or = str.substring(8,10);
        System.out.println(or);

        String xs = devX.substring(3,6);
        System.out.println(xs);



    }
}
