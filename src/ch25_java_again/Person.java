package ch25_java_again;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(firstName + " " + lastName + " " + age);
    }
}
