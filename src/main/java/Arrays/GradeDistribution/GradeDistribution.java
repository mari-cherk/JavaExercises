package Arrays.GradeDistribution;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeDistribution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ...

        doSomething(scanner);
    }

    public static void doSomething(Scanner scanner) {
        System.out.println("Type exam scores, -1 completes:");
        Grade grade0 = new Grade("0");
        Grade grade1 = new Grade("1");
        Grade grade2 = new Grade("2");
        Grade grade3 = new Grade("3");
        Grade grade4 = new Grade("4");
        Grade grade5 = new Grade("5");
        ArrayList<Grade> grades = new ArrayList<Grade>();
        grades.add(grade5);
        grades.add(grade4);
        grades.add(grade3);
        grades.add(grade2);
        grades.add(grade1);
        grades.add(grade0);

        /*int allScores = 0;
        int accepted = 0;
        //int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;*/
        while(true) {
            int points = Integer.parseInt(scanner.nextLine());
            if(points == -1){
                break;
            }
            if(points >= 0 && points <= 29){
                grade0.addToGrade(points);
            } else if (points >= 30 && points <= 34) {
                grade1.addToGrade(points);
            } else if(points >= 35 && points <= 39) {
                grade2.addToGrade(points);
            } else if(points >= 40 && points <= 44) {
                grade3.addToGrade(points);
            } else if(points >= 45 && points <= 49) {
                grade4.addToGrade(points);
            } else if(points >= 50 && points <= 60) {
                grade5.addToGrade(points);
            }

        }
        System.out.println("Grade distribution:");

        grades.forEach(x -> x.printStars());
    }
}
