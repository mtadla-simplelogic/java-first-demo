package ch18_oop_day1_summary;

public class Letter {
    Person sender;
    Person recipient;
    String content;

    public Letter(Person sender, Person recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public String getData() {
        return "\nSender: " + sender.getData() + "\n\nRecipient: " + recipient.getData() + "\n\nContent: " + content;
    }


}
