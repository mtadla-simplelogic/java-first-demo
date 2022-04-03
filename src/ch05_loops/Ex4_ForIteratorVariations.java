package ch05_loops;

public class Ex4_ForIteratorVariations {
    public static void main(String[] args) {
        System.out.println("standardowa petla z ++");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("Ta petla nie wykona sie wogole:");
        for (int i = 5; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("for z --");
        for (int i = 10; i > 5; i--) {
            System.out.println(i);
        }

        System.out.println("standardowa petla z i+12]");
        for (int i = 0; i < 100; i += 12) {
            System.out.println(i);
        }

        System.out.println("petla 'nieskonczona' idzie do max wart typu");
        for (short i = 0; i < 3; i--) {
            System.out.println(i);
        }

        System.out.println("petla z wczesniej zadeklarownym i");
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println("wartość i po zakonczeniu petli to: " + i);

        System.out.println("koniec programu");
    }
}
