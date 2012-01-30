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

    private static class Play extends Thread {

        public Play() {
        }
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
