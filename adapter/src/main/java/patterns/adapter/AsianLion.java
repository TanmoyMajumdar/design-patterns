package patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsianLion implements Lion {

    private static Logger logger = LoggerFactory.getLogger(AsianLion.class);

    @Override
    public void roar() {
        logger.info("asian lion is roaring");
    }
}
