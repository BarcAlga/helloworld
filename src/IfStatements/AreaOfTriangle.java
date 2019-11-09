package IfStatements;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double a= s.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double b= s.nextDouble();


        double area=(b*a)/2;
        System.out.println("Area of Triangle is: " + area);











    }
}
