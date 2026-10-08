package vehicles;

/** Практика №2, часть 2. Электромобиль: наследник Car. */
public class ElectricCar extends Car {

    private double batteryCapacity;   // ёмкость аккумулятора, кВт·ч

    public ElectricCar(String model, String license, String color, int year,
                       String ownerName, String insuranceNumber,
                       double batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber, "Electric");
        this.batteryCapacity = batteryCapacity;
        // protected-поле прародителя Vehicle доступно и здесь
        this.engineType = "Electric";
    }

    public ElectricCar() {
        this("не указана", "не указан", "не указан", CURRENT_YEAR,
             "не указан", "не указан", 0);
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        // super.toString() — переиспользуем описание родителя, добавляя своё поле
        String base = super.toString();
        return base.substring(0, base.length() - 1)
                + ", battery=" + batteryCapacity + " кВт·ч}";
    }
}
