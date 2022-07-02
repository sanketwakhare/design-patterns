package problemsolving;

import problemsolving.strategies.ApproachType;
import problemsolving.strategies.BruteForce;
import problemsolving.strategies.PrefixAndSuffixMaxApproach;
import problemsolving.strategies.TwoPointersApproach;

public class Main {

    public static void main(String[] args) {
        // create registry
        ApproachRegistry registry = new ApproachRegistry();
        registry.register(ApproachType.BRUTE_FORCE, new BruteForce());
        registry.register(ApproachType.PREFIX_SUFFIX_MAX, new PrefixAndSuffixMaxApproach());
        registry.register(ApproachType.TWO_POINTERS, new TwoPointersApproach());

        Context context = new Context(registry);

        // solve with brute force
        int[] array = {4, 2, 3, 5, 6};
        context.solve(array, ApproachType.BRUTE_FORCE);
        context.solve(array, ApproachType.PREFIX_SUFFIX_MAX);
        context.solve(array, ApproachType.TWO_POINTERS);
    }
}
