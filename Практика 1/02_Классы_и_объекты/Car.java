

public class Car {

    public static final int CURRENT_YEAR = 2026;

    private String model;    // модель автомобиля
    private String license;  // номер автомобиля
    private String color;    // цвет автомобиля
    private int year;        // год выпуска

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {
        this("не указана", "не указан", "не указан", CURRENT_YEAR);
    }

    public Car(String model, int year) {
        this(model, "не указан", "не указан", year);
    }

    //Геттеры

    public String getModel() {
        return model;
    }

    public String getLicense() {
        return license;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    //Сеттеры

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Прочие методы класса

    public int getAge() {
        return CURRENT_YEAR - year;
    }

    public String To_String() {
        return "Car{model='" + model + "'"
                + ", license='" + license + "'"
                + ", color='" + color + "'"
                + ", year=" + year
                + ", age=" + getAge() + "}";
    }

    @Override
    public String toString() {
        return To_String();
    }
}