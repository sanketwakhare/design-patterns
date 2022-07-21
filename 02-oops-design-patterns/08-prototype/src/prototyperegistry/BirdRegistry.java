package prototyperegistry;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {

    Map<String, Bird> registry = new HashMap<>();

    public void add(String name, Bird bird) {
        registry.put(name, bird);
    }

    public Bird get(String name) {
        return registry.get(name).clone();
    }
}
