import java.util.Date;

/**
 * Практика №4. Абстрактный базовый класс для геометрических фигур.
 *
 * Задание №3, пункт 4: класс реализует Comparable и содержит статический
 * метод max() для поиска наибольшего из двух объектов.
 *
 * Comparable<GeometricObject> сравнивает фигуры по площади, поэтому
 * compareTo() опирается на абстрактный getArea().
 */
public abstract class GeometricObject implements Comparable<GeometricObject> {

    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor()  { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public Date getDateCreated() { return dateCreated; }

    /** Площадь — каждая фигура считает по-своему. */
    public abstract double getArea();

    /** Периметр — каждая фигура считает по-своему. */
    public abstract double getPerimeter();

    /** Сравнение по площади. */
    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    /** Наибольший из двух объектов. Статический метод — вызывается у класса. */
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) >= 0 ? o1 : o2;
    }

    @Override
    public String toString() {
        return "созданный " + dateCreated + ", цвет: " + color
                + ", закрашен: " + filled;
    }
}
