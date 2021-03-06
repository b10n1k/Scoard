/*
 * The ScoardTeam is an extended class of the abstract class Player. 
 * In order to play more than one player in the a team, this class 
 * define a ArrayList. 
 * 
 */
package ScoardGame;

//import ScoardUI.ScoardField;
import ScoardUI.ScoardField;
import java.util.ArrayList;

/**
 *
 * @author j0ni
 */
public class ScoardTeam extends Player{
    
    //Variables
    private ArrayList<String> players = null;
    private boolean enableToPlay;
    private int score;
    private ScoardField sf;
    private int index;
    private String curr;

    /**
     * Class Constructor 
     * @param player The player's name.
     * @param sf The dartboard of the game.
     */
    public ScoardTeam(String player, ScoardField sf) {
        super(player);
        players=new ArrayList<String>();
        this.score=501;
        this.sf=sf;
        this.index=0;
        //this.curr=players.get(index);
    }

    /**
     * Add a new player in the game.
     * 
     * @param name The name of the new player.
     */
    public void addPlayer(String name){
        players.add(name);
        
    }
    
    public String getPlayer(){
        if((index%getNumOfPlayers())==0)
            this.curr=players.get(index);
        else {
            this.curr=players.get(++index);
            index=0;
        }
        return curr;
    }
    
    /**
     * Update the player's score.
     * 
     * @param score The score that must to be stored
     */
    public void updateScore(int score) {
        this.score=score;
    }

    /**
     * 
     * @return A String with the status
     */
    public String displayStatus() {
        return super.getName() +" : "+score;
    }

    /**
     * 
     * @param index The index of the player in the ArrayList
     * @return The player's name.
     */
    @Override
    public String getPlayerName(int index) {
        return players.get(index);
    }
    
    /**
     * 
     * @return The player's score.
     */
    public int getScore(){
        return this.score;
    }

    /**
     * 
     * @return 
     */
    public int getNumOfPlayers() {
        return players.size();
    }

    /**
     * true if the player finish the game.
     * 
     * @return True if the player has remained point equal to zero, otherwise false.
     */
    public boolean isWinner() {
        return score==0;
    }
    
    /**
     * true if the player finish the game. 
     * @param value Player's score 
     * @return True if the player has remained point equal to zero, otherwise false. 
     */
    public boolean isWinner(int value) {
        return value==0;
    }
}
