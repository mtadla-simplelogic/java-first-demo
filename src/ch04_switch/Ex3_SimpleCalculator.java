package ch04_switch;

import java.util.Scanner;

public class Ex3_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbe");
        int x = scanner.nextInt();

        System.out.println("Podaj drugą liczbe");
        int y = scanner.nextInt();

        System.out.println("1 - dodawanie");
        System.out.println("2 - odejmowanie");
        System.out.println("3 - mnożenie");
        System.out.println("4 - dzielenie");
        System.out.println("Proszę wybierz opcję, aby uruchomić działanie na wpisanych liczbach");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                int sum = x + y;
                System.out.println("Wynik dodaniwa " + x + "+" + y + "=" + sum);
                break;
            case 2:
                System.out.println("Wynik odejmowania " + x + "-" + y + "=" + (x - y));
                break;
            case 3:
                System.out.println("Wynik mnożenia " + x + "*" + y + "=" + (x * y));
                break;
            case 4:
                System.out.println("Wynik dzielenia " + x + "/" + y + "=" + (x / y));
                break;
            default:
                System.out.println("Niestety wybrałeś opcję z poza zakresu (1-4), twoja opcja to: " + option);
        }
    }
}
