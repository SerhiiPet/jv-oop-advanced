package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.height = length;
        this.length = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, lenght: " + length
                + " units, height: " + height + " units, color: " + getRandomColor();
    }
}