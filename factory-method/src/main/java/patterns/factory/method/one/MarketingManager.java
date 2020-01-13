package patterns.factory.method.one;

public class MarketingManager extends HiringManager {

    @Override
    protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }

}
