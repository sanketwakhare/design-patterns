package sorting;

import sorting.strategies.ISort;
import sorting.strategies.SortingType;

import java.util.HashMap;
import java.util.Map;

public class SortingRegistry {

    Map<SortingType, ISort> registry = new HashMap<>();

    public void register(SortingType type, ISort sortingStrategy) {
        registry.put(type, sortingStrategy);
    }

    public ISort get(SortingType type) {
        return registry.get(type);
    }

}
