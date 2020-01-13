package patterns.strategy;

import java.util.List;

public class Sorter<T extends Comparable<T>> {

    private SortStrategy<T> strategy;

    public Sorter(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public List<T> sort(List<T> items) {
        return strategy.sort(items);
    }
}
