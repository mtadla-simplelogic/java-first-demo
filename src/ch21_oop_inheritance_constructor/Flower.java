package ch21_oop_inheritance_constructor;

public class Flower extends Plant {
    String smell;

    public Flower(String plantName, int height, String smell) {
        super(plantName, height);
        this.smell = smell;
    }
}
