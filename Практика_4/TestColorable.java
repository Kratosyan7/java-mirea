/**
 * Практика №4, задание №4, пункт 4.
 *
 * Массив из пяти объектов GeometricObject. Для каждого выводится площадь,
 * и если объект раскрашиваемый — вызывается howToColor().
 */
public class TestColorable {

    public static void main(String[] args) throws IllegalTriangleException {

        GeometricObject[] objects = {
            new Circle(3),
            new Rectangle(4, 5),
            new Square(6),
            new Triangle(3, 4, 5),
            new Square(2.5)
        };

        for (int i = 0; i < objects.length; i++) {
            GeometricObject o = objects[i];
            System.out.printf("%d) %-16s площадь = %.2f%n",
                              i + 1, o.getClass().getSimpleName(), o.getArea());

            // Раскрашиваемый ли объект — проверяем через instanceof
            if (o instanceof Colorable) {
                System.out.print("   ");
                ((Colorable) o).howToColor();
            } else {
                System.out.println("   (не раскрашиваемый)");
            }
        }
    }
}
