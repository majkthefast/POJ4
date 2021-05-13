package zadanie;


public class Main {
    public static void main(String[] args) {
        MovablePoint punkt1 = new MovablePoint(7, 7, 1, 1);
        System.out.println(punkt1.toString());
        punkt1.moveUp();
        punkt1.moveDown();
        punkt1.moveUp();
        punkt1.moveRight();
        punkt1.moveLeft();
        punkt1.moveRight();
        System.out.println("Wynik przesunięć : ");
        System.out.println(punkt1.toString());
    }
}
