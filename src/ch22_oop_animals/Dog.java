package ch22_oop_animals;

public class Dog extends Animal {
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;

    public Dog(String name, int height) {
        super(name);
        this.height = height;
    }

    public void bark() {
        System.out.println("woof woof!");
    }

    public void introduce() {
        System.out.println("\nI'm dog my name is " + getName() + " and I have heght: " + height);
    }
}
