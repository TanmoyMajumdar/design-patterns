package patterns.builder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * the intention of the Builder pattern is to find a solution to the telescoping constructor anti pattern.
 * the telescoping constructor anti pattern occurs when the increase of object constructor parameter combination leads to
 * an exponential list of constructors. instead of using numerous constructors, the builder pattern uses another object, a builder, that
 * receives each initialization parameter step by step and then returns the resulting constructed object at once.
 *
 */


public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {

        Hero mage = new Hero.Builder(Profession.MAGE, "Riobard")
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.DAGGER)
                .build();
        logger.info(mage.toString());


        Hero warrior = new Hero.Builder(Profession.WARRIOR, "Amberjill")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY)
                .withArmor(Armor.CHAIN_MAIL)
                .withWeapon(Weapon.SWORD)
                .build();
        logger.info(warrior.toString());

        Hero thief = new Hero.Builder(Profession.THIEF, "Desmond")
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.BOW)
                .build();
        logger.info(thief.toString());





    }


}
