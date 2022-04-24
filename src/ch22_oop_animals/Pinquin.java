package ch22_oop_animals;

public class Pinquin extends Bird {

    int swimmingSpeed;

    public Pinquin(String name, int wingspan, int swimmingSpeed) {
        super(name, wingspan, false);
        this.swimmingSpeed = swimmingSpeed;
    }
}
