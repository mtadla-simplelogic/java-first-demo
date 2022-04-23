package ch14_oop_car;

public class Ch14_Main {
    public static void main(String[] args) {
        Ch14_Car car1 = new Ch14_Car();

        System.out.println("Car1 details:");
        car1.drive();
        System.out.println("Kolor to:" + car1.color);

        System.out.println("Car2 details:");
        Ch14_Car car2 = new Ch14_Car();
        car2.drive();
        System.out.println("Kolor to:" + car2.color);


        System.out.println(car1 == car2);//false

    }
}
