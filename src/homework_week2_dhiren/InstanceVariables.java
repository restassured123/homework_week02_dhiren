package homework_week2_dhiren;

public class InstanceVariables {
    //1.1 Declare two instance variables.
    int a = 10;
    String text = "Hello world";

    //1.2 Declare one instance method.
    public void m1() {

        //1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println(a);
        System.out.println(text);
    }
    //1.4 Declare the Main method.
    public static void main(String[] args) {

        //1.5 Call the above instance method into the Main method and Run the programme.
        InstanceVariables dj = new InstanceVariables();
        dj.m1();
    }
}