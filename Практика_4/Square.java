/**
 * Практика №4, задание №4, пункты 2–3. Квадрат: наследует GeometricObject
 * и реализует Colorable.
 */
public class Square extends GeometricObject implements Colorable {

    private double side;

    /** Безаргументный конструктор: квадрат со стороной 0. */
    public Square() {
        this.side = 0;
    }

    /** Квадрат с указанной стороной. */
    public Square(double side) {
        this.side = side;
    }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    /** Реализация метода интерфейса Colorable. */
    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны.");
    }

    @Override
    public String toString() {
        return "Квадрат: сторона = " + side
                + ", площадь = " + String.format("%.2f", getArea())
                + ", периметр = " + String.format("%.2f", getPerimeter());
    }
}
