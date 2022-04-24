package ch22_oop_animals;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }


    public void eat() {
        System.out.println("I can eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
