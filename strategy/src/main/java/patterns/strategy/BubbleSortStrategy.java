package patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BubbleSortStrategy<T extends Comparable<T>> implements SortStrategy<T> {

    private static Logger logger = LoggerFactory.getLogger(BubbleSortStrategy.class);

    @Override
    public List<T> sort(List<T> items) {
        logger.info("sorting using bubble sort algorithm");
        int length = items.size();
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (items.get(j).compareTo(items.get(j + 1)) > 0){
                    T temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                }
        return items;
    }

}
