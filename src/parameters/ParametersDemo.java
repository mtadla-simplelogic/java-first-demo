package parameters;

public class ParametersDemo {
    public static void main(String[] args) {
        int[] dividers = {2, 3, 4, 5};
        printIfNumberCanByDividedBy(10, dividers);
        printIfNumberCanByDividedBy(23, dividers);
        printIfNumberCanByDividedBy(8, dividers);
        printIfNumberCanByDividedBy(15, dividers);
    }

    public static void printIfNumberCanByDividedBy(int number, int[] dividers) {
        System.out.println("Sprawdzam liczbe " + number);

        for (int divider : dividers) {
            if (number % divider == 0) {
                System.out.println(">>>Liczba jest podzielna przez " + divider + " bez reszty");
            } else {
                System.out.println(">>>Liczba nie jest podzielna przez " + divider + " bez reszty ");
            }
        }
    }

}
