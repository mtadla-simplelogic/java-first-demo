package ch23_oop_access_modifier;

public class Date {
    private int year;
    private int month;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isMonthValid(month)) {
            this.month = month;
        } else {
            System.out.println("Podales zla wartosc");
        }
    }

    private boolean isMonthValid(int month) {
        if (month > 0 && month < 13) {
            return true;
        }
        return false;
    }
}
