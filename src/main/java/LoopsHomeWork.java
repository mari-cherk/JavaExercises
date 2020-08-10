import java.util.Scanner;

public class LoopsHomeWork {

    public static void main(String[] args) {

        //askThreeNumbersAndPrintSum();
        //sumOfManyNumbers();
        //fromOneToHundred();
        //fromHundredToOne();
        //evenNumbers();
        //upToCertainNumber();
        //lowerLimitAndUpperLimit();
        //sumOfSetOfNumbers();
        //sumBetweenTwoNumbers();
        //factorial();
        //sumOfPowers();
        //readingNumbers();
        //readingNumbersAndAddThem();
        //readingNumbersAndTellSumAndAverage();
        readNumbersAndTellSumAvgEvenOdd();
    }

    public static void askThreeNumbersAndPrintSum(){

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.print("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = read + sum;

        System.out.print("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = read + sum;

        System.out.print("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = read + sum;

        System.out.println("Sum: " + sum);
    }

    public static void sumOfManyNumbers() {

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            //System.out.print("Type the number: ");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum = sum + read;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }

    public static void fromOneToHundred(){
        int number = 1;
        while(number <= 100){
            System.out.println(number);
            number++;
        }
    }

    public static void fromHundredToOne(){
        int number = 100;
        while(number >= 1){
            System.out.println(number);
            number--;
        }
    }

    public static void evenNumbers(){
        int number = 2;
        while(number <= 100){
            System.out.println(number);
            number += 2;
        }
    }

    public static void upToCertainNumber(){
        int number = 1;
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int top = Integer.parseInt(reader.nextLine());

        while(number <= top){
            System.out.println(number);
            number++;
        }
    }

    public static void lowerLimitAndUpperLimit(){
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        while(first <= last){
            System.out.println(first);
            first++;
        }
    }

    public static void sumOfSetOfNumbers(){
        int sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int top = Integer.parseInt(reader.nextLine());

        int i = 0;
        while(i <= top){
            sum+=i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }

    public static void sumBetweenTwoNumbers() {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        int sum = 0;

        if (first < last) {
            while (first <= last) {
                sum+=first;
                first++;
            }
        } else if(first > last){
            while(last <= first){
                sum+=last;
                last++;
            }
        } else {
            System.out.println("The numbers are equal");
        }
        System.out.println("The sum " + sum);
    }

    public static void factorial(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int top = Integer.parseInt(reader.nextLine());

        int fact = 1;
        int i = 1;

            while (i <= top) {
                fact = i * fact;
                i++;
            }
            System.out.println("Factorial is " + fact);
        }

    public static void sumOfPowers(){
        int sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int top = Integer.parseInt(reader.nextLine());

        int i = 0;
        while(i <= top){
            sum += (int)Math.pow(2, i);
            i++;
        }
        System.out.println("The result is " + sum);
    }

    public static void readingNumbers(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers:");
        while(true){
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                System.out.println("Thank you and see you later!");
            }
        }
    }

    public static void readingNumbersAndAddThem(){
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        System.out.println("Type numbers:");

        while(true){
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                System.out.println("Thank you and see you later!");
                break;
            } else {
                sum = sum + number;
                i++;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + i);
    }

    public static void readingNumbersAndTellSumAndAverage(){
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        double avg = 0;
        System.out.println("Type numbers:");

        while(true){
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                System.out.println("Thank you and see you later!");
                break;
            } else {
                sum = sum + number;
                i++;
                avg = (double)sum/i;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + i);
        System.out.println("Average: " + avg);
    }

    public static void readNumbersAndTellSumAvgEvenOdd(){
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Type numbers:");

        while(true){
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                System.out.println("Thank you and see you later!");
                break;
            } else {
                sum = sum + number;
                i++;
                avg = (double)sum/i;
                if(number % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + i);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
