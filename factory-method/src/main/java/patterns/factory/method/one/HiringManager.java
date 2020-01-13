package patterns.factory.method.one;

public abstract class HiringManager {

    abstract protected Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = makeInterviewer();
        interviewer.askQuestions();
    }

}
