package homework_week2_dhiren;

import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        double area,length, breath, perimeter;
                                           //Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
                                           //Prompt the user to enter the length of the rectangle
        System.out.println(" Enter the length of Rectangle: ");
        length= sc.nextDouble();
                                          //Prompt the user to enter the breath of the rectangle
        System.out.println("Enter the Breath of Rectangle:  ");
        breath= sc.nextDouble();
                                          //Calculate the area and perimeter of the rectangle
        area= length*breath;
        perimeter= 2*(length+breath);
        System.out.println("The Area of the Rectangle is :" + area);
        System.out.println("The Perimeter os the Rectangle is :" + perimeter);
    }
}
