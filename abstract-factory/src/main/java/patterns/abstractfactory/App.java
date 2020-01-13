package patterns.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    private Door door;

    private DoorFittingExpert expert;


    public void createAndFitDoor(final DoorFactory factory) {
        setDoor(factory.makeDoor());
        setFittingExpert(factory.makeFittingExpert());
    }

    public void setDoor(final Door door) {
        this.door = door;
    }

    public void setFittingExpert(DoorFittingExpert expert) {
        this.expert = expert;
    }

    public Door getDoor() {
        return door;
    }

    public DoorFittingExpert getExpert() {
        return expert;
    }

    /**
     * The factory of kingdom factories.
     */
    public static class FactoryMaker {

        /**
         * Enumeration for the dif  ferent types of Doors.
         */
        public enum DoorType {
            WOODEN, IRON
        }

        /**
         * The factory method to create DoorFactory concrete objects.
         */
        public static DoorFactory makeFactory(DoorType type) {
            switch (type) {
                case WOODEN:
                    return new WoodenDoorFactory();
                case IRON:
                    return new IronDoorFactory();
                default:
                    throw new IllegalArgumentException("doorType not supported.");
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.createAndFitDoor(FactoryMaker.makeFactory(FactoryMaker.DoorType.WOODEN));

        logger.info(app.getDoor().getDescription());
        logger.info(app.getExpert().getDescription());

        app.createAndFitDoor(FactoryMaker.makeFactory(FactoryMaker.DoorType.IRON));
        logger.info(app.getDoor().getDescription());
        logger.info(app.getExpert().getDescription());

    }
}
