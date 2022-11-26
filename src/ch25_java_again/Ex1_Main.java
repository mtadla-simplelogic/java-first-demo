package ch25_java_again;

public class Ex1_Main {
    public static void main(String[] args) {
        Person recipient = new Person("Jan", "kowalski", 30);
        Person sender = new Person("Adam", "Nowak", 44);

        Letter letter = new Letter(recipient, sender, "iuhsdviuhsdviuhsdv");

        letter.send();

        Letter letter2 = new Letter(recipient, new Person("Karol", "Nowak", 25), "ddd1d1dd11dd1");

        letter2.send();
    }

  /*
Stwórz klasę Person z polami:
- String firstName
- String lastName
- int age
dodaj konstruktor i metodę printInfo() drukującą dane osoby.

Stwórz klasę Letter z polami:
- Person recipient
- Person sender
- String content

dodaj konstruktor i metodę send() wypisującą:
treść listu i uruchamiającą metody printInfo() dla recipienta i sendera.


W main stowrzyć 2 obiekty klasy Person, potem przekazać je do konstruktora klasy Letter
i uruchomić metodę letter.send();
   */



}
