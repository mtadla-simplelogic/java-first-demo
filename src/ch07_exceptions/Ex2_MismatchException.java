package ch07_exceptions;

import java.util.Scanner;

public class Ex2_MismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosze podaj wiek");
        int age = scanner.nextInt();

        System.out.println("Twoj wiek to: " + age);
    }
}
