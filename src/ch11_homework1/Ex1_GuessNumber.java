package ch11_homework1;

import java.util.Random;
import java.util.Scanner;

public class Ex1_GuessNumber {
    public static void main(String[] args) {
        int numberToGuess = getRandomNumber(100);
        int maxNumberOfTries = 5;

        for (int i = 1; i <= maxNumberOfTries; i++) {
            int numberFromUser = getNumberFromUser();

            if (numberFromUser == numberToGuess) {
                System.out.println("you won!");
                break;
            }

            if (numberFromUser > numberToGuess) {
                System.out.println("Too big number");
            } else {
                System.out.println("Too low number");
            }

            if (i == maxNumberOfTries) {
                System.out.println("you lost, aswear was: " + numberToGuess);
            } else {
                System.out.println("You have " + (maxNumberOfTries - i) + " tries left");
            }

        }
    }

    public static int getRandomNumber(int range) {
        return new Random().nextInt(range);
    }

    public static int getNumberFromUser() {
        System.out.println("Prosze podaj liczbę");
        return new Scanner(System.in).nextInt();
    }
}
