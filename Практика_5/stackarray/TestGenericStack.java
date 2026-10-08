package stackarray;

import java.util.Scanner;

/** Практика №5, задание №2, пункт 1. Проверка стека на массиве. */
public class TestGenericStack {

    public static void main(String[] args) {

        System.out.println("=== Удвоение массива при заполнении ===");
        GenericStack<Integer> stack = new GenericStack<>();
        System.out.println("начальная вместимость: " + stack.getCapacity());

        for (int i = 1; i <= 10; i++) {
            stack.push(i);
            System.out.printf("push(%2d) -> size=%2d, вместимость=%2d%n",
                              i, stack.getSize(), stack.getCapacity());
        }

        System.out.println();
        System.out.println(stack);
        System.out.println("peek() = " + stack.peek() + " (элемент остался)");
        System.out.println("pop()  = " + stack.pop());
        System.out.println("pop()  = " + stack.pop());
        System.out.println(stack);
        System.out.println("isEmpty() = " + stack.isEmpty());

        // --- Пять строк в обратном порядке -------------------------------

        System.out.println();
        System.out.println("=== Пять строк в обратном порядке ===");
        Scanner input = new Scanner(System.in);
        GenericStack<String> strings = new GenericStack<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите строку " + i + ": ");
            strings.push(input.nextLine());
        }

        System.out.println("В обратном порядке:");
        while (!strings.isEmpty()) {
            System.out.println("  " + strings.pop());
        }

        input.close();
    }
}
