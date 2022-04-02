package arrays;

public class Salary {
    public static void main(String[] args) {
        int[] salaries = {10, 20, 333, 20, 50, 100, 123, 232, 15, 9};

        int sum = 0;
        int max = salaries[0];
        int min = salaries[0];

        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];

            if (salaries[i] > max) {
                max = salaries[i];
            }

            if (salaries[i] < min) {
                min = salaries[i];
            }
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);
        System.out.println("Suma " + sum);
        System.out.println("Srednia " + (sum / salaries.length));
    }
}
