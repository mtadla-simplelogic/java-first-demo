package ch06_arrays;

public class Ex5_ForEachLoop {
    public static void main(String[] args) {
        String[] cars = {"bmw", "audi", "ford"};

        System.out.println("...fori:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("...for each:");
        for (String car : cars) {
            System.out.println(car);
        }

    }
}
