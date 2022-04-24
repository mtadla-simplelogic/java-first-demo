package ch22_oop_animals;

public class Dog extends Animal {
    int height;

    public Dog(String name, int height) {
        super(name);
        this.height = height;
    }

    public void bark() {
        System.out.println("woof woof!");
    }

    public void introduce() {
        System.out.println("I'm dog my name is " + name + " and I have heght: " + height);
    }
}
