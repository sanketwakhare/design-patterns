package twitter;

import java.util.ArrayList;
import java.util.List;

public class Subject extends User {

    List<User> users;

    public Subject(int id, String name) {
        super(id, name);
        this.users = new ArrayList<>();
    }

    public void addSubscriber(User user) {
        users.add(user);
    }

    public void removeSubscriber(User user) {
        users.remove(user);
    }

    public void notify(EventType eventType, String message) {
        for (User user : users) {
            user.listen(eventType, message, this);
        }
    }

    public void tweet(String message) {
        notify(EventType.NEW_TWEET, message);
    }

    public void comment(String message) {
        notify(EventType.COMMENTED, message);
    }

    public void like(String message) {
        notify(EventType.LIKED, message);
    }

    public void reply(String message) {
        notify(EventType.REPLIED, message);
    }
}
