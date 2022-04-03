package ch05_loops;

public class Ex9_DoWhileAsOnlyLoopThatWillExecuteAtLeastOnce {
    public static void main(String[] args) {
        int i = 10;

        System.out.println("while loop:");
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("for loop:");
        for (i = 10; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("do while loop:");
        i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
