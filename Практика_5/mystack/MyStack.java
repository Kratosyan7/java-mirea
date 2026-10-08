package mystack;

import java.util.ArrayList;

/**
 * Практика №5, задание №3 (второе «Задание №1» в методичке), пункт 1.
 *
 * MyStack по таблице из задания, реализованный через КОМПОЗИЦИЮ: класс
 * содержит ArrayList как поле, а не наследуется от него.
 *
 * Композиция моделирует отношение has-a («стек имеет список»), наследование —
 * is-a («стек является списком»). Композиция здесь лучше: наружу выставлены
 * только пять методов стека, а методы ArrayList остаются скрытыми.
 */
public class MyStack {

    /** Список для хранения элементов — составной объект. */
    private ArrayList<Object> list = new ArrayList<>();

    /** Возвращает true, если стек пуст. */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /** Возвращает количество элементов в стеке. */
    public int getSize() {
        return list.size();
    }

    /** Возвращает элемент на вершине стека, не удаляя его. */
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.get(getSize() - 1);
    }

    /** Возвращает и удаляет элемент на вершине стека. */
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.remove(getSize() - 1);
    }

    /** Добавляет элемент в верхнюю часть стека. */
    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "стек: " + list.toString();
    }
}
