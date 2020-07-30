import java.util.Random;

public class Executor {
    public static void main(String[] args) {
        Figure[] figures = generateFigures(5);
        for (Figure figure : figures) {
            System.out.println(figure.drawFigure());
        }
    }

    private static Figure[] generateFigures(int numberOfFigures) {
        Figure[] response = new Figure[numberOfFigures];
        Random random = new Random();
        for (int i = 0; i < numberOfFigures; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    response[i] = new Square(getRandomColor(),
                            new Random().nextInt(50));
                    break;
                case 1:
                    response[i] = new Triangle(getRandomColor(),
                            new Random().nextInt(45),
                            new Random().nextInt(38));
                    break;
                case 2:
                    response[i] = new Circle(getRandomColor(),
                            new Random().nextInt(50));
                    break;
                case 3:
                    response[i] = new Trapeze(getRandomColor(),
                            new Random().nextInt(50),
                            new Random().nextInt(45),
                            new Random().nextInt(78));
                    break;
            }
        }
        return response;
    }

    private static Colors getRandomColor() {
        return Colors.values()[new Random().nextInt(Colors.values().length)];
    }
}
