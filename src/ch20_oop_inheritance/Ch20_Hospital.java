package ch20_oop_inheritance;

public class Ch20_Hospital {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.firstName = "Adam";
        worker.lastName = "Nowak";
        worker.salary = 3000;
        // worker.bonus = 555; <- niepoprawne, bo worker nie dziedziczy po boss
        worker.printSalary();
        // worker.printBonus(); <- niepoprawne, bo worker nie dziedziczy po boss

        Boss boss = new Boss();
        boss.bonus = 222;
        boss.printBonus();

        boss.firstName = "Jan";  // dostep z klasy worker
        boss.lastName = "Kowalski"; // dostep z klasy worker
        boss.salary = 5000; // dostep z klasy worker
        boss.printSalary(); // dostep z klasy worker
    }
}
