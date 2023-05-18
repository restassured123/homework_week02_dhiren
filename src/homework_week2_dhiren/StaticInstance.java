package homework_week2_dhiren;

public class StaticInstance {

    //3.1 Declare one instance and one static variable.
    int num1 = 666;
    static int v1 = 999;

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the
    //print statement.
    public void m1() {
        System.out.println(num1);
        System.out.println(v1);
    }

    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the
    //print statement.
    static void dj2() {
        System.out.println(v1);
        StaticInstance abc = new StaticInstance();
        System.out.println(abc.num1);
    }

    //3.5 Declare the Main method.
    public static void main(String[] args) {
        dj2();
        StaticInstance xyz = new StaticInstance();
        xyz.m1();

    }
}

