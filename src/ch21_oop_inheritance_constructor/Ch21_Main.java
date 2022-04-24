package ch21_oop_inheritance_constructor;

public class Ch21_Main {
    public static void main(String[] args) {
        Plant plant = new Plant("tree", 30);

        Flower flower = new Flower("stokrotka", 10, "slodki");

        System.out.println(plant.name);
        System.out.println(plant.height);

        System.out.println("\n" + flower.name);
        System.out.println(flower.height);
        System.out.println(flower.smell);

    }
}
