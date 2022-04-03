package ch02_operators;

public class Ex2_LogicOperators {
    public static void main(String[] args) {
        System.out.println(5 > 3);

        boolean isLower = 10 <= 3;
        System.out.println(isLower);

        System.out.println(2 == 2); // true
        System.out.println(2 != 3); // true
        System.out.println(2 > 3);  // false
        System.out.println(2 < 3);  // true
        System.out.println(2 >= 3); // false
        System.out.println(2 <= 3); // true

        int x = 3;
        int y = 10;
        System.out.println(x > 0 && y < 100); // true
        System.out.println(x > 0 && y > 100); // false

        System.out.println(x > 0 || y > 100); // true
    }
}
