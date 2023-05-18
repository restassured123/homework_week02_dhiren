package homework_week2_dhiren;

public class TwoInstanceTwoStatic {
    int abc= 111;
    int xyz=222;

    static String text ="I can do it";
    static String name = "I am aware";

    public void m1() {
        System.out.println(abc);
        System.out.println(xyz);
        System.out.println(text);
        System.out.println(name);

    }
    public static void m2(){

        TwoInstanceTwoStatic m2 = new TwoInstanceTwoStatic();
        System.out.println(m2.abc);
        System.out.println(m2.xyz);

        System.out.println(text);
        System.out.println(name);
    }
    public static void main(String[] args) {
    m2();
    TwoInstanceTwoStatic sure= new TwoInstanceTwoStatic();
    sure.m1();
    }

}
