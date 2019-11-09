package Methods;

public class NewLife {
    public static void main(String[] args) {

        boolean firstExample =  isOldEnoughToDrive(17);
        System.out.println(" Are you eligible to drive ? " + firstExample);

        boolean secondExample = isOldEnoughToDrive(21);
        System.out.println(" Are you eligible to drive ?  " + secondExample);

        double change1 = calculateTheChange(102.56, 120.00);
        System.out.println( " Your change  " + change1);

        double change2 = calculateTheChange(120.56, 130.00);
        System.out.println( " Your change  " + change2);


        printOutMyName("John Doe ");
        printOutMyName("Alex");
        printOutMyName("Michale");

        printOutMySSN("123 34 5467");
        double change3 = calculateTheChange(520.23, 200.00);
        System.out.println( " Your change  " + change3);

        double change4 = calculateTheChange(520.23, 1200.99);
        System.out.println( " Your change  " + change4);



    }
    public static boolean isOldEnoughToDrive (int age){
        boolean isOldEnough ;

        if (age >= 18 ){
            isOldEnough = true;
        }
        else {
            isOldEnough = false;
        }

        return isOldEnough;
    }

    public static double calculateTheChange(double total , double cashReceived ){

        double change;
        if (total <= cashReceived){
            change = ((100*cashReceived) -  (100*total))/100;
            return change;
        }
        else{
            System.out.println(" You don't have enough money ");
            System.out.println(" you need " + ((100*cashReceived) -  (100*total))/100) ;
            change = 0;
            return change;

        }

    }

    public static void printOutMyName (String name){
        System.out.println(" Your name " + name);

    }
    public static void printOutMySSN (String ssn){
        System.out.println( " My social security number  : " + ssn);
    }
    public static boolean isNumberEven(int num){
        return num%2==0;
    }
}
