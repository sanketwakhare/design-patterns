package sorting;


import sorting.strategies.ISort;
import sorting.strategies.SortingType;

public class Context {

    SortingRegistry registry;

    Context(SortingRegistry registry) {
        this.registry = registry;
    }

    public void sort(int[] array, SortingType type) {
        ISort strategy = registry.get(type);
        strategy.sort(array);
    }
}
