package patterns.abstractfactory;

public class Welder implements DoorFittingExpert {

    @Override
    public String getDescription() {
        return "i can only fit iron doors";
    }

}
