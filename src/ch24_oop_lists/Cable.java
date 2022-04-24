package ch24_oop_lists;

public class Cable {
    private String type;
    private int lenght;

    public Cable(String type, int lenght) {
        this.type = type;
        this.lenght = lenght;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print() {
        System.out.println("Cabe type: " + type + " with lenght: " + lenght);
    }
}
