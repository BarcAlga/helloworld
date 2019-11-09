package SwithStatements;
import java.util.Scanner;
public class TrafficLights {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        System.out.println("1- is for green;" +
                "2- is for yellow;" +
                "3- is for red");
        int number = input.nextInt();

        switch(number){
            case 1 :
                System.out.println("Traffic light is green");
                break;
            case 2:
                System.out.println("Traffic light is yellow");
                break;
            case 3:
                System.out.println("Traffic light is red");
                break;
            default:
                System.out.println("Not valid traffic light");
                break;
            //  System.out.println("Testing only");

        }




    }
}
