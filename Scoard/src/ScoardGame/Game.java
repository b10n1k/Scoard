/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

import ScoardUI.ScoardField;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.util.Vector;

/**
 *
 * @author j0ni
 */
public class Game {
    private boolean turn;
    
    public Game(ScoardTeam t1, ScoardTeam t2, ScoardField darts) {
        teams=new Vector<ScoardTeam>();
        this.darts = darts;
        this.turn=true;
        register(t1); 
        register(t2);
                
        for(ScoardTeam t:teams){
            
            new Thread(t).start();
            
        }
    }

    public Game(ScoardField darts) {
        teams=new Vector<ScoardTeam>();
        this.turn=true;
        
        this.darts =darts;
                
        register(new ScoardTeam("player1",this.darts)); 
        register(new ScoardTeam("player2",this.darts));
        //for(ScoardTeam t:teams){
            
          //  new Thread(t).start();
            
        //}
    }
    
    private void register(ScoardTeam team){
        teams.add(team);
    }
    
    public void register(ScoardTeam teamA, ScoardTeam teamB){
        teams.add(teamA);
        teams.add(teamB);
    }
    
    public void startGame(){
        ScoardTeam playingNow= null;
        
        while(winner==""){
            playingNow=teams.firstElement();
           // for (ScoardTeam st : teams){
                //int numOfPlayers = st.getNumOfPlayers();
            if(darts.isTurn1.isSelected()){
               
               playingNow.updateScore(darts.returnLbl1());
                System.out.println(darts.returnLbl1()+"  if(darts.isTurn1.isSelected");
               darts.updateNotification(playingNow.displayStatus());
            }else
                if(darts.isTurn2.isSelected()){
                    playingNow=teams.get(teams.indexOf(playingNow)+1);
               playingNow.updateScore(darts.returnLbl2());
               System.out.println(darts.returnLbl2()+"  if(darts.isTurn2.isSelected");
               darts.updateNotification("b");
                }
            }
        
    }
    
    public void startGame2(){
        ScoardTeam playingNow= null;
        
        while(winner==""){
            playingNow=teams.firstElement();
           // for (ScoardTeam st : teams){
                //int numOfPlayers = st.getNumOfPlayers();
            synchronized(this){
            if(darts.isTurn1.isSelected()){
               
               playingNow.updateScore(this.storePoint);
                System.out.println(darts.returnLbl1()+"  if(darts.isTurn1.isSelected");
               darts.updateNotification(playingNow.displayStatus());
            }else
                if(darts.isTurn2.isSelected()){
                    playingNow=teams.get(teams.indexOf(playingNow)+1);
               playingNow.updateScore(this.storePoint);
               System.out.println(darts.returnLbl2()+"  if(darts.isTurn2.isSelected");
               darts.updateNotification(playingNow.displayStatus());
                }
            }
        }
    }
    
    public void setStorePoint(int storePoint) {//private
        this.storePoint = storePoint;
    }

    public int getStorePoint() {//private
        return storePoint;
    }    
    
    protected static boolean haveWinner(){
    if(winner!=null){
        return true;
    }
    return false;
}
    
    protected synchronized void main_play_a(ScoardTeam team){
        while(turn==false){
            try{
                wait();
            }catch(Exception ex){}
            
            turn=false;
            notifyAll();
        }
    }
    
    protected synchronized void main_play_b(ScoardTeam team){
        while(turn==true){
            try{
                wait();
               
            }catch(Exception ex){}
            
            turn=true;
            notifyAll();
        }
    }
    
    public static ScoardField darts;
    private Vector<ScoardTeam> teams;
    private static int storePoint;
    
    public static String winner="";

    public ScoardTeam returnFirstTeam() {
        return teams.firstElement();
    }

    public ScoardTeam returnSecondTeam() {
        return teams.lastElement();
    }
}
