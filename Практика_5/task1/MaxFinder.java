package task1;

/**
 * Практика №5, задание №1, пункты 3–4.
 *
 * Поиск наибольшего элемента через compareTo() интерфейса Comparable —
 * в одномерном и в двумерном массиве.
 *
 * Запись <E extends Comparable<E>> — ограниченный параметр типа: метод
 * принимает только такие типы, которые умеют себя сравнивать.
 */
public class MaxFinder {

    /** Пункт 3: наибольший элемент одномерного массива. */
    public static <E extends Comparable<E>> E max(E[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        E max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    /** Пункт 4: наибольший элемент двумерного массива. */
    public static <E extends Comparable<E>> E max(E[][] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        E max = null;
        for (E[] row : array) {
            for (E element : row) {
                if (element == null) {
                    continue;
                }
                if (max == null || element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }
        return max;
    }
}
