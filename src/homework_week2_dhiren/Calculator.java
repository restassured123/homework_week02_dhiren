package homework_week2_dhiren;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2, ch, cal;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("select Operation");
        ch = sc.nextInt();

        if (ch == 1) {
            cal = n1 + n2;
            System.out.println("Addition is " + cal);
        } else if (ch == 2) {
            cal = n1 - n2;
            System.out.println("subtraction is " + cal);
        } else if (ch == 3) {
            cal = n1 * n2;
            System.out.println("Multiplication is " + cal);
        } else if (ch == 4) {

            cal = n1 / n2;
            System.out.println("division is " + cal);
        } else {
            cal = n1 % n2;
            System.out.println("remainder is " + cal);
        }

    }
}







