package patterns.composite;

public class Letter extends LetterComposite {

    private char character;

    public Letter(char ch) {
        this.character = ch;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(character);
    }

}
