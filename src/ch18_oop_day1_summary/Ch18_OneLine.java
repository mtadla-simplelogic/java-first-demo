package ch18_oop_day1_summary;

public class Ch18_OneLine {
    public static void main(String[] args) {
        Letter letter = new Letter(
                new Person(
                        "Jan",
                        "Kowal",
                        new Address(
                                new City("London", 76472),
                                "Downing street", 10, 2)),
                new Person(
                        "Adam",
                        "Nowak",
                        new Address(
                                new City("Warsaw", 75784),
                                "Krucza", 33, 22)),
                "Lorem imsum.....");

        System.out.println(letter.getData());

    }
}
