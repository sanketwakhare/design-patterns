package prototyperegistry;

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

        // add birds into registry
        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.add("whitePigeon", whitePigeon);
        birdRegistry.add("bluePigeon", bluePigeon);
        birdRegistry.add("sweetSparrow", sweetSparrow);

        List<String> birdTypes = List.of("whitePigeon", "sweetSparrow", "bluePigeon");
        List<Bird> requiredBirds = new ArrayList<>();
        for (String birdType : birdTypes) {
            requiredBirds.add(birdRegistry.get(birdType));
        }

        System.out.println("stop");

    }
}
