package Arrays.array2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClassArray2 {

    public static void main(String[] args) {


        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);


        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));


        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));

        int[] array1 = {5, 1, 3, 4, 2};
        printArrayAsStars(array1);
    }

    public static int[] copy ( int[] array){
        int[] copyArray = array.clone();
        return copyArray;
    }

    public static int[] reverseCopy(int[] array){
        int[] reversArray = new int[array.length];
        int j = array.length - 1;
        for(int i : array){
            reversArray[j] = i;
            j--;
        }
        return reversArray;
    }

    public static void printArrayAsStars(int[] array) {
        for(int i : array){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


