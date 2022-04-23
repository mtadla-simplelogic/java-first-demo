package ch12_method_overloading;

public class Ex1_MethodOverloading {

    public static void main(String[] args) {
        System.out.println(multiply(2, 2));

        System.out.println(multiply(2, 2, "Hello world!"));

        System.out.println(multiply(2, 2, 4));

        System.out.println(multiply(2, 2, 5, 7));
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static int multiply(int a, int b, String text) {
        System.out.println(text);
        return a * b;
    }

    public static int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }
}
