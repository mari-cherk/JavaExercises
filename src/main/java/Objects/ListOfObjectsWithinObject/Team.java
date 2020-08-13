package Objects.ListOfObjectsWithinObject;

import java.util.ArrayList;

import Objects.objectAsMmethodParameter.Person;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;


    }

    public String getName(){
        return this.name;
    }

    public void addPlayer(Player player){
        if(this.players.size() < maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers(){
        this.players.forEach(System.out::println);
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return this.maxSize;
    }

    public int goals(){

        //return this.players.stream().reduce(0,(a, player) -> a + player.goals());
        //int goals = 0;
        /*for (Player player : this.players){
            goals += player.goals();
        }*/
        return this.players.stream().reduce(0,(a, player) -> a + player.goals(), Integer::sum);
    }
}
