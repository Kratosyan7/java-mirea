package builder;

/**
 * Практика №6, вариант №4. Паттерн Builder.
 *
 * Заказ в ресторане: основное блюдо, гарнир, напиток, десерт.
 *
 * Поля final и сеттеров нет — объект неизменяемый (immutable). Собрать его
 * можно только через OrderBuilder, поэтому «полусобранного» заказа
 * в программе существовать не может.
 *
 * Конструктор сделан пакетным (без модификатора): он доступен только
 * OrderBuilder внутри пакета builder.
 */
public class Order {

    private final String mainDish;   // основное блюдо
    private final String sideDish;   // гарнир
    private final String drink;      // напиток
    private final String dessert;    // десерт

    /** Вызывается только из OrderBuilder.build(). */
    Order(String mainDish, String sideDish, String drink, String dessert) {
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drink = drink;
        this.dessert = dessert;
    }

    public String getMainDish() { return mainDish; }
    public String getSideDish() { return sideDish; }
    public String getDrink()    { return drink; }
    public String getDessert()  { return dessert; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Заказ:\n");
        appendIfPresent(sb, "Основное блюдо", mainDish);
        appendIfPresent(sb, "Гарнир", sideDish);
        appendIfPresent(sb, "Напиток", drink);
        appendIfPresent(sb, "Десерт", dessert);
        return sb.toString();
    }

    private static void appendIfPresent(StringBuilder sb, String label, String value) {
        if (value != null) {
            sb.append(String.format("  %-15s %s%n", label + ":", value));
        }
    }
}
