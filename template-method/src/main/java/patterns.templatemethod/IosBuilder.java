package patterns.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IosBuilder extends Builder {

    private static final Logger logger = LoggerFactory.getLogger(IosBuilder.class);

    @Override
    public void test() {
        logger.info("running ios tests");
    }

    @Override
    public void lint() {
        logger.info("linting the ios code");
    }

    @Override
    public void assemble() {
        logger.info("assembling the ios build");
    }

    @Override
    public void deploy() {
        logger.info("deploying ios build to server");
    }
}
