package ch09_methods;

public class Ex1_HelloWorld {
    public static void byeBye() {
        System.out.println(">>bye bye");
    }

    public static void main(String[] args) {
        System.out.println("Begining");
        printHelloWorld();
        printHelloWorld();
        byeBye();
        System.out.println("The end");
    }

    public static void printHelloWorld() {
        System.out.println("...I'm inside custom method");
        System.out.println("...Hello world!");
        byeBye();
        System.out.println("....I finished byebye inside custom method");
    }
}
