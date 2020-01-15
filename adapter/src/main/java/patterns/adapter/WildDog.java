package patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WildDog {

    private static Logger logger = LoggerFactory.getLogger(WildDog.class);

    void bark() {
        logger.info("wild dog is barking");
    }

}
