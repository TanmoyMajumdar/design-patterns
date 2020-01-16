package patterns.facade;

/**
 *
 * facade is a part of Gang of Four design pattern and it is categorized under structural design patterns. before we dig into the
 * details of it, let us discuss some examples which will be solved by this particular patterns.
 *
 * so, as the name suggests, it means the face of the building. the people walking past the road only see this glass face of the building.
 * they do not know anything about it, the wiring, the pipes and other complexities of the building and displays a friendly face.
 *
 * in java, the interface, JDBC can be called a facade because, we as users or clients create connection using the <code>java.sql.Connection</code>
 * interface, the implementation of which we are not concerned about. the implementation is left to the vendor of driver.
 *
 *
 * another good example can be the startup of a computer. when a computer starts up, it involves the work of cpu, memory, hard drive, etc.
 * to make it easy to use for users, we can add a facade which wrap the complexity of the task, and provide one simple interface instead.
 *
 * same goes for the facade pattern. it hides the complexities of the system and provides an interface to the client
 * from where the client can access the system.
 *
 *
 * now let's try and understand the facade pattern better using a simple example. let's consider a hotel. this hotel has a hotel keeper. there are
 * a lot of restaurants inside hotel e.g veg restaurants, non veg restaurants and veg/non both restaurants. you, as client want access to different
 * restaurants. you do not know what are the different menus they have. you have access to hotel keeper who knows his hotel well. whichever menu you want,
 * you tell the hotel keeper and he takes it out of from the respective restaurants and hands it over to you. here, the hotel keeper acts as the facade,
 * as he hides complexities of the system.
 *
 *
 *
 */


public class App {

    public static void main(String[] args) {
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
