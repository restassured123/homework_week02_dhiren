package homework_week2_dhiren;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        //create variables
        double base , height, area;
        //Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter the lengths of the triangle's sides
        System.out.println("Enter the length of base of triangle:");
        base= sc.nextDouble();
        System.out.println("Enter the length of height of triangle:");
        height = sc.nextDouble();

        // area = (base*height)/2;Calculate the area of the triangle
        area = (base*height)/2;
        //display the area of the triangle
        System.out.println("The Area of the Triangle is:"+ area);

    }

}
