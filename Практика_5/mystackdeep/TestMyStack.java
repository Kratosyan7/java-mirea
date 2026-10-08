package mystackdeep;

/**
 * Практика №5, задание №3, пункт 3. Проверка глубокой копии.
 */
public class TestMyStack {

    public static void main(String[] args) {

        MyStack original = new MyStack();
        original.push("первый");
        original.push("второй");
        original.push("третий");

        System.out.println("=== Глубокая копия через clone() ===");
        MyStack deep = (MyStack) original.clone();
        System.out.println("оригинал: " + original);
        System.out.println("копия:    " + deep);

        deep.pop();
        deep.push("изменённый");
        System.out.println("после изменений в копии:");
        System.out.println("  оригинал: " + original + "   <- не изменился");
        System.out.println("  копия:    " + deep);

        System.out.println();
        System.out.println("=== Поверхностная копия — для сравнения ===");
        MyStack base = new MyStack();
        base.push("a");
        base.push("b");

        MyStack shallow = base.shallowCopy();
        System.out.println("оригинал: " + base);
        System.out.println("копия:    " + shallow);

        shallow.pop();
        System.out.println("после pop() у копии:");
        System.out.println("  оригинал: " + base + "   <- тоже изменился!");
        System.out.println("  копия:    " + shallow);

        System.out.println();
        System.out.println("=== Конструктор копирования ===");
        MyStack viaConstructor = new MyStack(original);
        viaConstructor.push("только в копии");
        System.out.println("оригинал: " + original);
        System.out.println("копия:    " + viaConstructor);
    }
}
