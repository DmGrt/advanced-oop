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
        return Math.pow(side, 2);
    }

    @Override
    public String drawFigure() {
        return "Фігура: квадрат, площа: " + this.getArea()
                + " кв. од., довжина сторони: " + this.getSide()
                + " од., колір: " + this.getColor().getValue();
    }
}
