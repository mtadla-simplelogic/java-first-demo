package ch22_oop_animals;

public class Bird extends Animal {
    private int wingspan;
    private boolean canFly;

    public Bird(String name, int wingspan, boolean canFly) {
        super(name);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    public void introduce() {
        System.out.println("\nI'm bird, my name is: " + getName()
                + " and I have wingspan: " + wingspan);
    }

    public void fly() {
        if (canFly) {
            System.out.println("I can fly");
        } else {
            System.out.println("I can't fly");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }
}
