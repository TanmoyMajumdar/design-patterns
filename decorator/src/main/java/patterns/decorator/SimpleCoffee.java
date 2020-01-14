package patterns.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "simple coffee";
    }
}
