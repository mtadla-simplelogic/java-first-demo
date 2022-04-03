package ch04_switch;

public class Ex2_SwitchWithString {
    public static void main(String[] args) {
        String browser = "chrome";

        switch (browser) {
            case "firefox":
                System.out.println("Uruchamiam firefox....");
                break;
            case "chrome":
                System.out.println("Uruchamiam chrome....");
                break;
            case "ie":
                System.out.println("Uruchamiam ie....");
                break;
            default:  // blok default jest opcjonalny
                System.out.println("Przeglądarka " + browser + " nie jest wspierana");
        }
        System.out.println("Koniec programu");
    }
}
