package twitter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void listen(EventType eventType, String message, Subject subject) {
        if (eventType == EventType.NEW_TWEET) {
            System.out.println(this.getName() + "->" + subject.getName() + " tweeted " + message);
        } else if (eventType == EventType.COMMENTED) {
            System.out.println(this.getName() + "->" + subject.getName() + " commented on " + message);
        } else if (eventType == EventType.LIKED) {
            System.out.println(this.getName() + "->" + subject.getName() + " liked " + message);
        } else if (eventType == EventType.REPLIED) {
            System.out.println(this.getName() + "->" + subject.getName() + " replied to " + message);
        }
    }

    public void subscribe(Subject subject) {
        subject.addSubscriber(this);
    }

    public void unsubscribe(Subject subject) {
        subject.removeSubscriber(this);
    }
}
