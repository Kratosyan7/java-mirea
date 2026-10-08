package mediator;

/**
 * Практика №7, вариант №4. Пользователь чата.
 *
 * Знает только о посреднике — ссылок на других пользователей у него нет.
 */
public class User {

    private final String name;
    private final Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    /** Отправить сообщение всем через посредника. */
    public void send(String message) {
        System.out.println(name + " отправляет: " + message);
        mediator.sendMessage(message, this);
    }

    /** Отправить личное сообщение через посредника. */
    public void sendTo(String recipientName, String message) {
        System.out.println(name + " отправляет лично " + recipientName + ": " + message);
        mediator.sendPrivate(message, this, recipientName);
    }

    /** Получить сообщение — вызывается посредником. */
    public void receive(String message, String from) {
        System.out.println("    " + name + " получил от " + from + ": " + message);
    }
}
