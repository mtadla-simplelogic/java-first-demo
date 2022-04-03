package methods;

public class CustomMethods {
    public static void main(String[] args) {
        printHello();
        printBye();
    }

    public static void printHello() {
        System.out.println("Hello");
        printBye();
    }

    public static void printBye() {
        System.out.println("Bye");
    }


    // stworz 2 metody (printHello, printBye)
    // każda z nich powinna drukować swoja nazwę do konsoli
    // np. System.out.println("Moja nazwa to xxxxxxx")
    //
    //
    // uruchom te dwie metody wewnątrz main
    // wewnatrz printHello uruchom printBye
}
