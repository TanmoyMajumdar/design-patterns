package patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenTunnelDigger extends DwarvenMineWorker {

    private static final Logger logger = LoggerFactory.getLogger(DwarvenTunnelDigger.class);

    @Override
    public void work() {
        logger.info("{} creates another promising tunnel.", name());
    }

    @Override
    public String name() {
        return "dwarven tunnel digger";
    }
}