package homework_week2_dhiren;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        //declare  variables type
        double radius, area;

        // Step 1: Create a Scanner object for user input
        Scanner sc= new Scanner(System.in);
          // Step 2: Prompt the user to enter the radius
        System.out.println("Enter the radius of the circle");
        radius = sc.nextDouble();
        //Step 3: Calculate the area of the circle
        area= Math.PI*radius*radius;
        //Step 4: Display the area of the circle
        System.out.println("The area of the circle is:"+ area);
        //Step 5: Close the Scanner object
        sc.close();
    }
}