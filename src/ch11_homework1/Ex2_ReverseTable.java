package ch11_homework1;

public class Ex2_ReverseTable {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 8, 9, 12, 34, 54, 23};
        int[] reversed = new int[10];

        for (int i = 1; i <= numbers.length; i++) {
            reversed[i - 1] = numbers[numbers.length - i];
        }

        for (int number : reversed) {
            System.out.println(number);
        }

    }
}
