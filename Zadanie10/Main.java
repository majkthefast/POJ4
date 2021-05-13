package zadanie;

public class Main {

    public static void main(String[] args) {
        Safe sejf = new Safe("0000");

        System.out.println("Błędny PIN");
        sejf.enterPin("1111");
        System.out.println("Dobry PIN");
        sejf.enterPin("0000");
    }
}