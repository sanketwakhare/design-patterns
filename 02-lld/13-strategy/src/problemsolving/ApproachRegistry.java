package problemsolving;

import problemsolving.strategies.ApproachType;
import problemsolving.strategies.IApproach;

import java.util.HashMap;
import java.util.Map;

public class ApproachRegistry {

    Map<ApproachType, IApproach> registry = new HashMap<>();

    public void register(ApproachType type, IApproach approach) {
        registry.put(type, approach);
    }

    public IApproach get(ApproachType type) {
        return registry.get(type);
    }
}
