package builder;

/** Практика №6, вариант №4. Сборка заказов с разными конфигурациями. */
public class TestOrder {

    public static void main(String[] args) {

        System.out.println("=== Полный заказ ===");
        Order full = new OrderBuilder()
                .setMainDish("Стейк рибай")
                .setSideDish("Картофель фри")
                .setDrink("Морс клюквенный")
                .setDessert("Чизкейк")
                .build();
        System.out.print(full);

        System.out.println();
        System.out.println("=== Только основное блюдо ===");
        Order minimal = new OrderBuilder()
                .setMainDish("Борщ")
                .build();
        System.out.print(minimal);

        System.out.println();
        System.out.println("=== Без десерта, порядок шагов другой ===");
        Order noDessert = new OrderBuilder()
                .setDrink("Эспрессо")
                .setSideDish("Рис с овощами")
                .setMainDish("Лосось на гриле")
                .build();
        System.out.print(noDessert);

        System.out.println();
        System.out.println("=== Обращение к полям через геттеры ===");
        System.out.println("Основное блюдо полного заказа: " + full.getMainDish());
        System.out.println("Десерт заказа без десерта:      " + noDessert.getDessert());

        System.out.println();
        System.out.println("=== Нарушение обязательного шага ===");
        try {
            new OrderBuilder()
                    .setDrink("Чай")
                    .setDessert("Мороженое")
                    .build();
        } catch (IllegalStateException ex) {
            System.out.println("Перехвачено: " + ex.getMessage());
        }

        System.out.println();
        System.out.println("=== Один строитель — несколько заказов ===");
        OrderBuilder builder = new OrderBuilder().setMainDish("Паста карбонара");
        Order first = builder.build();
        Order second = builder.setDrink("Кола").build();
        System.out.print(first);
        System.out.print(second);
        System.out.println("У первого заказа напиток: " + first.getDrink()
                           + "  <- остался null, объект неизменяемый");
    }
}
