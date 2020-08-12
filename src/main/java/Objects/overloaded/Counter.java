package Objects.overloaded;

public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue){
        this.startingValue = startingValue;
        this.check = false;
    }

    public Counter(boolean check){
        this.startingValue = 0;
        this.check = check;
    }

    public Counter(){
        this.startingValue = 0;
        this.check = false;
    }

    public int value(){
        return this.startingValue;
    }

    public void increase(){
        this.startingValue++;
    }

    public void decrease(){
        if(this.check){
            if(this.startingValue > 0){
                this.startingValue--;
            }
        } else {
            this.startingValue--;
        }
    }

    public void increase(int increaseAmount){
        this.startingValue += increaseAmount;
    }

    public void decrease(int decreaseAmount){
        if(decreaseAmount >= 0){
            if(this.check){
                if(this.startingValue > 0){
                    this.startingValue-=decreaseAmount;
                }
            } else {
                this.startingValue-=decreaseAmount;
            }
        }
    }
}
