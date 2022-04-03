package ch05_loops;

public class Ex2_ForWithIf {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
            counter++;
        }

        System.out.println("ilosc powt. petli:" + counter);
        System.out.println("suma liczb:" + sum);
    }
}
