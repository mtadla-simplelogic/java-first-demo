public class SwitchStringDemo {
    public static void main(String[] args) {
        String browser = "opera";

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
            default:
                System.out.println("Przeglądarka " + browser + " nie jest wspierana");
        }
        System.out.println("Koniec programu");
    }
}
