package ch08_try_catch_finally;

public class Ex2_TryCatch_Array {
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
