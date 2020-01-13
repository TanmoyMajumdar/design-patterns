package patterns.factory.method.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommunityExecutive implements Interviewer {

    private static final Logger logger = LoggerFactory.getLogger(CommunityExecutive.class);

    @Override
    public void askQuestions() {
        logger.info("asking about community building");
    }

}
