package ch19_oop_static;

public class Document {
    static int counter;
    String title;
    String content;

    public Document(String title, String content) {
        counter++;
        this.title = title;
        this.content = content;
    }

    public void printContent() {
        System.out.println(content);
    }

    public static void printCounter() {
        System.out.println(counter);

        // w metodzie statycznej nie mozemy uzyc pol non-static
        //System.out.println(content);

        // w metodzie statycznej nie mozemy uruchomic metod non-static
        //printContent();
    }
}
