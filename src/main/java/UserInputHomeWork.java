import java.util.Scanner;



public class UserInputHomeWork {

    public static void main(String[] args) {

        //askIntegersAndPrintTheirSum();
        //askIntegersAndPrintTheirQuotient();
        //askRadiusAndPrintCircumference();
        //askIntegersAndPrintBigger();
        //askNamesAndAgesTwoUsersAndPrintSumOfAges();
        //askNumberAndTellIfItPositive();
        //askAgeAndTellIfUserReachedMajority();
        //askNumberAndTellIfItEvenOrOdd();
        //askNumbersAndPrintGreater();
        //askPointsAndPrintGrade();
        askPassword();

    }

    public static void askIntegersAndPrintTheirSum(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Sum of the numbers: " + (firstNumber + secondNumber));
    }

    public static void askIntegersAndPrintTheirQuoyient(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + ((double)firstNumber / secondNumber));
    }

    public static void askRadiusAndPrintCircumference(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());

        System.out.println("Circumference of the circle: " + (2 * Math.PI * radius));
    }

    public static void askIntegersAndPrintBigger(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        System.out.println("The bigger number of the two numbers given was: " + Math.max(firstNumber, secondNumber));
    }

    public static void askNamesAndAgesTwoUsersAndPrintSumOfAges(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String firstUserName = reader.nextLine();

        System.out.print("Type your age: ");
        int firstUserAge = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String secondUserName = reader.nextLine();

        System.out.print("Type your age: ");
        int secondUserAge = Integer.parseInt(reader.nextLine());

        System.out.println("Matti and Arto are " + (firstUserAge + secondUserAge) + " years old in total.");
    }

    public static void askNumberAndTellIfItPositive(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if(number > 0) {
            System.out.println("The number is positive.");
        } else if(number < 0) {
            System.out.println("The number is not positive.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static void askAgeAndTellIfUserReachedMajority(){
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        if(age < 18) {
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority!");
        }
    }

    public static void askNumberAndTellIfItEvenOrOdd(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if(number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }

    public static void askNumbersAndPrintGreater(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        if(firstNumber > secondNumber) {
            System.out.println("Greater number: " + firstNumber);
        } else if(firstNumber < secondNumber) {
            System.out.println("Greater number: " + secondNumber);
        } else {
            System.out.println("The numbers are equal!");
        }
    }

    public static void askPointsAndPrintGrade(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        if(points >= 0 && points <= 29){
            System.out.println("Grade: failed");
        } else if (points >= 30 && points <= 34) {
            System.out.println("Grade: 1");
        } else if(points >= 35 && points <= 39) {
            System.out.println("Grade: 2");
        } else if(points >= 40 && points <= 44) {
            System.out.println("Grade: 3");
        } else if(points >= 45 && points <= 49) {
            System.out.println("Grade: 4");
        } else if(points >= 50 && points <= 60) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("You typed wrong points!");
        }
    }

    public static void askPassword() {
        String correctPassword = "carrot";
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type the password: ");
            String password = reader.nextLine();

            if (password.equals("forgot")) {
                break;

            } else if (password.equals(correctPassword)) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            }
        }
    }

}
