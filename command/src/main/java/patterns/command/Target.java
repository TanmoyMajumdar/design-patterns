package patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Target {

    private static final Logger logger = LoggerFactory.getLogger(Target.class);

    private Size size;

    private Visibility visibility;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public abstract String toString();

    public void printStatus() {
        logger.info("{} [size = {}] [visibility = {}]", this, getSize(), getVisibility());
    }
}
