package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchWithTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj wiek");

        try {
            int age = scanner.nextInt();
            System.out.println("Twoj wiek to: " + age);
        } catch (InputMismatchException e) {
            System.out.println("wykrylem wyjatek input mismatch exception");
            System.out.println("Wybacz ale podales tekst zamiast liczbe");
        }
        System.out.println("koniec programu");
    }
}
