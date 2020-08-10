import java.util.Scanner;

public class StringsHomeWork {

    public static void main(String[] args) {
        //System.out.println(calculateCharacters());
        //System.out.println(firstCharacter());
        //threeFirstCharacters();
        //allCharactersOfName();
        //nameReverse();
        //printDesiredPartOfWOrd();
        //printEndPartOfWOrd();
        //stringContainsWord();
        System.out.println(reverse("marina"));
    }

    public static int calculateCharacters(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        return name.length();
    }

    public static char firstCharacter(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        return name.charAt(0);
    }

    public static void threeFirstCharacters(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        if(name.length() > 2 ){
            System.out.println("1. character: " + name.charAt(0));
            System.out.println("2. character: " + name.charAt(1));
            System.out.println("3. character: " + name.charAt(2));
        } else System.out.println();
    }

    public static void allCharactersOfName(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int i = 0;
        while (i < name.length()){
            System.out.println((i+1) + ". character: " + name.charAt(i));
            i++;
        }
    }

    public static void nameReverse() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int i = name.length() - 1;
        while (i >= 0) {
            System.out.print(name.charAt(i));
            i--;
        }
    }

    public static void printDesiredPartOfWOrd(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String text = reader.nextLine();

        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + text.substring(0, length));
    }

    public static void printEndPartOfWOrd(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String text = reader.nextLine();

        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + text.substring(text.length() - length));
    }

    public static void stringContainsWord(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String first = reader.nextLine();

        System.out.print("Type the second word: ");
        String second = reader.nextLine();

        int index = first.indexOf(second);
        if(index == -1){
            System.out.println("The word " + second + " is not found in the word " + first + ".");
        } else {
            System.out.println("The word " + second + " is found in the word " + first + ".");
        }
    }

    public static String reverse(String text){
        int i = text.length()- 1;
        String help = "";

        while (i >= 0){
            help = help + text.charAt(i);
            i--;
        }
        return help;
    }
}
