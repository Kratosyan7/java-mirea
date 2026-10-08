import java.util.Scanner;

/**
 * Практика №4, задания №1–№3. Клиент класса Triangle.
 *
 * Запрашивает три стороны, цвет и признак заливки, создаёт треугольник
 * и отображает площадь, периметр, цвет и признак заливки.
 * Нарушение неравенства треугольника перехватывается как
 * IllegalTriangleException (задание №2).
 */
public class TestTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double side1 = readDouble(input, "Введите сторону 1: ");
        double side2 = readDouble(input, "Введите сторону 2: ");
        double side3 = readDouble(input, "Введите сторону 3: ");

        System.out.print("Введите цвет: ");
        String color = input.nextLine().trim();

        System.out.print("Треугольник закрашен (true/false): ");
        boolean filled = Boolean.parseBoolean(input.nextLine().trim());

        try {
            Triangle triangle = new Triangle(side1, side2, side3, color, filled);

            System.out.println();
            System.out.println(triangle);
            System.out.printf("Площадь:  %.4f%n", triangle.getArea());
            System.out.printf("Периметр: %.4f%n", triangle.getPerimeter());
            System.out.println("Цвет:     " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.isFilled());

        } catch (IllegalTriangleException ex) {
            // Проверяемое исключение: компилятор обязал его обработать
            System.out.println();
            System.out.println("Ошибка: " + ex.getMessage());
        }

        input.close();
    }

    private static double readDouble(Scanner input, String prompt) {
        System.out.print(prompt);
        return Double.parseDouble(input.nextLine().trim().replace(',', '.'));
    }
}
