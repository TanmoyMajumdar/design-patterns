package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Deque;
import java.util.LinkedList;

/**
 * invoker
 */

public class Wizard {

    private static final Logger logger = LoggerFactory.getLogger(Wizard.class);

    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public Wizard() {

    }

    public void castSpell(Command command, Target target) {
        logger.info("{} casts {} at {}", this, command, target);
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Command previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            logger.info("{} undoes {}", this, previousSpell);
            previousSpell.undo();
        }
     }


     public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Command previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            logger.info("{} redoes {}", this, previousSpell);
            previousSpell.redo();
        }
     }

     @Override
    public String toString() {
        return "wizard";
     }
}
