import java.util.Scanner;

public class PracticeAgain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What's your GPA ");
        double gpa = sc.nextDouble();

        if (gpa > 3.5){
            System.out.println("You will get a good job");

        }
        else {
            System.out.println("You need to get more point  to get job dude !!   " + gpa);
            System.out.println("You need to get  "+ gpa+ " more points if you wanna job");
        }


    }
}
