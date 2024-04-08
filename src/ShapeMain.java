import java.util.Random;

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape sq = new Squere();
        circle.draw();
        circle.erase();
        sq.draw();
        sq.erase();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            if (random.nextBoolean()) {
                Circle circle1 = new Circle();
                circle1.draw();
                circle1.erase();
            } else {
                Squere squere = new Squere();
                squere.draw();
                squere.erase();
            }
        }
    }
}
