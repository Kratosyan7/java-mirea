package proxy;

/**
 * Практика №7, вариант №7. Прокси-изображение (ленивая загрузка).
 *
 * Хранит только имя файла. Реальный объект RealImage создаётся — а значит
 * файл грузится с диска — лишь при первом вызове display(). Повторные
 * вызовы используют уже загруженный объект.
 */
public class ProxyImage implements Image {

    private final String fileName;
    private RealImage realImage;   // null, пока изображение не понадобилось

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        System.out.println("  [ProxyImage] создан заместитель для " + fileName
                           + " — файл НЕ загружен");
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("  [ProxyImage] первый вызов display() — создаём RealImage");
            realImage = new RealImage(fileName);
        } else {
            System.out.println("  [ProxyImage] изображение уже загружено, повторной загрузки нет");
        }
        realImage.display();
    }

    /** Загружено ли реальное изображение — для проверки в тесте. */
    public boolean isLoaded() {
        return realImage != null;
    }

    public String getFileName() {
        return fileName;
    }
}
