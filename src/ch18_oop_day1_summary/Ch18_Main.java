package ch18_oop_day1_summary;

public class Ch18_Main {
    public static void main(String[] args) {
        // tworzenie danych dla sendera
        City london = new City("London", 76472);

        Address downingStreet = new Address(london, "Downing street",
                10, 2);

        Person sender = new Person("Jan", "Kowal", downingStreet);

        // tworzenie danych dla recipienta
        City warsaw = new City("Warsaw", 75784);
        Address krucza = new Address(warsaw, "Krucza",
                33, 22);

        Person recipient = new Person("Adam", "Nowak", krucza);

        Letter letter = new Letter(sender, recipient, "Lorem imsum.....");

        System.out.println(letter.getData());

    }

    /*
    Zadanie:
    twórz klasę o nazwe City z polami:
    String name;
    int zipCode;

    Stwórz klasę o nazwe Address z polami:
    String street;
    int streetNumber;
    int houseNumber;
    City city;

    oraz metoda getAllData() zwracającą z formatowany tekst z danymi

    Stwórz klasę o nazwe Person z polami:
    String firstName;
    String lastName;
    Address address;
    oraz metoda getAllData() zwracającą z formatowany tekst z danymi

    Stwórz klasę Letter z polami:
    Person sender;
    Person recipient;
    String content
    oraz metoda getAllData() zwracającą z formatowany tekst z danymi


    W main -> stwórz 2 obiekty klasy letter i wydrukuj ich dane
     */
}
