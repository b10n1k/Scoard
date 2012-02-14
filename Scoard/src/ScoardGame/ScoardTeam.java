/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

//import ScoardUI.ScoardField;
import ScoardUI.ScoardField;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author j0ni
 */
public class ScoardTeam extends Player{
    
    private ArrayList<String> players;
    private boolean enableToPlay;
    private int score;
    private ScoardField sf;
    
    public ScoardTeam(String player, ScoardField sf) {
        super(player);
        players=new ArrayList<String>();
        this.score=501;
        this.sf=sf;
    }

    protected void addPlayer(String name){
        players.add(name);
        
    }
    
    public void updateScore(int score) {
        this.score=score;
    }

    public String displayStatus() {
        return super.getName() +" : "+score;
    }

    @Override
    protected String getPlayerName(int index) {
        return players.get(index);
    }
    
    public int getScore(){
        return this.score;
    }

    int getNumOfPlayers() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean isWinner() {
        return score==0;
    }
    
    public boolean isWinner(int value) {
        return value==0;
    }
}
