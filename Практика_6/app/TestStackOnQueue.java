package app;

import queue.StackOnQueue;

/**
 * Практика №6, задача #2. Тестовый класс.
 *
 * По заданию: создать экземпляр StackOnQueue, добавить два значения,
 * вывести вершину без удаления, вывести вершину и удалить её,
 * проверить стек на пустоту и вывести все элементы.
 */
public class TestStackOnQueue {

    public static void main(String[] args) {

        StackOnQueue stack = new StackOnQueue();

        System.out.println("=== Добавляем два значения ===");
        stack.push(10);
        System.out.println("push(10) -> " + stack);
        stack.push(20);
        System.out.println("push(20) -> " + stack);

        System.out.println();
        System.out.println("=== Вершина без удаления ===");
        System.out.println("top() = " + stack.top());
        System.out.println("стек после top(): " + stack + "  (размер " + stack.size() + ")");

        System.out.println();
        System.out.println("=== Вершина с удалением ===");
        System.out.println("pop() = " + stack.pop());
        System.out.println("стек после pop(): " + stack + "  (размер " + stack.size() + ")");

        System.out.println();
        System.out.println("=== Проверка на пустоту ===");
        System.out.println("empty() = " + stack.empty());
        System.out.println("pop()   = " + stack.pop());
        System.out.println("empty() = " + stack.empty());

        System.out.println();
        System.out.println("=== Все элементы стека ===");
        for (int i = 1; i <= 5; i++) {
            stack.push(i * 100);
        }
        System.out.println(stack);

        System.out.println();
        System.out.println("Порядок извлечения (должен быть обратным добавлению):");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("=== Пустой стек: pop() выбросит исключение ===");
        try {
            stack.pop();
        } catch (IllegalStateException ex) {
            System.out.println("Перехвачено: " + ex.getMessage());
        }
    }
}
