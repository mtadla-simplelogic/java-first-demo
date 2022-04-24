package ch20_oop_inheritance;

public class Worker {
    String firstName;
    String lastName;
    int salary;

    public void printSalary() {
        System.out.println(firstName + " " + lastName
                + " has salary: " + salary);
    }
}
