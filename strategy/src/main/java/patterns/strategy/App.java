package patterns.strategy;

import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

public class App {

    private SortStrategy<People> strategy;

    public App(SortStrategy<People> strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {

        List<People> items = Arrays.asList(
                People.of(2, "alice"),
                People.of(1, "bob"),
                People.of(4, "jack"),
                People.of(3, "tom"),
                People.of(5, "kerby")
        );

        SortStrategy<People> strategy = new BubbleSortStrategy();

        App app = new App(strategy);
        app.executeSort(items);

        app = new App(new DefaultJDKSortStrategy<>());
        app.executeSort(items);

    }

    public void executeSort(List<People> items) {
        strategy.sort(items);
        Assert.isTrue(items.get(0).id == 1, "sorting didn't work");
        Assert.isTrue(items.get(4).id == 5, "sorting didn't work");
    }


}
