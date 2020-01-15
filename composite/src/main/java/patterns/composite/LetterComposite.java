package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {

    private List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite composite) {
        children.add(composite);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {

    }

    protected void printThisAfter() {

    }

    public void print() {
        printThisBefore();
        children.forEach(LetterComposite::print);
        printThisAfter();
    }

}
