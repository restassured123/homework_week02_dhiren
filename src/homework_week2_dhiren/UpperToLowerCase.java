package homework_week2_dhiren;

import java.util.Scanner;

public class UpperToLowerCase {
    //input a to z ---> Uppercase
    //input A to Z --
    public static void main(String[] args) {

                                                     // Step 1: Create a Scanner object for user input
        Scanner sc= new Scanner(System.in);

                                                      // Step 2: Prompt the user to enter an uppercase letter
        System.out.print("Enter an uppercase letter: ");
        String input = sc.nextLine();

                                                        // Step 3: Convert the uppercase letter to lowercase
        String lowercase= input.toUpperCase();

                                                        // Step 4: Display the converted lowercase letter
        System.out.println("The lowercase letter is: " + lowercase);

        // Step 5: Close the Scanner object
        sc.close();
    }
}