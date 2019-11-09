package DevXDragons;

import java.util.Scanner;

public class SumProductMinMax {
    public static int num1,num2,num3;
    public static int sum,product,min,max;
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer : ");
        num1 = input.nextInt();
        System.out.println("Enter second  integer : ");
        num2 = input.nextInt();
        System.out.println("Enter third  integer : ");
        num3 = input.nextInt();
        sum();
        product();
        max();
        min();
    } public static void sum(){
        sum=num1+num2+num3;
        System.out.println("The sum is " + sum );
    }public static void product(){
        product=num1*num2*num3;
        System.out.println("The product is " + product);
    }public static void max(){
        max=num1;
        if(num1 > max)
            max =num1;
        if(num2>max)
            max =num2;
        if(num3> max)
            max= num3;
        System.out.println(" The max is " +max);
    }public static void min(){
        min=num1;
        if(num1 < min)
            min =num1;
        if(num2<min)
            min =num2;
        if(num3< min)
            min= num3;
        System.out.println(" The min is " +min);
    }
}

