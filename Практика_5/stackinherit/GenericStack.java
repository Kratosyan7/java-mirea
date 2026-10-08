package stackinherit;

import java.util.ArrayList;

/**
 * Практика №5, задание №2, пункт 2.
 *
 * Стек, который НАСЛЕДУЕТСЯ от ArrayList, а не содержит его внутри.
 *
 * Отличие от версии на композиции: здесь отношение is-a — стек «является»
 * списком, поэтому наружу торчат все методы ArrayList (add, get, remove,
 * clear и прочие), в том числе неподходящие для стека. Именно поэтому
 * композиция обычно предпочтительнее — см. UML.md.
 */
public class GenericStack<E> extends ArrayList<E> {

    public int getSize() {
        return size();
    }

    /** Возвращает элемент на вершине, не удаляя его. */
    public E peek() {
        return get(getSize() - 1);
    }

    /** Добавляет новый элемент на вершину. */
    public void push(E o) {
        add(o);
    }

    /** Возвращает и удаляет элемент с вершины. */
    public E pop() {
        E o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    /**
     * isEmpty() наследуется от ArrayList и работает правильно,
     * переопределять его не нужно.
     */

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}
