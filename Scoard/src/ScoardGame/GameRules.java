/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

/**
 *
 * @author j0ni
 */
public interface GameRules {
    
    public boolean hasFinished();
    public boolean isValid();
    public boolean isHisTurn();
    public int subPoints();
    public boolean canFinish();
    public String displayScore();
    
    public static int HITS = 3;
    public static int H = 501;
    
}
