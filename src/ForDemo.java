public class ForDemo {
    public static void main(String[] args) {
        // wypisz liczby od 0 do 50
        // podzielne przez 3 lub 5
        // % -> modulo
        // na koniec wypisz ich sumę
        // oraz ilość powt. pętli

        int counter = 0;
        for (int i = 0; i < 25; i += 10) {
            System.out.println(i);
            counter++;
        }

        System.out.println("ilosc powt. petli:" + counter);
    }
}
