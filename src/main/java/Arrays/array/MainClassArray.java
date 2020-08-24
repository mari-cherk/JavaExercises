package Arrays.array;

import java.util.Arrays;

public class MainClassArray {

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
        printElegantly(array);
    }

    public static int sum(int[] array) {
        return Arrays.stream(array).reduce(0, (int a, int b) -> a + b);
    }

    public static void printElegantly(int[] array){
        Arrays.stream(array).forEach(x -> System.out.print(x + ", "));
    }


    }
