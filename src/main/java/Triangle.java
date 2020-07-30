public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int hypotenuse;

    public Triangle(Colors color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotenuse = (int) Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2));
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA > 0) {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB > 0) {
            this.sideB = sideB;
        }
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getPerimeter() {
        return sideA + sideB + hypotenuse;
    }

    @Override
    public double getArea() {
        double semiPer = getPerimeter() / 2;
        return Math.sqrt(semiPer * (semiPer - sideA) * (semiPer - sideB) * (semiPer - hypotenuse));
    }

    @Override
    public String drawFigure() {
        return "Фігура: трикутник, площа: " + this.getArea()
                + " кв. од., довжина гіпотенузи: " + this.getHypotenuse()
                + " од., периметр: " + this.getPerimeter()
                + " од., колір: " + this.getColor().getValue();
    }
}
