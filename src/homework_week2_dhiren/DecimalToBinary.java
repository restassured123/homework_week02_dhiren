package homework_week2_dhiren;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
                                               // Step 1: Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

                                                // Step 2: Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int d = sc.nextInt();

                                                // Step 3: Convert the decimal number to binary
        String binary= Integer.toBinaryString(d);

                                              // Step 4: Display the binary representation
        System.out.println("Binary representation is: " + binary);

                                              // Step 5: Close the Scanner object
        sc.close();
    }
}