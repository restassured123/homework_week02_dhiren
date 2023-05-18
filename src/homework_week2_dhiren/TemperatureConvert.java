package homework_week2_dhiren;

import java.util.Scanner;

public class TemperatureConvert {

    public static void main(String[] args) {
//declare  variables type
        double temp;

        System.out.println("Enter the temp");

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        //Create a Scanner object for user input
        temp = sc.nextDouble();
        //Convert Fahrenheit to Celsius
        temp = ((temp - 32) * 5) / 9;
        System.out.println("Celsius temp is " + temp);
        //close the Scanner object
        sc.close();
    }
}
