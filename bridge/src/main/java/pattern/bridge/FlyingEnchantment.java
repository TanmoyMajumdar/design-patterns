package pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyingEnchantment implements Enchantment {

    private static final Logger logger = LoggerFactory.getLogger(FlyingEnchantment.class);

    @Override
    public void onActivate() {
        logger.info("the item begins to glow faintly");
    }

    @Override
    public void apply() {
        logger.info("the item flies and strikes the enemies finally returning to owner's hand.");
    }

    @Override
    public void onDeactivate() {
        logger.info("the item's low fades.");
    }
}
