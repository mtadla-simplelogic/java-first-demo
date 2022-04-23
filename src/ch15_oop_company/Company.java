package ch15_oop_company;

public class Company {
    public static void main(String[] args) {
        Employee adam = new Employee();
        adam.firstName = "Adam";
        adam.lastName = "Nowak";
        adam.age = 45;

        Employee jan = new Employee();
        jan.firstName = "Jan";
        jan.lastName = "Kowalski";
        jan.age = 50;

        adam.printInfo();
        System.out.println(jan.getInfo());

        jan.age = 88;
        jan.printInfo();
    }
}
