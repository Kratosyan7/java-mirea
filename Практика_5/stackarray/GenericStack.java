package stackarray;

import java.util.Arrays;

/**
 * Практика №5, задание №2, пункт 1.
 *
 * GenericStack, реализованный на массиве вместо ArrayList. Перед добавлением
 * проверяется размер массива: если он заполнен, создаётся новый массив
 * удвоенного размера и элементы копируются в него.
 */
public class GenericStack<E> {

    /** Начальный размер внутреннего массива. */
    private static final int INITIAL_CAPACITY = 4;

    private Object[] elements;   // массив для хранения элементов
    private int size;            // количество элементов в стеке

    public GenericStack() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /** Текущая вместимость — видно, как срабатывает удвоение. */
    public int getCapacity() {
        return elements.length;
    }

    /** Возвращает элемент на вершине, не удаляя его. */
    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return (E) elements[size - 1];
    }

    /** Добавляет элемент на вершину, при необходимости расширяя массив. */
    public void push(E o) {
        if (size == elements.length) {
            grow();
        }
        elements[size] = o;
        size++;
    }

    /** Возвращает и удаляет элемент с вершины. */
    @SuppressWarnings("unchecked")
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        E o = (E) elements[size - 1];
        elements[size - 1] = null;   // убираем ссылку, чтобы объект собрал GC
        size--;
        return o;
    }

    /** Удваивает массив и переносит в него текущие элементы. */
    private void grow() {
        Object[] bigger = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            bigger[i] = elements[i];
        }
        elements = bigger;
    }

    @Override
    public String toString() {
        return "стек: " + Arrays.toString(Arrays.copyOf(elements, size));
    }
}
