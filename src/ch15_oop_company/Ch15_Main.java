package ch15_oop_company;

public class Ch15_Main {
    public static void main(String[] args) {
        int number = 10;
        increase(number);
        System.out.println(number); // 10

        Employee adam = new Employee();
        adam.firstName = "adam";
        adam.lastName = "nowak";
        adam.age = 25;
        increase(adam);
        System.out.println(adam.age); // 100
    }

    public static void increase(Employee employee) {
        employee.age = 100;
    }

    public static void increase(int a) {
        a = a + 1;
    }
}
