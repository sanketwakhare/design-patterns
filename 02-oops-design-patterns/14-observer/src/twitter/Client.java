package twitter;

public class Client {
    public static void main(String[] args) {
        Subject elonMusk = new Subject(1, "Elon Musk");
        Subject billGates = new Subject(1, "Bill Gates");

        User user1 = new User(1, "User1");
        User user2 = new User(1, "User2");

        user1.subscribe(elonMusk);
        user2.subscribe(elonMusk);

        elonMusk.tweet("I am here");
        elonMusk.like("tweet#1");

        user1.unsubscribe(elonMusk);

        elonMusk.reply("tweet#2 lol");
        elonMusk.comment("tweet#3 nice");

        user1.subscribe(billGates);
        billGates.tweet("Microsoft is great!");
    }
}
