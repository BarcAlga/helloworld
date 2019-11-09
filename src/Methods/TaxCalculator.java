package Methods;

import java.util.Scanner;

public class TaxCalculator {
    //Get a annual income from the user
    //Then print out how much they need to  pay for a federal tax 10%
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("What's your annual salary? ");

        int salary = in.nextInt();
        calculateTax(salary);
        double taxToBePaid = calculateTax(salary);
        printMyFederalTaxInfo(taxToBePaid);

        double taxToBePaidIfIMake10000Less= calculateTax(salary -1000);
        printMyFederalTaxInfo(taxToBePaidIfIMake10000Less);
    }
    public static double calculateTax(int salary) {

        if (salary >= 0 && salary >= 9075) {
            double taxToBePaid = (salary * 10) / 100;
            return taxToBePaid;
        } else if (salary >= 9076 && salary <= 36900) {
            double taxToBePaid = (salary * 15) / 100;
            return taxToBePaid;
        } else if (salary >= 36901 && salary <= 89350) {
            double taxToBePaid = (salary * 25) / 100;
            return taxToBePaid;


        } else {
            double taxToBePaid = (salary * 28) / 100;
            return taxToBePaid;
        }

    }
         public static void printMyFederalTaxInfo(double tax) {
        System.out.println(" Your Federal  Tax total: " + tax);

    }


}