package ch15_oop_company;

public class Employee {
    public String firstName;
    public String lastName;
    public int age;

    public void printInfo() {
        System.out.println(getInfo());
    }

    public String getInfo() {
        return firstName + " " + lastName + " " + age;
    }
}
