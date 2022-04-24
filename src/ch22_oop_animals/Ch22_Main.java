package ch22_oop_animals;

public class Ch22_Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Burek", 50);
        dog.introduce();
        dog.bark();
        dog.eat(); // to jest metoda z klasy bazowej Animal

        Bird bird = new Bird("Tweety", 10, true);
        bird.introduce();
        bird.eat();
        bird.fly();

        Eagle eagle = new Eagle("Marian", 50, 10);
        Pinquin pinquin = new Pinquin("Kowalski", 50, 20);

        eagle.introduce();
        eagle.fly();
        eagle.eat();
        System.out.println("Claws: " + eagle.getClawsLength());

        pinquin.introduce(); // metoda z klasy bird (dostepna dzieki dziedziczeniu)
        pinquin.fly(); // metoda z klasy bird (dostepna dzieki dziedziczeniu)
        pinquin.eat(); // metoda z klasy animal (dostepna dzieki dziedziczeniu)
        System.out.println("Swimming speed: " + pinquin.getSwimmingSpeed());
        pinquin.fly();
    }
}
