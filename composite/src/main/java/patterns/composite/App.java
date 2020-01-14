package patterns.composite;


/**
 *
 * the composite pattern composes objects into tree structures to represent part whole hierarchies.
 *
 * it lets client treat individual objects and compositions of object uniformly.
 *
 * anything like a tree structure is a potential candidate for composite pattern. and we do this for part whole hierarchies(
 * any object is a part of the whole and the whole is a collection of parts)
 *
 * so, everything that can be modeled as hierarchically is a potential candidate of composite pattern.
 *
 *
 *  composite let's clients treat individual objects and compositions of objects uniformly.
 *
 *  ex: on a tree anything on the leafs are single objects and others are composite objects
 *
 *    +++++++++++++
 *   |
 *   | component
 *   | operation()
 *   |
 *    +++++++++++++
 *
 *     /                      \
 *    /                        \
 *   /                          \
 *  /                            \
 *  +++++++++++++              +++++++++++++
 *    leaf(is a component)      composite  (has a component)
 *    operation()               operation()
 *  +++++++++++++              +++++++++++++
 *
 */


public class App {
}
