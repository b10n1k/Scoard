/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

//import ScoardUI.ScoardField;
import ScoardUI.ScoardField;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author j0ni
 */
public class ScoardTeam extends Player implements Runnable{
    
    private ArrayList<String> players;
    private boolean enableToPlay;
    private int score;
    private ScoardField sf;
    
   // protected ScoardField darts;
    //private int tscore;

    public ScoardTeam(String player, ScoardField sf) {
        super(player);
        players=new ArrayList<String>();
        this.score=501;
        this.sf=sf;
    }

    
    private synchronized int play(){
       // String points = ;
        int sum=0;
        while(enableToPlay=true){
            try {
                wait();
                
            } catch (InterruptedException ex) {
                
            }
            
        }
        notifyAll();
        return getScore()-sum;
        
    }
    protected void addPlayer(String name){
        players.add(name);
        
    }
    
    public void updateScore(int score) {
        this.score=score;
    }

    public String displayStatus() {
        //String name = players.get(index);
        return super.getName() +" : "+score;
    }

    @Override
    protected String getPlayerName(int index) {
        return players.get(index);
    }

    int getNumOfPlayers() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void run() {
        while(Game.haveWinner()){
        try {
           // main_play_a(ScoardTeam team)
        } catch (Exception ex) {
            System.out.println("error:"+this.getName());
        }
        }
    }
    
    
}
