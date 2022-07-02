package groupchat;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {

    List<Group> groups;

    private int id;

    public User(int id) {
        this.id = id;
        groups = new ArrayList<>();
    }

    public void subscribe(Group group) {
        if (!groups.contains(group))
            groups.add(group);
        group.addUser(this);
    }

    public void unsubscribe(Group group) {
        group.removeUser(this);
        sendMessage(this.getId() + " left group", group);
    }

    public void listen(String message) {
        System.out.println("to " + this.id + " " + message);
    }

    public void sendMessage(String message, Group group) {
        if (group != null && groups.contains(group)) {
            group.notify("from " + this.id + ": " + message);
        }
    }
}
