package Objects;

public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;
    private int evenSum;
    private int oddSum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
        this.evenSum = 0;
        this.oddSum = 0;
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum += number;
        if((number % 2) == 0){
            this.evenSum += number;
        }else {
            this.oddSum += number;
        }
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public int even() {
        return this.evenSum;
    }

    public int odd() {
        return this.oddSum;
    }

    public double average() {
        if(this.amountOfNumbers > 0){
            return (double)this.sum / this.amountOfNumbers;
        } else return 0;
    }
}
