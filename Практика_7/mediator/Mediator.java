package mediator;

/**
 * Практика №7, вариант №4 (поведенческие паттерны). Паттерн Mediator.
 *
 * Интерфейс посредника для координации сообщений.
 *
 * Смысл паттерна: пользователи не знают друг о друге и не держат ссылок
 * друг на друга. Все сообщения идут через посредника, поэтому связей
 * не N*N, а N.
 */
public interface Mediator {

    /** Зарегистрировать пользователя в чате. */
    void addUser(User user);

    /** Разослать сообщение всем, кроме отправителя. */
    void sendMessage(String message, User sender);

    /** Личное сообщение конкретному получателю по имени. */
    void sendPrivate(String message, User sender, String recipientName);
}
