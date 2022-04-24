package ch22_oop_animals;

public class Pinquin extends Bird {

    private int swimmingSpeed;

    public Pinquin(String name, int wingspan, int swimmingSpeed) {
        super(name, wingspan, false);
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}
