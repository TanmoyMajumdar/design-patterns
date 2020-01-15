package pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * taken from <a href=https://refactoring.guru/design-patterns/bridge></a>
 * problem
 *
 * say you have a geometric <code>Shape</code> class with a pair of subclasses: <code>Circle</code>
 * and <code>Square</code>. You want to extend this class hierarchy to incorporate colors, so you
 * plan to create <code>Red</code> and <code>Blue</code> shape subclasses. However, since you already
 * have two subclasses, you'll need to create four class combinations such as <code>BlueCircle</code>
 * and <code>RedSquare</code>.
 *
 * adding new shape types and colors to the hierarchy will grow it exponentially. For example, to
 * add a triangle shape you'd need to introduce two subclasses, one for each color. And after that,
 * adding a new color would require creating three subclasses, one for each shape type. The further we go, the worse it becomes.
 *
 *
 * solution
 *
 * this problem occurs because we're trying to extend the shape classes in two independent dimensions: by form and by color.
 * that's a very common issue with class inheritance.
 * the bridge pattern attempts to solve this problem by switching from inheritance to object composition. what this means is
 * that you extract one of the dimensions into a separate class hierarchy, so that the original classes will reference an object
 * of the new hierarchy, instead of having all of its state and behaviors within one class.
 *
 *
 * following this approach, we cam extract the color related code into its own class with two subclasses: <code>Red</code>
 * and <code>Blue</code>. the <code>Shape</code> class then gets a reference field pointing to one of the color objects. now
 * the shape can delegate any color related work to the linked color object. that reference will act as a bridge between the
 * <code>Shape</code> and <code>Color</code> classes. from now on, adding new colors won't require changing the shape hierarchy, and
 * vice versa.
 *
 *
 */

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("the knight receives an enchantment sword.");
        Weapon sword = new Sword(new SoulEatingEnchantment());
        sword.wield();
        sword.swing();
        sword.unWield();

        logger.info("the valkyrie receives an enchantment hammer.");
        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unWield();
    }

}
