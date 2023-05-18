package homework_week2_dhiren;

public class StaticVariables {
    //2.1 Declare two static variables
    static int A = 100;
    static String text = "Hello Static world";

    // 2.2 Declare one static method

    static void m1() {
        // 2.3 Call both static variables into the static method inside the print statement.
        System.out.println(A);
        System.out.println(text);

        //2.4 Declare the Main method.
    }

    public static void main(String[] args) {
        //2.5 Call the static method into the Main method and Run the programme.
     m1();

    }

}
