/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

/**
 *
 * @author j0ni
 */
public class ScoardTeam extends Player{
    
    private String[] players;
    //private int tscore;

    public ScoardTeam(String player) {
        super(player);
    }

    public ScoardTeam(String player, int numOfParticipants) {
        super(player);
        players=new String[numOfParticipants];
    }
    
    @Override
    public int getScore() {
        return super.score;
    }

    @Override
    public void setScore(int score) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
