package patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenGoldDigger extends DwarvenMineWorker {

    private static final Logger logger = LoggerFactory.getLogger(DwarvenGoldDigger.class);

    @Override
    public void work() {
        logger.info("{} digs for gold.", name());
    }

    @Override
    public String name() {
        return "dwarf gold digger";
    }
}
