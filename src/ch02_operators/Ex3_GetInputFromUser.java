package ch02_operators;

import java.util.Scanner;

public class Ex3_GetInputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie");
        String name = scanner.nextLine();
        System.out.println("other.Hello " + name);

        System.out.println("Podaj wiek");
        int age = scanner.nextInt();

        System.out.println("Masz " + age + " lat");

        scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("other.Hello " + name + " " + lastName);
    }
}
