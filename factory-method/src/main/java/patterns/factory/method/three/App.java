package patterns.factory.method.three;


/**
 *
 * concrete creator creates some kind of concrete products but in order for us to be able to use polymorphism
 * we need to be able to treat all of the different concrete creators the same way which is why we need to
 * make all of the different concrete creators be creators type and since they all need to create things that might
 * be different in type(they might be able to create dogs or cats or whatever) these things need to share some
 * kind of common interface, some kind of common contract(may be a parent class) and that's why the concrete
 * products(we might have many of them) or product implementing the interface product
 *
 * when to use:
 * useful when there is some generic processing in a class but the required sub class is dynamically decided at runtime.
 * Or, putting it in other words, when the client doesn't know what exact sub class it might need.
 */

public class App {
}
