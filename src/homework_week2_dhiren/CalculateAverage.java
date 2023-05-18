package homework_week2_dhiren;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        float a,b,c,avg;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 3 number  :");
        a= sc.nextFloat();
        b= sc.nextFloat();
        c= sc.nextFloat();
        avg= (a+b+c)/3;
        System.out.println( "Average is  : "+ avg);
    }
}
