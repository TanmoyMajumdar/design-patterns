package patterns.abstractfactory;

public class Carpenter implements DoorFittingExpert {

    @Override
    public String getDescription() {
        return "i can only fit wooden doors";
    }

}
