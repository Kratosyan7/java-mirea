package vehicles;

/** Практика №2, часть 2. Автомобиль с двигателем внутреннего сгорания. */
public class Car extends Vehicle {

    public Car(String model, String license, String color, int year,
               String ownerName, String insuranceNumber) {
        // super(...) обращается к конструктору родительского класса
        super(model, license, color, year, ownerName, insuranceNumber, "Combustion");
    }

    public Car() {
        this("не указана", "не указан", "не указан", CURRENT_YEAR,
             "не указан", "не указан");
    }

    /** Конструктор для потомков: позволяет задать свой тип двигателя. */
    protected Car(String model, String license, String color, int year,
                  String ownerName, String insuranceNumber, String engineType) {
        super(model, license, color, year, ownerName, insuranceNumber, engineType);
    }

    /** Реализация абстрактного метода родителя. */
    @Override
    public String vehicleType() {
        return "Car";
    }
}
