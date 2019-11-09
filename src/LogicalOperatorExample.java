import java.util.Scanner;

public class LogicalOperatorExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Is it raining now?");
        boolean isRainy = sc.nextBoolean();


        System.out.println("Is it Sunny now?: ");
        boolean isSunny = sc.nextBoolean();

        boolean isRainbow = isRainy && isSunny;
     System.out.println("Is there a rainbow outside  now???" + isRainbow);

     System.out.println("Does the wall have background paint??");
     boolean isBackgroundColor = sc.nextBoolean();

     System.out.println("Does the wall have picture on it ???");
     boolean isPictured = sc.nextBoolean();

     boolean isWallGood = isBackgroundColor || isPictured;
     System.out.println("Is manager happy??? " + isWallGood);
    }
}
