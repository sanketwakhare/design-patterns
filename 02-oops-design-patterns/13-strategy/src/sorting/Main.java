package sorting;

import sorting.strategies.BubbleSort;
import sorting.strategies.MergeSort;
import sorting.strategies.QuickSort;
import sorting.strategies.SortingType;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // create registry
        SortingRegistry registry = new SortingRegistry();
        registry.register(SortingType.BUBBLE, new BubbleSort());
        registry.register(SortingType.MERGE, new MergeSort());
        registry.register(SortingType.QUICK, new QuickSort());

        // sort array based on some strategy
        int[] array = {12, 13, 14, 5, 6,};
        Context context = new Context(registry);

        context.sort(array, SortingType.BUBBLE);
        context.sort(array, SortingType.MERGE);
    }
}
