package homework_week2_dhiren;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        int n;
                                         //Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
                                         //Prompt the user to enter a number
        System.out.println("Enter number");
        n = sc.nextInt();
                                           //Print the multiplication table up to 10
        for (int i = 1; i <= 10; i++)
            System.out.println(n + "X" + i + "=" + n * i);
    }


}
