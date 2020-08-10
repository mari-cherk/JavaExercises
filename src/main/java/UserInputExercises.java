import java.util.Scanner;

public class UserInputExercises {

    public static void main(String[] args) {

        //greeting();
        nameAndAgeGreeting();

    }

    public static void greeting(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Who is greeted: ");
        String name = reader.nextLine(); // Reads a line of input from the user and assigns it
        //     to the variable called name

        System.out.print("Hi " + name);
    }

    public static void nameAndAgeGreeting(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = reader.nextLine();   // Reads a line from the users keyboard

        System.out.print("How old are you: ");
        int age = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an integer

        System.out.println("Your name is: " + name + ", and you are " + age + " years old, nice to meet you!");
    }


}
