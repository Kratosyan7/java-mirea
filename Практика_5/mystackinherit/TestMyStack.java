package mystackinherit;

import java.util.Scanner;

/** Практика №5, задание №3, пункт 2. Версия на наследовании. */
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
        System.out.println("В обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println("  " + stack.pop());
        }

        // Минус наследования: лишние методы доступны и ломают смысл стека
        stack.push("один");
        stack.push("два");
        stack.add(0, "влезли в середину");
        System.out.println();
        System.out.println("После унаследованного add(0, ...): " + stack);
        System.out.println("peek() вернёт: " + stack.peek());

        input.close();
    }
}
