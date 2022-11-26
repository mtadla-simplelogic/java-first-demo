package ch20_oop_inheritance;

public class Boss extends Worker {
    int bonus;

    public void printBonus() {
        System.out.println("I'm boss, my name is: " + firstName + ", so I have bonus: " + bonus);
    }
}
