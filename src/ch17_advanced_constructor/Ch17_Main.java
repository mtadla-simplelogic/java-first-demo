package ch17_advanced_constructor;

public class Ch17_Main {
    public static void main(String[] args) {
        Email email1 = new Email();

        email1.from = "mt@gmail.com";
        email1.to = "qwe@gmail.com";
        email1.title = "Some title";

        Email email3 = new Email("chrome@wp.pl", "ie@wp.pl");
        email3.title = "Hello ie!";

        Email email2 = new Email("qwe@wp.pl", "asd@wp.pl", "Title!");

    }

}
