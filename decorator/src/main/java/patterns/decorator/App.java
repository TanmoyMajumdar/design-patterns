package patterns.decorator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * you have an object and instead of sending messages to the object(by method calling) and getting a object as a
 * response. decorator pattern is a way of saying that if i want to change the way the thing that returns or
 * if i want to change the behavior of the method i could actually do that at runtime without changing the content
 * of the particular object.
 *
 *
 * decorator has a component and is a component
 *
 * decorator pattern attaches additional responsibilities dynamically to an object. decorator provides a flexible alternative
 * to subclassing for extending functionalities.
 *
 *
 * real world example
 *
 * imagine you ran a car service shop offering multiple services. now how do you calculate the bill to be charged ?
 * you pick one service and dynamically keep adding to it the prices for the provided services till you get the final cost.
 * here each type of service is a decorator.
 *
 * in plain words
 *
 * decorator pattern lets you dynamically change the behavior of an object at run time by wrapping them in an object of a decorator
 * class
 *
 * wikipedia says
 *
 * in object oriented programming, the decorator pattern is a design pattern that allows behavior to be added to an
 * individual object, either statically or dynamically, without affecting the behavior of other objects from the same class.
 * the decorator pattern is often useful for adhering to the single responsibility principle, as it allows functionality to be
 * divided between classes with unique concern.
 *
 */

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {

        Coffee simpleCoffee = new SimpleCoffee();
        logger.info("simple coffee cost {}", simpleCoffee.getCost());
        logger.info("simple coffee description {}", simpleCoffee.getDescription());

        Coffee milkCoffee = new MilkCoffee(simpleCoffee);
        logger.info("milk coffee cost {}", milkCoffee.getCost());
        logger.info("milk coffee description {}", milkCoffee.getDescription());

        Coffee whipCoffee = new WhipCoffee(milkCoffee);
        logger.info("whip coffee cost {}", whipCoffee.getCost());
        logger.info("whip coffee description {}", whipCoffee.getDescription());

        Coffee vanillaCoffee = new VanillaCoffee(whipCoffee);
        logger.info("vanilla coffee cost {}", vanillaCoffee.getCost());
        logger.info("vanilla coffee description {}", vanillaCoffee.getDescription());
    }



}
