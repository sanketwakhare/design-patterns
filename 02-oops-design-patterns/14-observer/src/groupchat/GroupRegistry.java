package groupchat;

import java.util.HashMap;
import java.util.Map;

public class GroupRegistry {

    Map<Integer, Group> registry = new HashMap<>();

    public void register(int id, Group group) {
        registry.put(id, group);
    }

    public Group get(int id) {
        return registry.get(id);
    }
}
