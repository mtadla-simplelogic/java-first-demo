package ch17_advanced_constructor;

public class Email {
    public String from;
    public String to;
    public String title;

    public Email() {
    }

    public Email(String from, String to, String title) {
        this.from = from;
        this.to = to;
        this.title = title;
    }

    public Email(String from, String to) {
        this.from = from;
        this.to = to;
    }
}
