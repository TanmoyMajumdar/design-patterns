package patterns.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AndroidBuilder extends Builder {

    private static final Logger logger = LoggerFactory.getLogger(AndroidBuilder.class);

    @Override
    public void test() {
        logger.info("running android test");
    }

    @Override
    public void lint() {
        logger.info("linting the android code");
    }

    @Override
    public void assemble() {
        logger.info("assembling the android build");
    }

    @Override
    public void deploy() {
        logger.info("deploying android build to server");
    }
}
