public class Trapeze extends Figure {
    private int base1;
    private int base2;
    private int height;

    public Trapeze(Colors color, int base1, int base2, int height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public int getBase1() {
        return base1;
    }

    public void setBase1(int base1) {
        if (base1 > 0) {
            this.base1 = base1;
        }
    }

    public int getBase2() {
        return base2;
    }

    public void setBase2(int base2) {
        if (base2 > 0) {
            this.base2 = base2;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    @Override
    public double getArea() {
        return ((base1 + base2) >> 1) * height;
    }

    @Override
    public String drawFigure() {
        return "Фігура: трапеція, площа: " + this.getArea()
                + " кв. од., довжина середньої лінії: " + (base1 + base2) / 2
                + " од., колір: " + this.getColor().getValue();
    }
}
