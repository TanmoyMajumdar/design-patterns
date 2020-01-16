package patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenCartOperator extends DwarvenMineWorker {

    private static final Logger logger = LoggerFactory.getLogger(DwarvenCartOperator.class);

    @Override
    public void work() {
        logger.info("{} moves gold chunks out of the mine.", name());
    }

    @Override
    public String name() {
        return "dwarf cart operator";
    }
}
