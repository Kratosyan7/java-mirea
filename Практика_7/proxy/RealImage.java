package proxy;

/**
 * Практика №7, вариант №7. Реальное изображение.
 *
 * Загрузка файла с диска — дорогая операция, поэтому она вынесена
 * в конструктор: создание объекта сразу означает загрузку.
 */
public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    /** Имитация долгой загрузки. */
    private void loadFromDisk() {
        System.out.println("    [RealImage] загрузка файла " + fileName + " с диска...");
        try {
            Thread.sleep(150);   // чтобы задержка была заметна
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("    [RealImage] файл " + fileName + " загружен");
    }

    @Override
    public void display() {
        System.out.println("    [RealImage] отображение " + fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
