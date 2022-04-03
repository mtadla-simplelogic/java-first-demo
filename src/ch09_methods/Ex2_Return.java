package ch09_methods;

public class Ex2_Return {
    public static void main(String[] args) {
        int x = getNumber();
        System.out.println("dostałem wartosc " + x);
        System.out.println("Zwrona wartosc to " + getNumber());
        System.out.println("Zwrona wartosc to " + getBoolean());
        System.out.println("Zwrona wartosc to " + getText());
    }

    public static String getText() {
        System.out.println(">>bede zwracac tekst Mateusz<<<");
        String name = "Mateusz";
        return name;
    }

    public static int getNumber() {
        System.out.println(">>bede zwracac wartosc 5<<<");
        return 5;
    }

    public static boolean getBoolean() {
        System.out.println(">>bede zwracac wartosc true<<<");
        return true;
    }


    // zaimplementować 3 metody
    // pierwsza ma zwracac: int, druga String, trzecia boolean
    // każda z nich powinna wydrukować np.
    // System.out.println(">>bede zwracac wartosc true<<<");
    // a następnie zrwócic wartość
    //
    //w metodzie main() uruchamiany wszystkie metody i drukujemy
    // wartości jakie zostały zwrocone
}
