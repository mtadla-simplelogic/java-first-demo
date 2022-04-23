package ch13_methods_in_different_classes;

public class Main {
    public static void main(String[] args) {
        Menu.printOptions();

        System.out.println("Podaj jaką chcesz wybrać opcję:");
        int option = getOptionFromUser();

        System.out.println("Podaj pierwszą liczbe do dzialania");
        int a = UserInputHandler.getNumberFromUser();

        System.out.println("Podaj pierwszą druga do dzialania");
        int b = UserInputHandler.getNumberFromUser();

        switch (option) {
            case 1:
                System.out.println(Calculator.add(a, b));
                break;
            case 2:
                System.out.println(Calculator.subtract(a, b));
                break;
            default:
                System.out.println("jest to opcja poza zakresem");
        }
    }

    public static int getOptionFromUser() {
        while (true) {
            int option = UserInputHandler.getNumberFromUser();

            if (option == 1 || option == 2) {
                return option;
            } else {
                System.out.println("Podałeś liczbę poza zakresem");
            }
        }
    }
}
