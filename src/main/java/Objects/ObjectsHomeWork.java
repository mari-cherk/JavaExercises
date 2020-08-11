package Objects;

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

        LyyraCard cardPekka = new LyyraCard(20);
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
        System.out.println("Brian: " + cardBrian);
    }
}
