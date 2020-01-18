package design.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LabDoor implements Door {

    private static final Logger logger = LoggerFactory.getLogger(LabDoor.class);

    @Override
    public void open() {
        logger.info("opening lab door");
    }

    @Override
    public void close() {
        logger.info("closing the lab door");
    }
}
