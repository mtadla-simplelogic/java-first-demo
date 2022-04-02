package arrays;

public class Cars {
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
