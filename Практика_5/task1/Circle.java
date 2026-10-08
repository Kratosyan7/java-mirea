package task1;

/**
 * Практика №5, задание №1, пункт 3.
 *
 * Класс с полем radius, реализующий Comparable, — чтобы искать наибольший
 * элемент в массиве экземпляров этого класса.
 */
public class Circle implements Comparable<Circle> {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Контракт Comparable: отрицательное — this меньше, 0 — равны,
     * положительное — this больше.
     */
    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }

    @Override
    public String toString() {
        return "Circle(r=" + radius + ")";
    }
}
