package youtube;

public class Main {

    public static void main(String[] args) {

        Subject musicChannel = new Subject("Music channel");

        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);

        musicChannel.addSubscriber(user1);
        musicChannel.addSubscriber(user2);
        musicChannel.addSubscriber(user3);
        musicChannel.addSubscriber(user4);

        musicChannel.uploadVideo("array 1");
        musicChannel.removeSubscriber(user1);
        musicChannel.removeSubscriber(user2);
        musicChannel.sendText("thank you for subscription");
        musicChannel.uploadShorts("watch new short video");
        System.out.println("end");

    }
}
