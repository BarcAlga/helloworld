package WhileLoops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException {

        String str = "You are AWESOME";

        boolean isAwesome = true;

        int count = 0;

        while (isAwesome){
            System.out.println(str);
            count++;

            if (count >= 3) {
                isAwesome = false;
            }

        }
        System.out.println("While loop is exited ");

        int count2 = 0;
        while (count2 <= 4){
            System.out.println(str + " While loop 2 ");
            count2++;
        }

        int count3 = 5;
        while (count3 > 0){
            System.out.println(count3--);
            Thread.sleep(1000L);
            if (count3 == 0){
                System.out.println("Kaaaabbbbbbooooom");
            }

        }
        // every iteration -> cycle, add "G" to str1
        // print out the value of str1
        // "G" stop the when my str1 is "GGG" ;

        String str1 = "";
        while (!str1.equals("GGG")){
        str1 = str1.concat("G");
            System.out.println(str1);

        }
        System.out.println(str1);

        String str2 = " ";
        while (str2.length()<4){
            str2 = str2.concat("F");
            System.out.println(str2);
        }

        System.out.println(str2);

        String str3 = "Hello my friend";
   //    System.out.println(str3.charAt(0));
   //     System.out.println(str3.charAt(1));
   //     System.out.println(str3.charAt(2));
   //     System.out.println(str3.charAt(3));

        int i = 0;
        while (i < str3.length()){
            System.out.print(str3.charAt(i)+ " ");
            i++;
        }


        boolean isTestPass = true;
        while(isTestPass) {
            System.out.println("Enter your score for test1");
            Scanner sc = new Scanner(System.in);
            int score1= sc.nextInt();
            System.out.println("Enter your score for test2");
            int score2 = sc.nextInt();
            System.out.println("Enter your score for test3");
            int score3 = sc.nextInt();
            int average = (score1 + score2 + score3)/3;
            if (average < 60){
                System.out.println("You have to take the exam again");
            }else{
                System.out.println("You passed the class");
                isTestPass = false;
            }
        }

        Scanner sc = new Scanner(System.in);

        String passWord = "ChaseBankPass222";
        String userName = "DevX School";

        boolean retry = true;
        int retryCount = 0;
        while (retry && retryCount <3) {
            System.out.println("Please Enter your user Name");
            String userNameEntered = sc.nextLine();
            System.out.println("Please Enter your password");
            String passEntered = sc.nextLine();
            if (userName.equalsIgnoreCase(userNameEntered) && passEntered.equals(passWord)) {
                System.out.println("You are Successfully Logged in");
                retry = false;
            } else {
                System.out.println("Invalid Password entered");
                retryCount++;
             if (retryCount >= 3){
                 retry = false;
             }

            }
        }

    }



}

