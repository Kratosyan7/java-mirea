package builder;

/**
 * Практика №6, вариант №4. Строитель заказа.
 *
 * Каждый set-метод возвращает сам строитель (return this), поэтому вызовы
 * можно выстраивать в цепочку:
 *
 *   new OrderBuilder().setMainDish("стейк").setDrink("чай").build();
 *
 * Это и есть пошаговое создание объекта: порядок шагов свободный,
 * ненужные шаги можно пропустить.
 */
public class OrderBuilder {

    private String mainDish;
    private String sideDish;
    private String drink;
    private String dessert;

    public OrderBuilder setMainDish(String mainDish) {
        this.mainDish = mainDish;
        return this;
    }

    public OrderBuilder setSideDish(String sideDish) {
        this.sideDish = sideDish;
        return this;
    }

    public OrderBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public OrderBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    /**
     * Возвращает готовый заказ.
     * Проверка обязательного шага: без основного блюда заказа не бывает.
     */
    public Order build() {
        if (mainDish == null) {
            throw new IllegalStateException("В заказе должно быть основное блюдо");
        }
        return new Order(mainDish, sideDish, drink, dessert);
    }
}
