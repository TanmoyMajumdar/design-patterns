package design.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecuredDoor {

    private static final Logger logger = LoggerFactory.getLogger(SecuredDoor.class);

    private Door door;

    public SecuredDoor(Door door) {
        this.door = door;
    }

    public void open(String password) {
        if (authenticate(password)) {
            door.open();
        } else {
            logger.info("big no! it ain't possible");
        }
    }

    private boolean authenticate(String password) {
        return password.equals("$ecr@t");
    }

    public void close(){
        door.close();
    }
}
