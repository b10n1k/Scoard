/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

import ScoardUI.ScoardField;

/**
 *
 * @author j0ni
 */
public class ScoardTeam extends Player implements Runnable{
    
    private String[] players;
    private boolean enableToPlay;
    
    //private int tscore;

    public ScoardTeam(String player) {
        super(player);
    }

    public ScoardTeam(String player, int numOfParticipants) {
        super(player);
        players=new String[numOfParticipants];
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
    
    private int getShoot() {
        return ScoardField.getValue();
    }
}
