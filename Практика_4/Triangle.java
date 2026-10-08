/**
 * Практика №4, задания №1–№3. Треугольник.
 *
 * Задание №2: конструктор выбрасывает IllegalTriangleException, если
 * неравенство треугольника нарушено.
 */
public class Triangle extends GeometricObject {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /** Безаргументный конструктор: треугольник со сторонами 1.0. */
    public Triangle() {
    }

    /** Создает треугольник с указанными сторонами. */
    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        if (!isValid(side1, side2, side3)) {
            throw new IllegalTriangleException(side1, side2, side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** Конструктор со сторонами, цветом и заливкой. */
    public Triangle(double side1, double side2, double side3,
                    String color, boolean filled)
            throws IllegalTriangleException {
        this(side1, side2, side3);
        setColor(color);
        setFilled(filled);
    }

    /**
     * Неравенство треугольника: сумма любых двух сторон больше третьей.
     * Стороны также должны быть положительными.
     */
    public static boolean isValid(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        return a + b > c && a + c > b && b + c > a;
    }

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    /** Площадь по формуле Герона. */
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;                       // полупериметр
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Треугольник: сторона1 = " + side1
                + " сторона2 = " + side2
                + " сторона3 = " + side3;
    }
}
