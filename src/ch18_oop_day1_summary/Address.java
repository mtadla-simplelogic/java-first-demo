package ch18_oop_day1_summary;

public class Address {
    City city;
    String streetName;
    int streetNumber;
    int houseNumber;

    public Address(City city, String streetName, int streetNumber, int houseNumber) {
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
    }

    public String getData() {
        return "Address: " + city.getData() + " street: " + streetName + " " + streetNumber + "/" + houseNumber;
    }
}
