package trycatch;

import java.util.Scanner;

public class OneToRuleThemAll {
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
