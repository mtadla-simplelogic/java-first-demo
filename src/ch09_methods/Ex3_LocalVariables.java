package ch09_methods;

public class Ex3_LocalVariables {

    public static void main(String[] args) {
        String name = "Karol";
        System.out.println("Witaj " + getName());
        System.out.println("Number " + getNumber());
    }

    public static String getName() {
        String name = "Mateusz";
        return name;
    }

    public static int getNumber() {
        int number1 = 9;
        int number2 = 3;
        return number1 / number2 + 10 - getNumber2() * getNumber2();
    }

    public static int getNumber2() {
        return 2;
    }
}
