package ch15_oop_cars;

public class Vehicle {
    public String brand;
    public String color;
    public int horsePower;

    public void drive() {
        System.out.println("I'm driving using " + horsePower + " HP");
    }
}
