/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

import java.util.Vector;

/**
 *
 * @author j0ni
 */
public class Game {
    
    private int storePoint;

    public void setStorePoint(int storePoint) {
        this.storePoint = storePoint;
    }

    public int getStorePoint() {
        return storePoint;
    }

    public Game() {
    }
    
    public Game(){
        play=new Play();
    }
    
    public void register(ScoardTeam team){
        teams.add(team);
    }
    
    
    
    private Vector<ScoardTeam> teams;
    Thread play;
}
