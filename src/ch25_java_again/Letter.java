package ch25_java_again;

public class Letter {
    Person recipient;
    Person sender;
    String content;

    public Letter(Person recipient, Person sender, String content) {
        this.recipient = recipient;
        this.sender = sender;
        this.content = content;
    }

    public void send() {
        recipient.printInfo();
        sender.printInfo();
        System.out.println(content);
    }
}
