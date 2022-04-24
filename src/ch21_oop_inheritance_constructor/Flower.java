package ch21_oop_inheritance_constructor;

public class Flower extends Plant {
    String smell;

    public Flower(String name, int height, String smell) {
        super(name, height);
        this.smell = smell;
    }
}
