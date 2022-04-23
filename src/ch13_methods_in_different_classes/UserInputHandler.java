package ch13_methods_in_different_classes;

import java.util.Scanner;

public class UserInputHandler {

    public static int getNumberFromUser() {
        return new Scanner(System.in).nextInt();
    }
}
