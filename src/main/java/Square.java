public class Square extends Figure {
    private int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public String drawFigure() {
        return "Тут мав бути квадрат.";
    }

    @Override
    public String toString() {
        return "Фігура: квадрат, площа: " + this.getArea()
                + " кв. од., довжина сторони: " + this.getSide()
                + " од., колір: " + this.getColor().getValue();
    }
}
