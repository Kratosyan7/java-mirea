/** Практика №4. Прямоугольник. */
public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth()  { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Прямоугольник: " + width + " x " + height
                + ", площадь = " + String.format("%.2f", getArea())
                + ", периметр = " + String.format("%.2f", getPerimeter())
                + ", цвет: " + getColor() + ", закрашен: " + isFilled();
    }
}
