package patterns.factory.method.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Developer implements Interviewer {

    private static final Logger logger = LoggerFactory.getLogger(Developer.class);

    @Override
    public void askQuestions() {
        logger.info("asking about design patterns");
    }

}
