import java.util.Random;

public class Executor {
    public static void main(String[] args) {
        Figure[] figures = generateFigures(5);
        for (Figure figure : figures) {
            System.out.println(figure);
            System.out.println(figure.drawFigure());
        }
    }

    public static Figure[] generateFigures(int numberOfFigures) {
        Figure[] response = new Figure[numberOfFigures];
        Random random = new Random();
        for (int i = 0; i < numberOfFigures; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    response[i] = new Square(Colors.values()[new Random().nextInt(Colors.values().length)],
                            new Random().nextInt(50));
                    break;
                case 1:
                    response[i] = new Triangle(Colors.values()[new Random().nextInt(Colors.values().length)],
                            new Random().nextInt(45),
                            new Random().nextInt(38));
                    break;
                case 2:
                    response[i] = new Circle(Colors.values()[new Random().nextInt(Colors.values().length)],
                            new Random().nextInt(50));
                    break;
                case 3:
                    response[i] = new Trapeze(Colors.values()[new Random().nextInt(Colors.values().length)],
                            new Random().nextInt(50),
                            new Random().nextInt(45),
                            new Random().nextInt(78));
                    break;
            }
        }
        return response;
    }
}
