package Objects;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsHomeWork {

    public static void main(String[] args) {
        /*Product banana = new Product("banana", 1.1, 13);
        banana.printProduct();

        Multiplier multiplier = new Multiplier(4);
        System.out.println("threeMultiplier.multiply(2): " + multiplier.multiply(2));*/


        /*DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();*/

        /*Menu menu = new Menu();

        menu.addMeal("Hamburger");
        menu.addMeal("Fish'n'Chips");
        menu.addMeal("Sauerkraut");

        menu.printMeals();

        menu.clearMenu();

        menu.printMeals();*/

        /*LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);*/

        /*BoundedCounter counter = new BoundedCounter(14);
        System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 16){
            counter.next();
            System.out.println("value: " + counter );
            i++;
        }*/

        /*BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            // advance minutes
            minutes.next();
            // if minutes become zero, advance hours
            if(minutes.getValue() == 0){
                hours.next();
            }
            i++;
        }*/

        /*Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            seconds.next();
            if(seconds.getValue() == 0){
                minutes.next();
            }
            // if minutes become zero, advance hours
            if(minutes.getValue() == 0){
                hours.next();
            }
            i++;
        }*/

        /*NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());*/

        /*NumberStatistics stats = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        while(true){
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                break;
            } else {
                stats.addNumber(number);
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + stats.even());
        System.out.println("sum of odd: " + stats.odd());*/

        /*Dice dice = new Dice(6);

        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }*/

        /*PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());*/

        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }


}
