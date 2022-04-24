package ch24_oop_lists;

import java.util.ArrayList;
import java.util.List;

public class Ex2_ListWithInt {
    public static void main(String[] args) {
        // double -> Double
        // short -> Short
        // int -> Integer

        List<Integer> numbers = new ArrayList<>();

        numbers.add(123);
        numbers.add(3);
        numbers.add(55);

        printList(numbers);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + " listy to: " + list.get(i));
        }
    }
}
