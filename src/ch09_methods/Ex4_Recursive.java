package ch09_methods;

public class Ex4_Recursive {
    public static void main(String[] args) {
        printHello();
    }

    public static void printHello() {
        System.out.println("Hello!");
        printHello();
    }

}
