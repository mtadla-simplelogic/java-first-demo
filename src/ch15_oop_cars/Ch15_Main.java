package ch15_oop_cars;

public class Ch15_Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("Car1 details before initialization");
        System.out.println("color: " + car1.color);
        System.out.println("brand: " + car1.brand);
        System.out.println("horsePower: " + car1.horsePower);


        car1.color = "blue";
        car1.brand = "bmw";
        car1.horsePower = 330;

        Car car2 = new Car();
        car2.color = "blue";
        car2.brand = "bmw";
        car2.horsePower = 330;

        Car car3 = new Car();
        car3.color = "red";
        car3.brand = "ford";
        car3.horsePower = 120;

        System.out.println("\nCar1 details after initialization:");
        System.out.println(car1.brand + " " + car1.color + " " + car1.horsePower + " KM");
        car1.drive();

        System.out.println("\r\nCar2 details after initialization:");
        System.out.println(car2.brand + " " + car2.color + " " + car2.horsePower + " KM");
        car2.drive();

        System.out.println("\r\nCar3 details after initialization:");
        System.out.println(car3.brand + " " + car3.color + " " + car3.horsePower + " KM");
        car3.drive();
    }
}
