package ch15_oop_cars;

public class Ch15_Main {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        System.out.println("Car1 details before initialization");
        System.out.println("color: " + car1.color);
        System.out.println("brand: " + car1.brand);
        System.out.println("horsePower: " + car1.horsePower);


        car1.color = "blue";
        car1.brand = "bmw";
        car1.horsePower = 330;

        Vehicle car2 = new Vehicle();
        car2.color = "blue";
        car2.brand = "bmw";
        car2.horsePower = 330;

        Vehicle car3 = new Vehicle();
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
