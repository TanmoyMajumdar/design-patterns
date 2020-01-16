package patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public abstract class DwarvenMineWorker {

    private static final Logger logger = LoggerFactory.getLogger(DwarvenMineWorker.class);

    public void gotoSleep() {
        logger.info("{} goes to sleep.", name());
    }

    public void wakeUp() {
        logger.info("{} wakes up.", name());
    }


    public void goHome() {
        logger.info("{} goes home.", name());
    }

    public void goToMine() {
        logger.info("{} goes to the mine.", name());
    }

    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                gotoSleep();
                break;

            case WAKE_UP:
                wakeUp();
                break;

            case GO_HOME:
                goHome();
                break;

            case GO_TO_MINE:
                goToMine();
                break;

            case WORK:
                work();
                break;

            default:
                logger.info("undefined action");
                break;

        }
    }


    public void action(Action... actions) {
        Arrays.stream(actions).forEach(this::action);
    }

    public abstract void work();

    public abstract String name();

    enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }

}
