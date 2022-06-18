package prototype.v1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pigeon whitePigeon = new Pigeon();
        whitePigeon.setName("whitePigeon");
        whitePigeon.setColor("white");

        Pigeon bluePigeon = new Pigeon();
        bluePigeon.setName("bluePigeon");
        bluePigeon.setColor("blue");

        Sparrow sweetSparrow = new Sparrow();
        sweetSparrow.setName("sweetSparrow");
        sweetSparrow.setSound("sweet");

        List<Bird> birds = List.of(whitePigeon, sweetSparrow, bluePigeon);
        List<Bird> children = new ArrayList<>();

        for (Bird parent : birds) {
            children.add(parent.clone());
        }

        System.out.println("stop");

    }
}
