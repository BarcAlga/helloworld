import java.util.Scanner;
public class Fahrenheit_Celsius {
    public static void main(String[] args) {

        // ( 32F -32) x 5/9 = 0c

        Scanner cs = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        float F = cs.nextFloat();
        float C = (F -32) * 5/9;
        System.out.println("Temperature in Celsius: " + C);

        // 1 gl * 3.785

        System.out.println("Please enter amount in Gl");
        float gl = cs. nextFloat();
        float l = gl * 3.785f;

        System.out.println("Result in L " + l);
    }
}
