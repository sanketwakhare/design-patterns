package youtube;

public interface Subscriber {

    void listen(EventType eventType, String message, String subjectName);
}
