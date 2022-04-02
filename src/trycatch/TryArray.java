package trycatch;

public class TryArray {
    public static void main(String[] args) {
        int[] tab = {12, 2, 6};

        try {
            System.out.println(tab[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("nie ma takiego indeksu w tabeli");
        }
        System.out.println("koniec programu");
    }
}
