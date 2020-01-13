package patterns.factory.method.one;

public class DevelopmentManager extends HiringManager {

    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }

}
