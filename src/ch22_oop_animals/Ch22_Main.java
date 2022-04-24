package ch22_oop_animals;

public class Ch22_Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Burek", 50);
        dog.bark();
        dog.introduce();
        dog.eat(); // to jest metoda z klasy bazowej Animal

        Bird bird = new Bird("Tweety", 10, true);

        bird.introduce();
        bird.eat();
        bird.fly();
    }
}
