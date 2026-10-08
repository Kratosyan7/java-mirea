package mystackinherit;

import java.util.ArrayList;

/**
 * Практика №5, задание №3, пункт 2.
 *
 * Та же задача, но через НАСЛЕДОВАНИЕ от ArrayList.
 */
public class MyStack extends ArrayList<Object> {

    public int getSize() {
        return size();
    }

    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        return remove(getSize() - 1);
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}
