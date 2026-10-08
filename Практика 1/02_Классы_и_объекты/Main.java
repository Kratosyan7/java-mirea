public class Main {

    public static void main(String[] args) {

        //Создание объектов разными конструкторами

        // Конструктор со всеми полями
        Car full = new Car("Lada Vesta", "А123ВС777", "белый", 2021);

        // Конструктор по умолчанию
        Car byDefault = new Car();

        // Конструктор с полями по выбору (модель и год выпуска)
        Car partial = new Car("Toyota Camry", 2015);

        System.out.println("=== Созданные объекты (метод To_String) ===");
        System.out.println(full.To_String());
        System.out.println(byDefault.To_String());
        System.out.println(partial.To_String());

        //Проверка сеттеров

        System.out.println();
        System.out.println("=== Заполняем объект byDefault сеттерами ===");
        byDefault.setModel("Kia Rio");
        byDefault.setLicense("О777ОО199");
        byDefault.setColor("синий");
        byDefault.setYear(2019);
        System.out.println(byDefault.To_String());

        //Проверка геттероd

        System.out.println();
        System.out.println("=== Поля объекта partial по одному (геттеры) ===");
        System.out.println("Модель:      " + partial.getModel());
        System.out.println("Номер:       " + partial.getLicense());
        System.out.println("Цвет:        " + partial.getColor());
        System.out.println("Год выпуска: " + partial.getYear());

        //Возраст автомобиля

        System.out.println();
        System.out.println("=== Возраст автомобилей (текущий год: " + Car.CURRENT_YEAR + ") ===");
        System.out.println(full.getModel() + ": " + full.getAge() + " г.");
        System.out.println(byDefault.getModel() + ": " + byDefault.getAge() + " г.");
        System.out.println(partial.getModel() + ": " + partial.getAge() + " г.");

        System.out.println();
        System.out.println("=== Прямая печать объекта ===");
        System.out.println(full);
    }
}
