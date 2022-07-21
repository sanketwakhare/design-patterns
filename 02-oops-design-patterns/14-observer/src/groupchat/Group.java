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

    public void notify(String message) {
        for (User user : users) {
            user.listen(message);
        }
    }
}
