package Objects.objectAsMmethodParameter;

public class Reformatory {

    private int counterMeasured;

    public Reformatory() {
        this.counterMeasured = 0;
    }

    public int weight(Person person) {
        this.counterMeasured++;
        return person.getWeight();
    }

    public void feed(Person person){
        int personWeight = person.getWeight();
        int newPersonWeight = personWeight + 1;
        person.setWeight(newPersonWeight);
    }

    public int totalWeightsMeasured(){
        return this.counterMeasured;
    }
}
