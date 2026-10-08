package mediator;

import java.util.ArrayList;
import java.util.List;

/** Практика №7, вариант №4. Конкретный посредник — чат. */
public class ChatMediator implements Mediator {

    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println("[чат] " + user.getName() + " присоединился");
    }

    /** Рассылка всем, кроме самого отправителя. */
    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message, sender.getName());
            }
        }
    }

    @Override
    public void sendPrivate(String message, User sender, String recipientName) {
        for (User user : users) {
            if (user.getName().equals(recipientName)) {
                user.receive(message, sender.getName() + " (лично)");
                return;
            }
        }
        System.out.println("[чат] пользователь " + recipientName + " не найден");
    }

    public int getUserCount() {
        return users.size();
    }
}
