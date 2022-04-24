package ch19_oop_static;

public class Ch19_Printer {
    public static void main(String[] args) {
        Document doc = new Document("doc", "asd");
        Document pdf = new Document("pdf", "qwe");

        // dostep do metody static / non-static
        // drukowanie coutnentu uzwajac metody non-stati
        doc.printContent(); // uruchamianie metody non-static
        pdf.printContent();// uruchamianie metody non-static

        // poniższa linjka jest zakomnetowana bo nie mozna uruchomić
        // metody ktora nie jest statyczna uzywajac nazwy klasy
        // Document.printContent();

        // drukowanie coutnera uzywajac metody static
        doc.printCounter();// uruchamianie metody static
        Document.printCounter();// uruchamianie metody static


        // dostep do pól static / non-static
        // pola statyczne:
        System.out.println(doc.counter);
        System.out.println(Document.counter);

        // pola nie statyczne:
        System.out.println(doc.content);

        // poniższa linjka jest zakomnetowana bo nie mozna
        // uzyc pola ktore nie jest statyczne uzywajac nazwy klasy
        // System.out.println(Document.content);

    }
}
