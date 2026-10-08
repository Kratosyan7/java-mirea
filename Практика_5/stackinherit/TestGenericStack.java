package stackinherit;

import java.util.Scanner;

/**
 * Практика №5, задание №2, пункт 2.
 * Программа запрашивает у пользователя пять строк и отображает их
 * в обратном порядке.
 */
public class TestGenericStack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите строку " + i + ": ");
            stack.push(input.nextLine());
        }

        System.out.println();
        System.out.println(stack);
        System.out.println("Размер: " + stack.getSize());
        System.out.println("На вершине: " + stack.peek());

        System.out.println();
        System.out.println("В обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println("  " + stack.pop());
        }
        System.out.println("Стек пуст: " + stack.isEmpty());

        // Обратная сторона наследования: наружу видны методы ArrayList,
        // которые к стеку отношения не имеют:
        stack.push("один");
        stack.push("два");
        stack.add(0, "влезли в середину");   // так в стек попадать не должно
        System.out.println();
        System.out.println("Через унаследованный add(0, ...): " + stack);

        input.close();
    }
}
