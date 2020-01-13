package patterns.strategy;

import java.util.List;

public interface SortStrategy<T extends Comparable<T>> {

    List<T> sort(List<T> items);

}
