package Objects.objectsOnList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClassStudents {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if(name.equals("")){
                break;
            } else {
                System.out.print("studentnumber: ");
                String number = reader.nextLine();
                list.add(new Student(name, number));
            }
        }
        list.forEach(System.out::println);

        System.out.print("Give search term: ");
        String search = reader.nextLine();

        System.out.println("Results: ");

        list.stream().filter(x -> x.getName().contains(search)).forEach(System.out::println);
    }
}
