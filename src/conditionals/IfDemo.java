package conditionals;

public class IfDemo {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        int x = 5;
        System.out.println(x);

        if (x % 2 == 0) {
            System.out.println("jest to liczba parzysta");
        } else if (x % 3 == 0) {
            System.out.println("jest to liczba podzielna przez 3");
        } else {
            System.out.println("jest to liczba nie podzielna przez 3 ani 2");
        }

    }
}
