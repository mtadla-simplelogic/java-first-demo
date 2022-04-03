package ch08_try_catch_finally;

import java.util.Scanner;

public class Ex5_CatchAnyException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            System.out.println(10 / number);
        } catch (Exception e) {
            System.out.println("wystapil wyjątek " + e);
        }

        System.out.println("koniec programu");
    }
}
