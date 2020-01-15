package pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sword implements Weapon {

    private static final Logger logger = LoggerFactory.getLogger(Sword.class);

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        logger.info("the sword is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        logger.info("the sword is swinged.");
        enchantment.apply();
    }

    @Override
    public void unWield() {
        logger.info("the sword is un wielded.");
        enchantment.onActivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
