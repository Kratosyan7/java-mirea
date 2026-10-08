package proxy;

/**
 * Практика №7, вариант №7. Проверка, что изображение загружается
 * только при первом вызове display().
 */
public class TestProxy {

    public static void main(String[] args) {

        System.out.println("=== Создание заместителей ===");
        ProxyImage photo1 = new ProxyImage("отпуск.jpg");
        ProxyImage photo2 = new ProxyImage("диплом.png");
        ProxyImage photo3 = new ProxyImage("котик.jpg");

        System.out.println();
        System.out.println("Загружено после создания:");
        System.out.println("  отпуск.jpg: " + photo1.isLoaded());
        System.out.println("  диплом.png: " + photo2.isLoaded());
        System.out.println("  котик.jpg:  " + photo3.isLoaded());

        System.out.println();
        System.out.println("=== Первый вызов display() ===");
        long start = System.currentTimeMillis();
        photo1.display();
        long firstCall = System.currentTimeMillis() - start;

        System.out.println();
        System.out.println("=== Повторный вызов display() ===");
        start = System.currentTimeMillis();
        photo1.display();
        long secondCall = System.currentTimeMillis() - start;

        System.out.println();
        System.out.printf("Первый вызов:   %d мс (была загрузка)%n", firstCall);
        System.out.printf("Повторный:      %d мс (загрузки не было)%n", secondCall);

        System.out.println();
        System.out.println("=== photo3 так и не понадобилось ===");
        System.out.println("  отпуск.jpg загружено: " + photo1.isLoaded());
        System.out.println("  котик.jpg  загружено: " + photo3.isLoaded()
                           + "  <- файл не читался вообще");

        System.out.println();
        System.out.println("=== Клиент работает через интерфейс Image ===");
        Image[] gallery = {
            new ProxyImage("горы.jpg"),
            new RealImage("море.jpg")      // этот загрузился сразу, при создании
        };
        System.out.println("Галерея создана, показываем:");
        for (Image img : gallery) {
            img.display();
        }
    }
}
