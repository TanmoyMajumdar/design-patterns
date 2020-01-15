package pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoulEatingEnchantment implements Enchantment {

    private static final Logger logger = LoggerFactory.getLogger(SoulEatingEnchantment.class);

    @Override
    public void onActivate() {
        logger.info("the item spreads blood lust.");
    }

    @Override
    public void apply() {
        logger.info("the item eats the soul of enemies.");
    }

    @Override
    public void onDeactivate() {
        logger.info("blood lust slowly disappears.");
    }
}
