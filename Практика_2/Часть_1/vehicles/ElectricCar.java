package vehicles;

/**
 * Практика №2, часть 1, задача #2.
 *
 * Наследник Car с полем batteryCapacity. Тип двигателя задаётся через
 * унаследованное protected-поле engineType — напрямую, без сеттера,
 * что и демонстрирует смысл модификатора protected.
 */
public class ElectricCar extends Car {

    private double batteryCapacity;   // ёмкость аккумулятора, кВт·ч

    public ElectricCar(String model, String license, String color, int year,
                       String ownerName, String insuranceNumber,
                       double batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        // protected-поле родителя доступно напрямую из подкласса
        this.engineType = "Electric";
    }

    public ElectricCar() {
        super();
        this.batteryCapacity = 0;
        this.engineType = "Electric";
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String To_String() {
        return "ElectricCar{model='" + getModel() + "', license='" + getLicense()
                + "', color='" + getColor() + "', year=" + getYear()
                + ", owner='" + getOwnerName() + "', insurance='" + getInsuranceNumber()
                + "', engine='" + engineType + "', battery=" + batteryCapacity
                + " кВт·ч, age=" + getAge() + "}";
    }
}
