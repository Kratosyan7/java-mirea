package task1;

/**
 * Практика №5, задание №1, пункт 2.
 *
 * Линейный поиск: последовательно сравнивает элементы с искомым.
 * Возвращает позицию найденного элемента или -1, если элемента нет.
 */
public class LinearSearch {

    /** Поиск в массиве объектов. */
    public static <E> int search(E[] array, E key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    /** Поиск в массиве int — примитивы в дженерики не подставляются. */
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
