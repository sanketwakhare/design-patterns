package groupchat;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Group {

    List<User> users;

    private int id;

    Group(int id) {
        this.id = id;
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notify(String message, User producer) {
        for (User user : users) {
            if (user != producer) {
                user.listen("from(" + producer.getId() + ") -> " + message);
            }
        }
    }
}
