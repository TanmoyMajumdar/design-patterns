package patterns.adapter;

/**
 *
 * consider that you have some pictures in your memory card and you need to transfer them to your computer.
 * in order to transfer them you need some kind adapter that is compatible with your computer ports so that you
 * can attach memory card to your computer. in this case card reader is an adapter. another example would be the
 * famous power adapter; a three legged plug can't be connected to a two pronged outlet, it needs to use a power adapter that
 * makes it compatible with the two pronged outlet. yet another example would be a translator translating words spoken
 * by one person to another.
 *
 * in plain words
 * adapter pattern lets you wrap an otherwise incompatible object in an adapter to make it compatible with another class.
 *
 * wikipedia says
 * in software engineering, the adapter pattern is a software design pattern that allows the interface of an existing class
 * to be used as another interface. it is often used to make existing classes work with others without modifying their source code.
 *
 *
 *
 */


public class App {

    public static void main(String[] args) {
        WildDog wildDog = new WildDog();
        WildDogAdapter wildDogAdapter = new WildDogAdapter(wildDog);

        Hunter hunter = new Hunter();
        hunter.hunt(wildDogAdapter);
    }

}
