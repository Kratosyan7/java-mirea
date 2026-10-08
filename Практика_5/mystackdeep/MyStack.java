package mystackdeep;

import java.util.ArrayList;

/**
 * Практика №5, задание №3, пункт 3.
 *
 * MyStack на композиции, переписанный для ГЛУБОКОЙ копии поля-списка.
 *
 * Разница между копиями:
 *   - поверхностная (shallow): скопирована только ссылка на ArrayList,
 *     поэтому оба стека работают с одним и тем же списком;
 *   - глубокая (deep): создан новый ArrayList со теми же элементами,
 *     поэтому стеки независимы.
 *
 * Элементы при этом не клонируются: Object клонировать в общем случае нельзя.
 * Копируется сам список — именно это требует задание.
 */
public class MyStack implements Cloneable {

    private ArrayList<Object> list = new ArrayList<>();

    public MyStack() {
    }

    /** Конструктор копирования: тоже делает глубокую копию списка. */
    public MyStack(MyStack other) {
        this.list = new ArrayList<>(other.list);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.remove(getSize() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    /**
     * Глубокая копия: super.clone() даёт поверхностную копию (поле list
     * указывает на тот же объект), поэтому список пересоздаётся вручную.
     */
    @Override
    public Object clone() {
        try {
            MyStack copy = (MyStack) super.clone();   // поверхностная копия
            copy.list = new ArrayList<>(this.list);   // делаем её глубокой
            return copy;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    /** Для сравнения: поверхностная копия — показывает, почему так нельзя. */
    public MyStack shallowCopy() {
        try {
            return (MyStack) super.clone();   // list остаётся общим
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "стек: " + list.toString();
    }
}
