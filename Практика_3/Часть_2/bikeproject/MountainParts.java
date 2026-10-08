package bikeproject;

/**
 * Практика №3, часть 2, пункт 2.
 *
 * Константа TERRAIN и методы доступа к полям горного велосипеда.
 */
public interface MountainParts {

    /** Тип местности для горного велосипеда. */
    String TERRAIN = "off_road";

    String getSuspension();
    void   setSuspension(String newValue);

    String getType();
    void   setType(String newValue);
}
