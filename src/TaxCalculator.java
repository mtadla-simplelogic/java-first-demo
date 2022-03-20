import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dochód");
        int income = scanner.nextInt();
        int tax = 0;


        System.out.println("Podatek do zaplacenia:");
        System.out.println(tax);
    }
    // do 120 000 -> 17%
    // ponad 120 000 -> 32%
    // ponad 1 000 000 -> 36%

    // 150 000
    // 120 000 * 0.17 + (150 000 - 120 000) * 0.32
}
