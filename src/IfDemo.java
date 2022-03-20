import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int x = scanner.nextInt();
        System.out.println(x);

        if (x % 2 == 0) {
            System.out.println("jest to liczba parzysta");
        } else {
            System.out.println("jest to liczba niepatrzysta");
        }

    }
}
