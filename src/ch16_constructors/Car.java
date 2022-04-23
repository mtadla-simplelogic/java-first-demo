package ch16_constructors;

public class Car {
    String brand;
    String color;
    int horsePower;

    public Car(String brandToSet, String colorToSet, int hpToSet) {
        brand = brandToSet;
        color = colorToSet;
        horsePower = hpToSet;
    }

    public void drive() {
        System.out.println("I'm driving using " + horsePower + " HP");
    }
}
