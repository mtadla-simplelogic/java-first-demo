package loops;

public class SquareLoop {
    // drukuj kwadraty liczb od 0 do 10
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Kwardat liczby " + i + " to " + i * i);
        }
        System.out.println("jestm poza petla");
    }
}
