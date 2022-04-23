package ch18_oop_day1_summary;

public class City {
    String name;
    int zipCode;

    public City(String name, int zipCode) {
        this.name = name;
        this.zipCode = zipCode;
    }

    public String getData() {
        return zipCode + " " + name + ",";
    }
}
