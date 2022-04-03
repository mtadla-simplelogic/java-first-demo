package parameters;

public class ParametersDemo {
    public static void main(String[] args) {
        printIfNumberCanByDividedBy(10, 2);
        printIfNumberCanByDividedBy(23, 6);
        printIfNumberCanByDividedBy(8, 4);
        printIfNumberCanByDividedBy(15, 5);
    }

    public static void printIfNumberCanByDividedBy(int number, int divider) {
        System.out.println("Sprawdzam liczbe " + number);
        if (number % 2 == divider) {
            System.out.println("Liczba jest podzielna przez " + divider + " bez reszty");
        } else {
            System.out.println("Liczba nie jest podzielna przez " + divider + " bez reszty ");
        }
    }
}
