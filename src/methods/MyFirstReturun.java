package methods;

public class MyFirstReturun {
    // zaimplementować 3 metody
    // pierwsza ma zwracac: int, druga String, trzecia boolean
    // każda z nich powinna wydrukować np.
    // System.out.println(">>bede zwracac wartosc true<<<");
    // a następnie zrwócic wartość
    //
    //w metodzie main() uruchamiany wszystkie metody i drukujemy
    // wartości jakie zostały zwrocone

    public static void main(String[] args) {
        int x = getNumber();
        System.out.println("dostałem wartosc " + x);
        System.out.println("Zwrona wartosc to " + getNumber());
    }

    public static int getNumber() {
        System.out.println(">>bede zwracac wartosc 5<<<");
        return 5;
    }
}
