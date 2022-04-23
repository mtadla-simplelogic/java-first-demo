package ch18_oop_day1_summary;

public class Person {
    String firstName;
    String lastName;
    Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getData() {
        return firstName + " " + lastName + ", " + address.getData();
    }
}
