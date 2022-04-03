package ch08_try_catch_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3_TryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            System.out.println(10 / number);
        } catch (InputMismatchException e) {
            System.out.println("podales tekst zamiast liczby");
        } finally {
            System.out.println("FINALLY! ja wykonam sie zawsze");
        }

        System.out.println("koniec programu");
    }
}
