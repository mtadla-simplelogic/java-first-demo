package conditionals;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dochód");
        int income = scanner.nextInt();
        double tax;

        if (income <= 120000) {
            tax = income * 0.17;
        } else if (income <= 1000000) {
            tax = 120000 * 0.17 + (income - 120000) * 0.32;
        } else {
            tax = 120000 * 0.17 + 880000 * 0.32 + (income - 1000000) * 0.36;
        }

        System.out.println("Podatek do zaplacenia: " + tax);
    }
}
