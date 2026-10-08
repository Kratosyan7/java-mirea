package mediator;

/** Практика №7, вариант №4. Демонстрация обмена сообщениями. */
public class TestChat {

    public static void main(String[] args) {

        ChatMediator chat = new ChatMediator();

        System.out.println("=== Подключение пользователей ===");
        User anna = new User("Анна", chat);
        User boris = new User("Борис", chat);
        User vera = new User("Вера", chat);

        chat.addUser(anna);
        chat.addUser(boris);
        chat.addUser(vera);
        System.out.println("Всего в чате: " + chat.getUserCount());

        System.out.println();
        System.out.println("=== Общая рассылка ===");
        anna.send("Привет всем!");

        System.out.println();
        boris.send("Привет, Анна");

        System.out.println();
        System.out.println("=== Личное сообщение ===");
        vera.sendTo("Анна", "Зайдёшь завтра?");

        System.out.println();
        System.out.println("=== Сообщение несуществующему пользователю ===");
        anna.sendTo("Григорий", "ты тут?");

        System.out.println();
        System.out.println("=== Новый участник подключается позже ===");
        User gleb = new User("Глеб", chat);
        chat.addUser(gleb);
        gleb.send("Я только что зашёл");

        System.out.println();
        System.out.println("Всего в чате: " + chat.getUserCount());
        System.out.println();
        System.out.println("Пользователи не знают друг о друге: у класса User нет");
        System.out.println("ни одной ссылки на другого User — только на Mediator.");
    }
}
