package ch25_java_again;

import java.util.ArrayList;
import java.util.List;

public class Ex2_Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Filemon", 130);
        cat.meow();

        List<Cat> cats = new ArrayList<>();

        cats.add(cat);
        cats.add(new Cat("asd", 11));
    }


/*
 Stwórz klasę Animal zawierająca pole:
- String name
robimy konstruktor

Stwórz klasę Cat dziedziczącą po Animal zawierającą pole:
- int jumpHeight
oraz metodę meaow() -> drukującą text 'meaow' oraz imie kota i wysokość skoku
robimy konstruktor


W klasię main stwórz obiekt klasy Cat i uruchom na nim metodę meaow()
*/
}
