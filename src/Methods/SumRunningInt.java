package Methods;

public class SumRunningInt {

    public static void main(String[] args) {
        // Define variables
        int sum = 0;          // The accumulated sum, init to 0
        int lowerbound = 1;
        int upperbound = 100;

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = lowerbound; number <= upperbound; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100

            sum+=number;
            System.out.println("The sum of 1 to 100 is "+sum);
        }
    }
}