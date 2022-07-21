package youtube;

public class User implements Subscriber {

    private final int id;

    User(int id) {
        this.id = id;
    }

    @Override
    public void listen(EventType eventType, String message, String subjectName) {
        System.out.println(this.id + ": " + message);
    }
}
