package youtube;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Subscriber> subscribers;

    private final String name;

    public Subject(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public void notify(EventType eventType, String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.listen(eventType, message, this.name);
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void uploadVideo(String videoName) {
        notify(EventType.NEW_VIDEO_UPLOADED, "new video uploaded " + videoName);
    }

    public void sendText(String message) {
        notify(EventType.REPLY_RECEIVED_ON_COMMENTS, "new message received " + message);
    }

    public void uploadShorts(String message) {
        notify(EventType.NEW_SHORTS_UPLOADED, "short video uploaded " + message);
    }
}
