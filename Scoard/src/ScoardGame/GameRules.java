/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

import ScoardException.InvalidHit;

/**
 *
 * @author j0ni
 */
public interface GameRules {
    
    public boolean hasFinished(int hit);
    public boolean isValid(int hit) throws InvalidHit;
    
    
    public boolean canFinish();
    
    public boolean isBull();
    public boolean isBurnedHit(int totalhit);
    public boolean isDouble(int hit);
    public void setNumInPlay(int[] nums);
    
    
    public static int HITS = 3;
    public static int DEFAULT_INITIAL_SCORE = 501;
    public static int ALTENATIVE_INITIAL_SCORE=301;
    public static int BULL = 50;
    public static int[] dartNums=new int[23];
}
