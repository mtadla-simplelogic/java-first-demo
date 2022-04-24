package ch23_oop_access_modifier;

public class Ch23_Main {
    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", 130);
        // ..
        student.height = -150;

        Date date = new Date();

        date.setMonth(13);
        date.setMonth(10);
        date.setYear(2002);
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
//        date.isMonthValid(19);
    }
}
