package app;

import vehicles.Car;
import vehicles.ElectricCar;

/**
 * Практика №2, часть 1. Тестовый класс в отдельном пакете app.
 *
 * Демонстрирует работу инкапсуляции и наследования: что доступно из другого
 * пакета, а что нет.
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car("Lada Vesta", "А123ВС777", "белый", 2021,
                          "Иванов И.И.", "ОСАГО-5512340");

        ElectricCar electric = new ElectricCar("Tesla Model 3", "Е777КХ199", "синий", 2023,
                                               "Петров П.П.", "ОСАГО-9087651", 75.0);

        System.out.println("=== Объекты ===");
        System.out.println(car.To_String());
        System.out.println(electric.To_String());

        // --- Инкапсуляция: private-поля только через геттеры/сеттеры ---

        System.out.println();
        System.out.println("=== private-поля через геттеры ===");
        System.out.println("Владелец:       " + car.getOwnerName());
        System.out.println("Страховой номер: " + car.getInsuranceNumber());

        car.setOwnerName("Сидоров С.С.");
        car.setInsuranceNumber("ОСАГО-1122334");
        System.out.println("После сеттеров:  " + car.getOwnerName()
                           + " / " + car.getInsuranceNumber());

        // Напрямую нельзя — поля объявлены private:
        // car.ownerName = "кто-то";   // ошибка компиляции

        // --- protected-поле: из пакета app напрямую тоже недоступно ------

        System.out.println();
        System.out.println("=== protected-поле engineType ===");
        System.out.println("Тип двигателя Car:         " + car.getEngineType());
        System.out.println("Тип двигателя ElectricCar: " + electric.getEngineType());

        // Напрямую нельзя: engineType объявлен protected, а app — другой пакет.
        // Внутри самого ElectricCar обращение this.engineType работает,
        // потому что protected открыт потомкам.
        // electric.engineType = "Hybrid";   // ошибка компиляции

        // --- Наследование -----------------------------------------------

        System.out.println();
        System.out.println("=== Наследование ===");
        System.out.println("ElectricCar унаследовал getModel(): " + electric.getModel());
        System.out.println("ElectricCar унаследовал getAge():   " + electric.getAge());
        System.out.println("Своё поле batteryCapacity:          "
                           + electric.getBatteryCapacity() + " кВт·ч");

        System.out.println();
        System.out.println("ElectricCar — это Car? "
                           + (electric instanceof Car));

        // Полиморфизм: ссылка родительского типа на объект-потомок
        Car asParent = electric;
        System.out.println("Через ссылку типа Car вызывается To_String() потомка:");
        System.out.println("  " + asParent.To_String());
    }
}
