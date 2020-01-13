package patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;

public class DefaultJDKSortStrategy<T extends Comparable<T>> implements SortStrategy<T> {

    private static Logger logger = LoggerFactory.getLogger(DefaultJDKSortStrategy.class);

    @Override
    public List<T> sort(List<T> items) {
        logger.info("sorting using quick sort algorithm");
         items.sort(Comparator.naturalOrder());
         return items;
    }
}
