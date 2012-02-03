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
        score=Rules01.DEFAULT_INITIAL_SCORE;
    }
    protected abstract String getPlayerName(int index);
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int points){
        score=-points;
    }
    
    public void setName(String name){
        teamname=name;
    }
    
    protected String getName(){
        return teamname;
    }
    
    protected void reduceScore(int hit){
        score-=hit;
    }
    
    private String teamname;
    private int score;
    
}
