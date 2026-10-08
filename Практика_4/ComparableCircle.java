/**
 * Практика №4, задание №3, пункт 6. Круг, который наследует Circle
 * и реализует Comparable.
 *
 * Важный момент: Comparable здесь НЕ объявляется повторно. Родитель
 * GeometricObject уже объявлен как implements Comparable<GeometricObject>,
 * а один класс не может реализовать один и тот же генерик-интерфейс
 * с двумя разными параметрами — это ошибка компиляции:
 *   "Comparable cannot be inherited with different arguments"
 *
 * Поэтому ComparableCircle получает Comparable по наследству и лишь
 * переопределяет compareTo(), сравнивая круги по радиусу.
 */
public class ComparableCircle extends Circle {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    /**
     * Сравнение по радиусу, если второй объект тоже круг.
     * С любой другой фигурой сравниваем по площади — поведением родителя.
     */
    @Override
    public int compareTo(GeometricObject o) {
        if (o instanceof Circle) {
            return Double.compare(this.getRadius(), ((Circle) o).getRadius());
        }
        return super.compareTo(o);
    }

    /** Наибольший из двух ComparableCircle. */
    public static ComparableCircle max(ComparableCircle c1, ComparableCircle c2) {
        return c1.compareTo(c2) >= 0 ? c1 : c2;
    }

    @Override
    public String toString() {
        return "ComparableCircle: радиус = " + getRadius()
                + ", площадь = " + String.format("%.2f", getArea());
    }
}
