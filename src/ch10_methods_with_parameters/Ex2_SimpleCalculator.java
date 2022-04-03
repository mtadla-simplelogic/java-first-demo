package ch10_methods_with_parameters;

import java.util.Scanner;

public class Ex2_SimpleCalculator {
    public static void main(String[] args) {
        printMenu();

        int selectedOption = getNumberFromUser();
        int a = getNumberFromUser();
        int b = getNumberFromUser();

        switch (selectedOption) {
            case 1:
                System.out.println("Wynik dodawania " + a + "+" + b + "=" + add(a, b));
                break;
            case 2:
                System.out.println("Wynik odejmowania " + a + "-" + b + "=" + subtract(a, b));
                break;
            case 3:
                System.out.println("Wynik dzielenia " + a + "/" + b + "=" + divide(a, b));
                break;
            case 4:
                System.out.println("Wynik mnozenia " + a + "*" + b + "=" + multiply(a, b));
                break;
            default:
                System.out.println("Niestety wybrales opcje spoza zakresu 1-4");
                System.out.println("Twoj wybor to: " + selectedOption);
        }
    }

    public static void printMenu() {
        System.out.println("Memu programu:");
        System.out.println("1 - dodawanie");
        System.out.println("2 - odejmowanie");
        System.out.println("3 - dzielenie");
        System.out.println("4 - mnozenie");
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj liczbe");
        return scanner.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
