package Arrays.nightSky;

import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint =0;
    }

    public NightSky(double density) {
        this.density = density;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random random = new Random();
        for (int i = 1; i <= this.width; i++) {
            double probability = random.nextDouble();
            if (probability <= this.density){
                System.out.print("*");
                this.starsInLastPrint ++;
            }else System.out.print(" ");
        }
    }

    public void print(){
        this.starsInLastPrint = 0;
        for(int i = 1; i <= this.height; i++){
            this.printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
