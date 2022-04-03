package ch10_methods_with_parameters;

import java.util.Scanner;

public class Ex1_Parameters {
    public static void main(String[] args) {
        int[] dividers = {2, 3, 4, 5};

        System.out.println("Porsze powiedz ile liczb chcesz sprawdzić");
        int quantityOfNumbersToCheck = getNumberFromUser();

        for (int i = 0; i < quantityOfNumbersToCheck; i++) {
            printIfNumberCanByDividedBy(getNumberFromUser(), dividers);
        }

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

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj liczbe");
        return scanner.nextInt();
    }
}
