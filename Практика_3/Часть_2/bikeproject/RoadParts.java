package bikeproject;

/**
 * Практика №3, часть 2, пункт 3.
 *
 * Константа terrain и методы доступа к полям шоссейного велосипеда.
 *
 * Имя константы оставлено строчным, как указано в задании, хотя по
 * соглашениям Java константы пишут заглавными (см. TERRAIN в MountainParts).
 *
 * Параметры newValue здесь типа int, а не String: поля tyreWidth и postHeight
 * в исходном проекте целочисленные, и пункт 8 требует присвоить посту
 * числовое значение 20.
 */
public interface RoadParts {

    /** Тип местности для шоссейного велосипеда. */
    String terrain = "track_racing";

    int  getTyreWidth();
    void setTyreWidth(int newValue);

    int  getPostHeight();
    void setPostHeight(int newValue);
}
