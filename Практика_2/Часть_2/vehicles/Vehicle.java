package vehicles;

/**
 * Практика №2, часть 2. Абстрактный класс — общие свойства всех
 * транспортных средств.
 *
 * Абстрактный класс нельзя инстанцировать (new Vehicle(...) не скомпилируется),
 * он существует только как основа для потомков.
 */
public abstract class Vehicle {

    public static final int CURRENT_YEAR = 2026;

    private String model;            // модель
    private String license;          // номерной знак
    private String color;            // цвет
    private int year;                // год выпуска
    private String ownerName;        // имя владельца
    private String insuranceNumber;  // страховой номер

    /** protected — чтобы потомки могли задавать тип двигателя напрямую. */
    protected String engineType;

    protected Vehicle(String model, String license, String color, int year,
                      String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    /**
     * Абстрактный метод: тела нет, каждый потомок обязан его реализовать.
     * Именно он делает класс абстрактным.
     */
    public abstract String vehicleType();

    // --- Геттеры ------------------------------------------------------

    public String getModel()           { return model; }
    public String getLicense()         { return license; }
    public String getColor()           { return color; }
    public int    getYear()            { return year; }
    public String getOwnerName()       { return ownerName; }
    public String getInsuranceNumber() { return insuranceNumber; }
    public String getEngineType()      { return engineType; }

    // --- Сеттеры ------------------------------------------------------

    public void setModel(String model)                     { this.model = model; }
    public void setLicense(String license)                 { this.license = license; }
    public void setColor(String color)                     { this.color = color; }
    public void setYear(int year)                          { this.year = year; }
    public void setOwnerName(String ownerName)             { this.ownerName = ownerName; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }
    public void setEngineType(String engineType)           { this.engineType = engineType; }

    public int getAge() {
        return CURRENT_YEAR - year;
    }

    @Override
    public String toString() {
        return vehicleType() + "{model='" + model + "', license='" + license
                + "', color='" + color + "', year=" + year
                + ", owner='" + ownerName + "', insurance='" + insuranceNumber
                + "', engine='" + engineType + "', age=" + getAge() + "}";
    }
}
