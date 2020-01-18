package patterns.command;

/**
 *
 * encapsulate a request as an object, thereby letting you parametrize clients with different requests, queue or log requests,
 * and support undoable operations.
 *
 * promote "invocation of a method on an object" to full object status.
 *
 * the command pattern is a behavioral design pattern in which an object is used to encapsulate all information
 * needed to perform an action or trigger an event at a later time. this information includes the method name, the object
 * that owns the method and values for the method parameters.
 *
 * four terms always associated with the command pattern are command, receiver, invoker and client. a command object
 * knows about the receiver and invokes a method of the receiver. values for parameters of the receiver method are stored
 * in the command. the receiver then does the work. an invoker object knows how to execute a command, and optionally does
 * bookkeeping about the command execution. the invoker does not know anything about a concrete command, it knows about
 * command interface. both an invoker object and several command objects are held by a client object. the client decides which
 * commands to execute at which points. to execute a command, it passes the command object to the invoker object.
 *
 * in this example the wizard casts spells on goblin. the wizard keeps track of previous spells cast, so it is easy to
 * undo them. in addition, the wizard keeps track of the spells undone, so they can be redone.
 *
 *
 *
 */


public class App {

    /**
     * client code
     * @param args
     */

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Target goblin = new Goblin();

        goblin.printStatus();

        wizard.castSpell(new ShrinkSpell(), goblin);
        goblin.printStatus();

        wizard.castSpell(new InvisibilitySpell(), goblin);
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();


    }


}
