/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

/**
 *
 * @author j0ni
 */
public abstract class Player {
    
    public Player(String player){
        setName(player);
    }
    
    public abstract int getScore();
    public abstract void setScore(int score);
    
    private void setName(String name){
        player=name;
    }
    
    private String player;
    private int score;
    
}
