package conditionals;

public class IfDemo {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        int x = 4;
        System.out.println(x);

        if (x % 2 == 0) {
            System.out.println("jest to liczba parzysta");
        } else {
            System.out.println("jest to liczba niepatrzysta");
        }

    }
}
