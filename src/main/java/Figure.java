public abstract class Figure {
    private Colors color;

    public Figure(Colors color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract String drawFigure();

    public Colors getColor() {
        return this.color;
    }

    public void setColor(Colors color) {
        if (color != null) {
            this.color = color;
        }
    }
}
