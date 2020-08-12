package Objects;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if(value < upperLimit){
            value++;
        } else  value = 0;
    }

    public String toString() {
        return String.format("%02d", value) + "";
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }
}
