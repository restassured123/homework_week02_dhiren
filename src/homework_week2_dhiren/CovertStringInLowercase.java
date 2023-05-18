package homework_week2_dhiren;

import java.util.Scanner;

public class CovertStringInLowercase {

    public static void main(String[] args) {
                                            //String str ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string to be converted in lowercase: ");
        String input = sc.nextLine();

        String uppercase = input.toLowerCase();
        System.out.println("The lowercase letter is: ");
        System.out.println(uppercase);

    }
}
