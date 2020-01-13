package patterns.strategy;

public class People implements Comparable<People> {

    public int id;

    public String name;

    private People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(People other) {
        return this.id - other.id;
    }

    public static People of(int id, String name) {
        return new People(id, name);
    }
}