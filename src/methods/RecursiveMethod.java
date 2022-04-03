package methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        printHello();
    }

    public static void printHello() {
        System.out.println("Hello!");
        printHello();
    }
}
