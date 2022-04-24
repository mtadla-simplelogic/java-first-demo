package ch19_oop_static;

public class Ch19_Main {
    public static void main(String[] args) {
        System.out.println(Document.counter); //0

        Document doc = new Document("doc", "asd");

        System.out.println(doc.title);
        System.out.println(doc.content);
        System.out.println(doc.counter); // 1

        Document pdf = new Document("pdf", "qwe");

        System.out.println("\n" + pdf.title);
        System.out.println(pdf.content);
        System.out.println(pdf.counter); // 2

        Document ppt = new Document("ppt", "zxc");

        System.out.println("\n" + ppt.title);
        System.out.println(ppt.content);
        System.out.println(ppt.counter);  // 3

        System.out.println("na koniec wypisuje jeszcze raz wszystko");
        System.out.println("doc " + doc.counter); // 3
        System.out.println("pdf " + pdf.counter); // 3
        System.out.println("ppt " + ppt.counter); // 3

        for (int i = 0; i < 10; i++) {
            new Document("asdasd", "123123");
        }
        System.out.println(pdf.counter);
        System.out.println(Document.counter);

    }
}
