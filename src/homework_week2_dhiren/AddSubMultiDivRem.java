package homework_week2_dhiren;

import java.util.Scanner;

public class AddSubMultiDivRem {
    public static void main(String[] args) {

                                          //Create a Scanner object for user input
         Scanner sc= new Scanner(System.in);
                                         //Prompt the user to enter two numbers
        System.out.println("Input the First number: ");
        int num1= sc.nextInt();
        System.out.println("Input the Second number: ");
        int num2= sc.nextInt();
                                           //Perform arithmetic operations
        //Sum
        System.out.println(num1+ "+"+ num2+"="+ (num1+num2));
        //Sub
        System.out.println(num1+ "-"+ num2+"="+ (num1-num2));
        //Multiplication
        System.out.println(num1+ "*"+ num2+"="+ (num1*num2));
        //Division
        System.out.println(num1+ "/"+ num2+"="+ (num1/num2));
        //Remainder
        System.out.println(num1+ "%"+ num2+"="+ (num1%num2));
    }


}
