package zadanie;

public class Main {
    public static void main(String[] args) {
        CourseGrades pkt = new CourseGrades();
            pkt.addScore(20);
            pkt.addScore(90);
            pkt.addScore(77);
            System.out.println("Średnia : " + pkt.getAverage());
            System.out.println("Najwyższy wynik pkt : " + pkt.getHighest().getScore());
            System.out.println("Najniższy wynik pkt : " + pkt.getLowest().getScore());
    }
}
