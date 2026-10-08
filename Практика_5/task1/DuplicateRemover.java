package task1;

import java.util.ArrayList;

/**
 * Практика №5, задание №1, пункт 1.
 *
 * Метод принимает ArrayList и возвращает ArrayList без дубликатов.
 * Проверка на повтор — методом contains интерфейса List, как требует задание.
 *
 * <E> — параметр типа (дженерик): метод работает с любым типом элементов,
 * а компилятор проверяет типы на этапе компиляции, а не во время выполнения.
 */
public class DuplicateRemover {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> source) {
        ArrayList<E> result = new ArrayList<>();

        for (E element : source) {
            // contains() сравнивает элементы методом equals()
            if (!result.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
}
