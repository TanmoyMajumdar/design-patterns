package design.proxy;

/**
 *
 *  real world example
 *  have you ever used an access card to go through a door? there are multiple options to open the door i.e: it can be
 *  opened either using access card or by pressing a button that bypass the security. the door's main functionality
 *  is to open but there is a proxy added on top of it to add some functionality.
 *
 *  in plain words
 *  using the proxy pattern, a class represents the functionality of another class
 *
 *  wikipedia says
 *  a proxy, in its most general form, is a class functioning as an interface to something else. a proxy is a wrapper
 *  or agent object that is being called by the client to access the real serving object behind the scenes. use of
 *  the proxy can simply be forwarding to the real object, or can provide additional logic. in the proxy extra
 *  functionality can be provided, for example caching when operations on the real object are resource intensive, or
 *  checking preconditions before operations on the real object are invoked.
 *
 *
 *
 */

public class App {

    public static void main(String[] args) {
        SecuredDoor door = new SecuredDoor(new LabDoor());
        door.open("invalid");

        door.open("$ecr@t");
        door.close();
    }
}
