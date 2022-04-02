package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithMultipleCatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            System.out.println(10 / number);
        } catch (InputMismatchException e) {
            System.out.println("podales tekst zamiast liczby");
        } catch (ArithmeticException e) {
            System.out.println("nie mozna dzielic przez zero!");
        }

        System.out.println("koniec programu");
    }
}