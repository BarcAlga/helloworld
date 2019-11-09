package SwithStatements;

import java.util.Scanner;

public class YearSeasons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your month Number ");

        int monthNum = sc.nextInt();
         String month;
         String season;
        switch (monthNum){
            case 1 :
                month = " January";
                season = " Winter " ;
                break;
            case 2 :
                month = " February";
                season = " Winter " ;
                break;

            case 3 :
                month = " March";
                season = "Spring" ;
                break;
            case 4:
                month = " April";
                season = "Spring" ;
                break;
            case 5 :
                month = " May ";
                season = "Spring" ;
                break;
            case 6 :
                month = " June ";
                season = " Summer " ;
                break;
            case 7 :
                month = " July ";
                season = " Summer " ;
                break;
            case 8 :
                month = " August ";
                season = " Summer " ;
                break;
            case 9 :
                month = " September ";
                season = " Autumn " ;
                break;
            case 10 :
                month = " October ";
                season = " Autumn " ;
                break;
            case 11 :
                month = " November ";
                season = " Autumn " ;
                break;
            case 12 :
                month = " December ";
                season = " Winter " ;
                break;
            default:
                month = " Invalid month number is entered ";
                season = " Wrong moth entry";
                break;



        }
              System.out.println(month);
        System.out.println(season + "from first switch statement ");

        switch ( month){
            case "January" :
                System.out.println(" Winter");
                break;
            case "February" :
                System.out.println(" Winter");
                break;
            case " March" :
                System.out.println(" Spring ");
                break;
            case " April " :
                System.out.println(" Spring");
                break;
            case " May " :
                System.out.println(" Spring");
                break;
            case " June " :
                System.out.println(" Summer ");
                break;
            case "July" :
                System.out.println(" Summer");
                break;
            case "August" :
                System.out.println(" Summer ");
                break;
            case "September" :
                System.out.println(" Fall");
                break;
            case "October " :
                System.out.println(" Fall");
                break;
            case "November" :
                System.out.println(" Fall  ");
                break;
            case "December" :
                System.out.println(" Winter");
                break;
            default:
                System.out.println(" Invalid month ");


        }







    }
}
