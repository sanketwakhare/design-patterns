package groupchat;

public class Client {


    public static void main(String[] args) {

        // create group registry
        GroupRegistry groupRegistry = new GroupRegistry();
        groupRegistry.register(1, new Group(1));
        groupRegistry.register(2, new Group(2));

        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);

        Group group1 = groupRegistry.get(1);
        user1.subscribe(group1);
        user2.subscribe(group1);
        user3.subscribe(group1);

        user1.sendMessage("hi", group1);
        user2.sendMessage("hello", group1);
        user2.unsubscribe(group1);
        user1.sendMessage("ohh", group1);



    }


}
