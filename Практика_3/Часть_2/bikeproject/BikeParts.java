package bikeproject;

/**
 * Практика №3, часть 2, пункт 1.
 *
 * Интерфейс задаёт название компании-производителя как неизменяемое значение
 * и объявляет методы, которые обязан реализовать любой класс велосипеда.
 *
 * Все поля интерфейса неявно public static final — то есть константы,
 * поэтому слова static и final писать не нужно.
 */
public interface BikeParts {

    /** Производитель — одно значение на все велосипеды, изменить нельзя. */
    String MAKE = "Oracle Cycles";

    String getMake();

    String getHandleBars();
    void   setHandleBars(String newValue);

    String getFrame();
    void   setFrame(String newValue);

    String getTyres();
    void   setTyres(String newValue);

    String getSeatType();
    void   setSeatType(String newValue);

    int  getNumGears();
    void setNumGears(int newValue);
}
