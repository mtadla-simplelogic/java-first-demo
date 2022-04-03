package ch04_switch;

public class Ex1_SwitchWithInteger {

    public static void main(String[] args) {
        int chromeVersion = 98;

        switch (chromeVersion) {
            case 98:
                System.out.println("Masz wersje 98");
                System.out.println("Prosze zrob update");
                break;
            case 99:
                System.out.println("Masz aktualna wersje");
                break;
            default:
                System.out.println("Twoja wersja chrome " + chromeVersion + " nie jest wspierana");
        }
        System.out.println("Koniec programu");
    }
}
