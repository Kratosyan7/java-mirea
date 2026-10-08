package mystack;

import java.util.Scanner;

/**
 * Практика №5, задание №3, пункт 1. Клиент класса MyStack: запрашивает
 * пять строк и отображает их в обратном порядке.
 */
public class TestMyStack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите строку " + i + ": ");
            stack.push(input.nextLine());
        }

        System.out.println();
        System.out.println(stack);
        System.out.println("getSize()  = " + stack.getSize());
        System.out.println("peek()     = " + stack.peek());
        System.out.println("isEmpty()  = " + stack.isEmpty());

        System.out.println();
        System.out.println("В обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println("  " + stack.pop());
        }
        System.out.println("isEmpty() = " + stack.isEmpty());

        // Композиция скрыла ArrayList: таких методов снаружи нет
        // stack.add("мимо");   // ошибка компиляции
        // stack.clear();       // ошибка компиляции

        input.close();
    }
}
