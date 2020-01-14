package patterns.decorator;

public class MilkCoffee implements Coffee {

    private Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return this.coffee.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " , milk";
    }
}
