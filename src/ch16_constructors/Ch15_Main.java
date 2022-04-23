package ch16_constructors;

public class Ch15_Main {
    public static void main(String[] args) {
        Car bmw = new Car("bmw", "blue", 330);
        Car ford = new Car("ford", "red", 120);

        System.out.println("\nCar1 details:");
        System.out.println(bmw.brand + " " + bmw.color + " " + bmw.horsePower + " KM");
        bmw.drive();

        System.out.println("\r\nCar2 details:");
        System.out.println(ford.brand + " " + ford.color + " " + ford.horsePower + " KM");
        ford.drive();
    }
}
