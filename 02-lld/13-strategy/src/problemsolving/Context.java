package problemsolving;

import problemsolving.strategies.ApproachType;
import problemsolving.strategies.IApproach;

public class Context {

    ApproachRegistry registry;

    Context(ApproachRegistry registry) {
        this.registry = registry;
    }

    public int solve(int[] array, ApproachType type) {
        IApproach strategy = registry.get(type);
        return strategy.solve(array);
    }
}
