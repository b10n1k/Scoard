/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

import ScoardUI.ScoardField;
import java.util.ArrayList;

/**
 *
 * @author j0ni
 */
public class ScoardTeam extends Player implements Runnable{
    
    private ArrayList<String> players;
    private boolean enableToPlay;
    private int score;
    //private int tscore;

    public ScoardTeam(String player) {
        super(player);
        players=new ArrayList<String>();
    }

    @Override
    public void run() {
        
        play();
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
    
    private int getShoot() {
        return ScoardField.getValue();
    }

    public String displayStatus(int index) {
        String name = getPlayerName(index);
        return name+" : TeamScore : "+score;
    }

    @Override
    protected String getPlayerName(int index) {
        return players.get(index);
    }
}
