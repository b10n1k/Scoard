/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

import ScoardUI.ScoardField;
import java.util.Vector;

/**
 *
 * @author j0ni
 */
public class Game {
    
    public Game(){
        teams=new Vector<ScoardTeam>();
    }
    
    public void register(ScoardTeam team){
        teams.add(team);
    }
    
    public void register(ScoardTeam teamA, ScoardTeam teamB){
        teams.add(teamA);
        teams.add(teamB);
    }
    
    public void startGame(){
        //Thread t1 = new Thread(new teams.)
    }
    
    public void setStorePoint(int storePoint) {//private
        this.storePoint = storePoint;
    }

    public int getStorePoint() {//private
        return storePoint;
    }    
    
    private Vector<ScoardTeam> teams;
    private int storePoint;
    Thread play;
}
