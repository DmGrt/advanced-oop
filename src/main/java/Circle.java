public class Circle extends Figure {
    private int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String drawFigure() {
        return "Тут мав бути круг.";
    }

    @Override
    public String toString() {
        return "Фігура: круг, площа: " + this.getArea()
                + " кв. од., радіусом: " + this.getRadius()
                + " од., колір: " + this.getColor().getValue();
    }
}
