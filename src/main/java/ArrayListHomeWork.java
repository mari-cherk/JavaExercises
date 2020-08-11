import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListHomeWork {

    public static void main(String[] args) {

        //listOfWords();
        //recurringWOrd();
        //reverseOrder();
        //alphabeticalOrder();

        /*ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));
        System.out.println(list);
        removeLast(list);
        System.out.println(list);*/

        /*ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The sum: " + sum(list));

        list.add(10);

        System.out.println("the sum: " + sum(list));*/

        /*ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));*/

        /*ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);*/

        /*ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));*/

        /*Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }*/

        /*Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
*/

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);

        list2.add(4);
        list2.add(3);
        list2.add(4);

        smartCombine(list1, list2);

        System.out.println(list1);

        System.out.println(list2);
    }

    public static void listOfWords(){
        ArrayList<String> words = new ArrayList<String>();

        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.print("Type a word: ");
            String name = reader.nextLine();
            if(name.equals("")){
                break;
            } else {
                words.add(name);
            }
        }
        words.forEach(System.out::println);
    }

    public static void recurringWOrd() {
        ArrayList<String> words = new ArrayList<String>();

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type a word: ");
            String name = reader.nextLine();
            if (words.contains(name)) {
                System.out.println("You gave the word celery twice");
                break;
            } else {
                words.add(name);
            }
        }
    }

    public static void reverseOrder(){
        ArrayList<String> words = new ArrayList<String>();

        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.print("Type a word: ");
            String name = reader.nextLine();
            if(name.equals("")){
                break;
            } else {
                words.add(name);
            }
        }
        Collections.reverse(words);
        words.forEach(System.out::println);
    }

    public static void alphabeticalOrder(){
        ArrayList<String> words = new ArrayList<String>();

        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.print("Type a word: ");
            String name = reader.nextLine();
            if(name.equals("")){
                break;
            } else {
                words.add(name);
            }
        }
        Collections.sort(words);
        words.forEach(System.out::println);
    }

    public static int countItems(ArrayList<String> list){
        return list.size();
    }

    public static void removeLast(ArrayList<String> list){
        list.remove(list.size()-1);
    }

    public static int sum(ArrayList<Integer> list) {
        return list.stream().reduce(0, ( Integer a, Integer b) -> a + b);
    }

    public static double average(ArrayList<Integer> list) {
        double avg = sum(list)/(double)list.size();
        return avg;
    }

    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> intList = new ArrayList<Integer>();

        /*for(String i : list){
            intList.add(i.length());
        }*/

        list.forEach(x -> intList.add(x.length()));
        return intList;
    }

    public static int greatest(ArrayList<Integer> list) {
        return list.stream().reduce(0, ( Integer a, Integer b) -> Math.max(a, b));
    }

    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int count = 0;
        for(int i : list){
            if(i == number){
                count++;
            }
        }
        if(count > 1){
            return true;
        } else return false;
    }

    public static boolean palindrome(String text) {
        int i = text.length()- 1;
        String help = "";

        while (i >= 0){
            help = help + text.charAt(i);
            i--;
        }
        return text.equals(help);
    }

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second){
        first.addAll(second);
    }

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
        for(Integer x : second){
            if(!first.contains(x)){
                first.add(x);
            }
        }
    }
}
