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
        score=Rules.INITIAL_SCORE;
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int points){
        score=-points;
    }
    
    private void setName(String name){
        player=name;
    }
    
    protected void reduceScore(){
        
    }
    
    private String player;
    private int score;
    
}
