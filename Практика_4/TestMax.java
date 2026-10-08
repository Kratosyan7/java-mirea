/**
 * Практика №4, задание №3, пункты 4–6.
 * Проверка статического метода max() и метода compareTo().
 */
public class TestMax {

    public static void main(String[] args) throws IllegalTriangleException {

        System.out.println("=== max() для двух кругов ===");
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(8);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("Наибольший: " + GeometricObject.max(c1, c2));

        System.out.println();
        System.out.println("=== max() для двух прямоугольников ===");
        Rectangle r1 = new Rectangle(4, 6);
        Rectangle r2 = new Rectangle(3, 7);
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("Наибольший: " + GeometricObject.max(r1, r2));

        System.out.println();
        System.out.println("=== max() для двух ComparableCircle ===");
        ComparableCircle cc1 = new ComparableCircle(3);
        ComparableCircle cc2 = new ComparableCircle(7);
        System.out.println("cc1: " + cc1);
        System.out.println("cc2: " + cc2);
        System.out.println("Наибольший: " + ComparableCircle.max(cc1, cc2));

        System.out.println();
        System.out.println("=== Круг против прямоугольника через compareTo() ===");
        Circle circle = new Circle(5);              // площадь ~78.54
        Rectangle rect = new Rectangle(10, 10);     // площадь 100
        int cmp = circle.compareTo(rect);
        System.out.printf("Круг (%.2f) vs прямоугольник (%.2f): compareTo = %d%n",
                          circle.getArea(), rect.getArea(), cmp);
        System.out.println("Наибольший: " + GeometricObject.max(circle, rect));

        System.out.println();
        System.out.println("=== Сравнение фигур разных типов ===");
        Triangle triangle = new Triangle(3, 4, 5);  // площадь 6
        Square square = new Square(4);              // площадь 16
        System.out.printf("Треугольник: %.2f, квадрат: %.2f%n",
                          triangle.getArea(), square.getArea());
        System.out.println("Наибольший: " + GeometricObject.max(triangle, square));
    }
}
