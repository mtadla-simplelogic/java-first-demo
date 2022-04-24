package ch24_oop_lists;

import java.util.ArrayList;
import java.util.List;

public class Ex1_ListWithString {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        printListSize(names);

        names.add("Mateusz"); // indeks 0
        names.add("Karol");// indeks 1
        names.add("Mariusz");// indeks 2
        names.add("Adam");// indeks 3

        printListSize(names);
        System.out.println("Element stojący na indeksie 3 to :" + names.get(3));

        System.out.println("===========");
        printList(names);
        System.out.println("===========");

        System.out.println("Element na indeksie 2 zostal usuniety");
        names.remove(2); // do automatyzacji niekoniecznie potrzebne
        printList(names);

        System.out.println("===========");
        System.out.println("Element 'Mateusz' zostal usuniety");
        names.remove("Mateusz");
        printList(names);

        System.out.println("===========");
        System.out.println("Element 'Jan' został dodany do listy");
        names.add("Jan");
        printList(names);

        System.out.println("Sprawdzam czy 'Jan' znajduje sie w liscie");
        System.out.println(names.contains("Jan"));

        System.out.println("Sprawdzam czy 'Mateusz' znajduje sie w liscie");
        System.out.println(names.contains("Mateusz"));

        System.out.println("===========");
        printList(names);
        System.out.println("Dodaje element 'Agnieszka' na indeks 1");
        names.add(1, "Agnieszka");
        printList(names);

    }

    public static void printListSize(List<String> list) {
        System.out.println("Ilosc elementow w liscie to: " + list.size());
    }

    public static void printList(List<String> list) {
        printListSize(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + " listy to: " + list.get(i));
        }
    }
}
