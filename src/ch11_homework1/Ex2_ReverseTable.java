package ch11_homework1;

import java.util.Scanner;

public class Ex2_ReverseTable {
    public static void main(String[] args) {
        System.out.println("please give me length size");
        int length = getNumberFromUser();

        int[] numbers = getArrayFromUser(length);
        int[] reversed = new int[length];

        for (int i = 1; i <= numbers.length; i++) {
            reversed[i - 1] = numbers[numbers.length - i];
        }

        for (int number : reversed) {
            System.out.println(number);
        }

    }

    public static int[] getArrayFromUser(int length) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("please give me number " + (i + 1));
            array[i] = getNumberFromUser();
        }
        return array;
    }

    public static int getNumberFromUser() {
        return new Scanner(System.in).nextInt();
    }
}
