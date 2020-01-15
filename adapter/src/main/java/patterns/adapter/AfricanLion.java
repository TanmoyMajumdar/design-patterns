package patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfricanLion implements Lion {

    private static Logger logger = LoggerFactory.getLogger(AfricanLion.class);

    @Override
    public void roar() {
        logger.info("african lion is roaring");
    }
}
