package patterns.factory.method.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * a normal factory produces goods, a software factory produces objects. it does so
 * without specifying the exact class of the object to be created. to accomplish this,
 * objects are created by calling a factory method instead of calling a constructor.
 *
 * usually, object creation in java takes place like so:
 *
 * SomeClass someClassObject = new SomeClass();
 *
 * the problem with the above approach is that the code using the SomeClass's object,
 * suddenly now becomes dependent on the concrete implementation of SomeClass. There's
 * nothing wrong with using new keyword to create objects but it comes with baggage of
 * tightly coupling our code to the concrete implementation class, which can occasionally
 * be problematic.
 *
 */


public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    private final HiringManager manager;

    public App(HiringManager manager) {
        this.manager = manager;
    }

    public static void main(String[] args) {
        App app = new App(new DevelopmentManager());
        app.executeInterview();

        app = new App(new MarketingManager());
        app.executeInterview();

    }

    public void executeInterview() {
        manager.takeInterview();
    }

}
