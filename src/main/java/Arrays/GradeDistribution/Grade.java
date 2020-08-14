package Arrays.GradeDistribution;

import Arrays.library.StringUtils;

public class Grade {

    private String id;
    private int score;
    private int numbers;

    public Grade(String id) {
        this.id = id;
        this.score = 0;
        this.numbers = 0;
    }

    public void addToGrade(int points){
        this.score += points;
        this.numbers++;
    }

    public String getId(){
        return this.id;
    }

    public int getScore(){
        return this.score;
    }

    public int getNumber(){
        return this.numbers;
    }

    public void printStars(){
        System.out.print(this.getId()+ ": " );
        for(int i = this.numbers; i > 0; i--){
            System.out.print("*");
        }
        System.out.println();
    }
}
