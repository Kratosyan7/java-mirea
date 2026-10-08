package vehicles;

/**
 * Практика №2, часть 1, задача #1.
 *
 * Класс Car из практики №1, дополненный:
 *   - приватными полями ownerName и insuranceNumber с геттерами и сеттерами;
 *   - protected-полем engineType (доступно потомкам) с методами доступа.
 */
public class Car {

    /** Текущий год — задан константой. */
    public static final int CURRENT_YEAR = 2026;

    private String model;            // модель автомобиля
    private String license;          // номер автомобиля
    private String color;            // цвет автомобиля
    private int year;                // год выпуска

    private String ownerName;        // имя владельца
    private String insuranceNumber;  // страховой номер

    /** protected — виден потомкам (в том числе ElectricCar) и внутри пакета. */
    protected String engineType;

    /** Конструктор со всеми полями класса. */
    public Car(String model, String license, String color, int year,
               String ownerName, String insuranceNumber) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = "Combustion";
    }

    /** Конструктор по умолчанию. */
    public Car() {
        this("не указана", "не указан", "не указан", CURRENT_YEAR,
             "не указан", "не указан");
    }

    /** Конструктор с полями по выбору: модель и год выпуска. */
    public Car(String model, int year) {
        this(model, "не указан", "не указан", year, "не указан", "не указан");
    }

    // --- Геттеры и сеттеры базовых полей ------------------------------

    public String getModel()   { return model; }
    public String getLicense() { return license; }
    public String getColor()   { return color; }
    public int    getYear()    { return year; }

    public void setModel(String model)     { this.model = model; }
    public void setLicense(String license) { this.license = license; }
    public void setColor(String color)     { this.color = color; }
    public void setYear(int year)          { this.year = year; }

    // --- Геттеры и сеттеры private-полей из задания --------------------

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    // --- Методы доступа к protected-полю engineType -------------------

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    // --- Прочее -------------------------------------------------------

    /** Возраст автомобиля от константы CURRENT_YEAR. */
    public int getAge() {
        return CURRENT_YEAR - year;
    }

    public String To_String() {
        return "Car{model='" + model + "', license='" + license
                + "', color='" + color + "', year=" + year
                + ", owner='" + ownerName + "', insurance='" + insuranceNumber
                + "', engine='" + engineType + "', age=" + getAge() + "}";
    }

    @Override
    public String toString() {
        return To_String();
    }
}
