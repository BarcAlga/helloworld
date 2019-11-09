import java.util.Scanner;

public class ClockTimer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What time is it ?");
        int hour = input.nextInt();
        System.out.println("Is it am or pm ");
        char amOrPm = input.next().charAt(0); // a or p is character

        if (hour > 0 && hour < 11 && amOrPm == 'a') {
            System.out.println("Good morning baba");
        }
        if (hour > 0 && hour <= 6 && amOrPm == 'p') {
            System.out.println("Good evening baby");
        }

        if (hour >= 6 && hour <= 11 && amOrPm == 'p') {
            System.out.println("Good night");
        }

    }
}
