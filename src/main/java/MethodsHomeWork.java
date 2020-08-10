import java.util.Scanner;

public class MethodsHomeWork {

    public static void main(String[] args) {

        //printStars(6);
        //printSquare(6);
        //printRectangle(17, 3);
        //printTriangle(4);
        //printRightAlignedTriangle(4);
        //xmasTree(10);
        //System.out.println(least(8, 8));
        //System.out.println(greatest(8, 8, 8));
    }

    private static void printStars(int amount){
        int i = 0;
        while(i < amount){
            System.out.print("*");
            i++;
        }
    }

    private static void printSquare(int amount){
        int j = 0;
        while(j < amount) {
            int i = 0;
            while (i < amount) {
                System.out.print("*");
                i++;
            }
            System.out.print("\n");
            j++;
        }
    }

    private static void printRectangle(int width, int height){
        int j = 0;
        while(j < height) {
            int i = 0;
            while (i < width) {
                System.out.print("*");
                i++;
            }
            System.out.print("\n");
            j++;
        }
    }

    private static void printTriangle(int size){
        int j = 0;
        int s = 1;
        while(j < size) {
            int i = 0;
            while (i < s) {
                System.out.print("*");
                i++;
            }
            s++;
            System.out.print("\n");
            j++;
        }
    }

    private static void printRightAlignedTriangle(int size){
        int j = 0;
        int spaces = size - 1;
        while(j < size) {
            int i = 0;
            while (i < spaces) {
                System.out.print(" ");
                i++;
            }
            while (i < size){
                System.out.print("*");
                i++;
            }
            spaces--;
            System.out.print("\n");
            j++;
        }
    }

    private static void xmasTree(int height){
        int j = 0;
        int h = height;
        int spaces = height - 1;
        while(j < height) {
            int i = 0;
            while (i < spaces) {
                System.out.print(" ");
                i++;
            }
            while (i < h){
                System.out.print("*");
                i++;
            }
            h++;
            spaces--;
            System.out.print("\n");
            j++;
        }
        int stand = 0;
        while (stand < 2){
            int i = 0;
            while (i < height - 2){
                System.out.print(" ");
                i++;
            }
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            stand++;
            System.out.print("\n");
        }
    }

    public static int least(int number1, int number2){
        return Math.min(number1, number2);
    }

    public static int greatest(int number1, int number2, int number3) {
        int number4 = Math.max(number1, number2);
        return Math.max(number3, number4);
    }
}
