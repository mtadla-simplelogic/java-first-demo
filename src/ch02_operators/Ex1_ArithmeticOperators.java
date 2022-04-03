package ch02_operators;

public class Ex1_ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Dodowanie/odejmowanie");
        int x = 10;
        int y = x + 5 + 10 + x + 15 + 20;
        System.out.println(y);

        y = y + 5;
        System.out.println(y);

        y += 5;
        System.out.println(y);

        y += 1;
        System.out.println(y);
        y++;
        System.out.println(y);
        y--;
        System.out.println(y);

        y = y - 12;
        System.out.println(y);

        y -= 8;
        System.out.println(y);
        System.out.println(y + 100);
        System.out.println(y);

        System.out.println("Mnożenie");
        int v = 5 * 5;
        System.out.println(v);
        System.out.println(10 * 2);

        System.out.println("Dzielenie");
        int i = 10 / 2;
        System.out.println(i);

        System.out.println(22 / 3); // 22:3 -> 7 oraz 1 reszty
        System.out.println(22 % 3); // % -> modulo -> reszta z dzielenia

        System.out.println("Dzielenie float i double");

        float a = 5 / 3;
        double b = 5 / 3;

        System.out.println(a);
        System.out.println(b);

        float c = 5.0f / 3;
        double d = 5.0d / 3;

        System.out.println(c);
        System.out.println(d);
    }
}
