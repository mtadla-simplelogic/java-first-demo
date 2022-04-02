package arrays;

public class SquareWithLoop {
    public static void main(String[] args) {
        int n = 100;
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * i;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("element o indeksie " + i + " ma wartość:" + numbers[i]);
        }
    }
//    Stwórz zmienna int n i przypisz to niej dowolną wartość >0.
//    Stwórz tablice n elementową.
//    Przy pomocy pętli ustaw wartości przechowywane w tablicy ->
//    do każdego elementu przypisz kwadrat jego indeksu.
//    Czyli np. tab[3] powinno przechowywać 9

//    Wydrukuj tablicę do konsoli sformatowane jako:
//    element o indeksie 1 ma wartość: 1
//    element o indeksie 2 ma wartość: 4

}
