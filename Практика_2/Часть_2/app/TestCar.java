package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

/**
 * Практика №2, часть 2. Тестовый класс: полиморфизм через ссылки на
 * родительские классы.
 */
public class TestCar {

    public static void main(String[] args) {

        // Ссылки родительского типа Vehicle на объекты разных потомков
        Vehicle[] fleet = {
            new Car("Lada Vesta", "А123ВС777", "белый", 2021,
                    "Иванов И.И.", "ОСАГО-5512340"),
            new ElectricCar("Tesla Model 3", "Е777КХ199", "синий", 2023,
                            "Петров П.П.", "ОСАГО-9087651", 75.0),
            new Car(),
            new ElectricCar()
        };

        System.out.println("=== Полиморфизм: один цикл, разные реализации ===");
        for (Vehicle v : fleet) {
            // vehicleType() и toString() вызываются у фактического объекта,
            // хотя тип ссылки — абстрактный Vehicle
            System.out.printf("%-14s %s%n", v.vehicleType(), v);
        }

        // --- Изменение свойств через сеттеры (инкапсуляция) -------------

        System.out.println();
        System.out.println("=== Меняем свойства сеттерами ===");

        Vehicle car = fleet[0];
        car.setColor("чёрный");
        car.setYear(2022);
        car.setOwnerName("Сидоров С.С.");
        car.setInsuranceNumber("ОСАГО-1122334");
        System.out.println(car);

        Vehicle electric = fleet[1];
        electric.setColor("красный");
        electric.setOwnerName("Кузнецов К.К.");
        System.out.println(electric);

        // batteryCapacity есть только у ElectricCar — нужно приведение типа
        if (electric instanceof ElectricCar) {
            ElectricCar e = (ElectricCar) electric;
            e.setBatteryCapacity(82.5);
            System.out.println("Ёмкость после сеттера: " + e.getBatteryCapacity() + " кВт·ч");
        }

        // --- Что даёт абстрактный класс ---------------------------------

        System.out.println();
        System.out.println("=== Проверка типов ===");
        for (Vehicle v : fleet) {
            System.out.printf("%-14s Vehicle:%-5b Car:%-5b ElectricCar:%-5b%n",
                    v.vehicleType(),
                    v instanceof Vehicle,
                    v instanceof Car,
                    v instanceof ElectricCar);
        }

        // Абстрактный класс нельзя создать напрямую:
        // Vehicle v = new Vehicle(...);   // ошибка компиляции
    }
}
