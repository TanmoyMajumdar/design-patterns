package pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hammer implements Weapon {

    private static final Logger logger = LoggerFactory.getLogger(Hammer.class);

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        logger.info("the hammer is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        logger.info("the hammer is swinged.");
        enchantment.apply();
    }

    @Override
    public void unWield() {
        logger.info("the hammer is un wielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
