package ch05_loops;

public class Ex3_ForInFor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);

            for (int j = 0; j < 5; j++) {
                System.out.println("xxx");
                System.out.println("   >j: " + j);
            }

            System.out.println("petla 'j' zostala zakonczona");
        }

        System.out.println("petla 'i' zostala zakonczona");
    }
}
