/*
 * 
 *  301
 * 
 *  Dart Rules01 for '01 Games 
 *
 *  Number of Players: Any number of players may play, but normally two individuals or two teams play.
 *
 *  Numbers in Play: All the numbers are in play, but some receive greater use than others.  The 19 and 20, for instance are used extensively for scoring points since they are the highest numbers on the dartboard.  All the numbers may be used to throw the necessary doubles in the game.
 * 
 *  This game is generally played by two people but can be played by teams. Each player starts with 301 points. The goal for each player is to reach zero, exactly, by subtracting the amount they score in a turn from the amount they had left from the previous turn. The player cannot start subtracting until they double in (hits one of the 21 doubles on the dartboard including the double bull). Once the double is hit, then all scores will count. To end the game, the player must also double out (ie. If they have 32 left, then they will need to hit a double 16 to win. If they then hit a single sixteen, leaving 16, their next target would be a double 8. If they should hit more points than they have left, then they have busted. Their turn is over and they will resume with the same score they started with on that throw the next time it is their turn to throw.). If they hit the double leaving them zero points, then they have won the game.
 * 
 *  501
 * 
 *  Number of Players: Any number of players may play, but normally two individuals or two teams play.
 * 
 *  Numbers in Play: All the numbers are in play, but some receive greater use than others.  The 19 and 20, for instance are used extensively for scoring points since they are the highest number on the dartboard.  All the numbers may be used to throw the necessary doubles in the game.
 * 
 *  This game is generally played as a team event, though we also play it in our single events. All players/teams start with 501 points. Unlike 301, you do not have to double-in, but can start on any number. Each player/team subtracts the amount they score from the amount they have left. To win, like 301 above, the player/team will need to double-out to reach zero.
 * 
 * 
 * 
 *   Dart Rules01 for Baseball
 * 
 *  Number of Players: Any number can play, but it is unusual to have only two players or two teams (like the game of baseball itself)
 * 
 *  Numbers in Play: 1, 2, 3, 4, 5, 6 , 7, 8, 9
 * 
 *  Rules01 of Play: This game is similar to the actual game of baseball. Players try to score as many points as possible per inning in order to win. 
 *
 * 
 * 
 *  Dart Rules01 for the game of Killer
 * 
 *  Number of Players: Any number can play, but Killer is most fun with three or more players.
 *  
 *  Numbers in Play: The numbers used are determined by the players.  Each player throws one dart with the "opposite" hand.  (e.g., right-handers throw left-handed) to determine randomly his or her own number.  If a player misses the board or hits a number already taken, he or she throws again.
 * 
 *  Rules01 of the Game:  Each player first tries to hit the double of his or her own number.  When this is acheived, the player is known as a "killer" and a K is placed after his name on the scoreboard.
 * 
 * 
 * 
 *  Dart Rules01 for Shanghai
 * 
 *  Number of Players: Any number can play, it is sometimes played with a dozen or more players.
 * 
 *  Numbers in Play: 1, 2, 3, 4, 5, 6, 7
 * 
 *  Rules01 of Play:  Players take turns throwing at the numbers 1, 2, and so on, in sequence, until 7. They try to score as many points as possible per turn (using all three darts).
 * 
 * 
 * 
 *  Dart Rules01 for Legs
 * 
 *  Number of Players:  Any number can play
 * 
 *  Numbers in Play: All the numbers on the board are used, but players generally concentrate on the 19 or 20. 
 * 
 *  Rules01 of Play: After determining the order of the play, the first player attempts to get the highest score possible and notes it on the scoreboard. 
 * 
 * 
 * 
 *  Dart Rules01 for Fifty-One by Five's
 * 
 *  Number of Players: Any number can play
 * 
 *  Numbers in Play: All the numbers on the board are used, but the score of every three-dart turn must be divisible by 5, so the commonly aimed-for numbers are those divisible by five: 20, 15, 10, 5. 
 * 
 * 
 * 
 * 
 * 
 *  Dart Rules01 for Round The World
 * 
 *  (Also called "Round the Board" or "Once Round the Island.")
 * 
 *  Number of Players: Two players
 * 
 *  Darts: Three each
 * 
 *  Rules01 of Play:  The object of this popular game is to be the first player to hit every number on the board from 1-20. Any part of the number - single, double or triple - counts.
 * 
 * 
 * 
 *  Dart Rules01 for English Cricket
 * 
 *  Number of Players: Two players or two teams
 * 
 *  Numbers in Play:  All numbers are used but since each score must exceed 40 the higher numbers especially 20 are the favorites.
 * 
 *  Rules01 of Play:  One player becomes the batter, and the other is the bowler; the batter goes first. Ten stripes are entered on the board as wickets.
 * 
 */
package ScoardGame;

import ScoardException.InvalidHit;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author j0ni
 */
public final class Rules01 extends InvalidHit implements GameRules{

    private ArrayList<Integer> availableNum ;
    private int finishit=0;
    
    public Rules01() {
        this.availableNum=new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25,50));
    }

    @Override
    public boolean hasFinished(int hit) {
        if(hit==finishit) 
            return true;
        return false;
    }

    @Override
    public boolean isValid(int hit) throws InvalidHit {
        if(!availableNum.contains(hit)) 
            throw new InvalidHit("Out of the range!!");
        else
            return true;
    }

    @Override
    public boolean canFinish() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isBull() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

     @Override
    public boolean isBurnedHit(int totalhit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isDouble(int hit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNumInPlay(int[] nums) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
