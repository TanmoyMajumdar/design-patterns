package patterns.templatemethod;

/**
 * real world example
 *
 * suppose we are getting some house built. the steps for building might look like
 *
 * 1) prepare the base of house
 * 2) build the walls
 * 3) add roof
 * 4) add other floors
 *
 *
 * the order of these steps could never be changed i.e. you can't build the roof before building the walls etc
 * but each of the steps could be modified for example walls can be made of wood or polyester or stone
 *
 * in plain words
 *
 * template method defines the skeleton of how a certain algorithm could be performed, but defers the
 * implementation of those steps to the children classes
 *
 *
 * wikipedia says
 * in software engineering, the template method pattern is a behavioral design pattern that defined the
 * program skeleton of an algorithm in an operation, deferring some steps to subclasses. it lets one redefine
 * certain steps of an algorithm without changing the algorithm's structure
 *
 *
 */


public class App {

    public static void main(String[] args) {
        Builder androidBuilder = new AndroidBuilder();
        androidBuilder.build();


        Builder iosBuilder = new IosBuilder();
        iosBuilder.build();
    }


}
