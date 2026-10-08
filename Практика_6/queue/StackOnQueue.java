package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Практика №6, задача #1.
 *
 * Стек (LIFO — «последним пришёл, первым ушёл») на двух очередях
 * (FIFO — «первым пришёл, первым ушёл»).
 *
 * Отношение — КОМПОЗИЦИЯ: класс содержит очереди в приватных полях,
 * а не наследуется от Queue.
 *
 * Используются только стандартные методы очереди: add/offer, peek, poll,
 * size, isEmpty.
 *
 * Идея: push кладёт новый элемент в пустую вспомогательную очередь, затем
 * переливает в неё всё из основной. Новый элемент оказывается впереди,
 * поэтому poll основной очереди всегда отдаёт последний добавленный —
 * то есть вершину стека.
 */
public class StackOnQueue {

    private Queue<Integer> main = new LinkedList<>();     // основная очередь
    private Queue<Integer> helper = new LinkedList<>();   // вспомогательная

    /** Помещает элемент x на вершину стека. */
    public void push(int x) {
        // новый элемент — первым во вспомогательную очередь
        helper.add(x);

        // переливаем всё из основной очереди за ним
        while (!main.isEmpty()) {
            helper.add(main.poll());
        }

        // меняем очереди ролями, чтобы не копировать элементы обратно
        Queue<Integer> swap = main;
        main = helper;
        helper = swap;
    }

    /** Удаляет элемент на вершине стека и возвращает его. */
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return main.poll();
    }

    /** Возвращает элемент на вершине стека, не удаляя его. */
    public int top() {
        if (empty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return main.peek();
    }

    /** Возвращает true, если стек пуст. */
    public boolean empty() {
        return main.isEmpty();
    }

    /** Количество элементов в стеке. */
    public int size() {
        return main.size();
    }

    /**
     * Строковое представление всех элементов стека: слева вершина.
     * main уже хранит элементы в порядке от вершины к дну, поэтому
     * достаточно вывести очередь как есть.
     */
    @Override
    public String toString() {
        return "стек (вершина слева): " + main.toString();
    }
}
