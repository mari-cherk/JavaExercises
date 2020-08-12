package Objects;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private Random random;
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.random = new Random();
        this.drawNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int i = 0;
        while (i < 7) {
            int newNumber = this.random.nextInt(39) + 1;
            // Write the number drawing here using the method containsNumber()
            if (!containsNumber(newNumber)) {
                this.numbers.add(newNumber);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
