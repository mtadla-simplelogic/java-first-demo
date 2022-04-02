package arrays;

public class Salary {
    public static void main(String[] args) {
        int[] tab = {10, 20, 333, 20, 50, 100, 123, 232, 15, 9};

        int sum = 0;
        int max = tab[0];
        int min = tab[0];

        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];

            if (tab[i] > max) {
                max = tab[i];
            }

            if (tab[i] < min) {
                min = tab[i];
            }
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);
        System.out.println("Suma " + sum);
        System.out.println("Srednia " + (sum / tab.length));
    }
}
