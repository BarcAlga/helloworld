public class LogicalOperators {
    public static void main(String[] args) {

        boolean isOld = true;
        boolean isOld2 =false;
        boolean oldResult = isOld || isOld2;
        System.out.println("Is old result: " + oldResult);

        boolean isHusbandMillionaire = true;
        boolean isWifeMillionaire = false;

        boolean isChildMillionaire = isHusbandMillionaire|| isWifeMillionaire;

        System.out.println(" Is child a millionaire :  " + isChildMillionaire);

        boolean isSunnny = true;
        boolean isRainy = false;

        boolean isRainbow = isSunnny && isRainy;

        System.out.println("will there be a rainbow: " + isRainbow);

        boolean negating = true;
        System.out.println("The value if negated boolean is: " + negating);

        boolean negating2 = !false;
        boolean trueBoolean = true;
        System.out.println("The value of true Boolean: " + true);
        System.out.println("The value of negated boolean 2 : " + negating2);



    }
}
