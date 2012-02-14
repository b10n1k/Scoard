/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

import ScoardUI.ScoardField;
import java.util.Vector;
import javax.swing.JOptionPane;

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
    }

    public Game(ScoardField darts) {
        teams=new Vector<ScoardTeam>();
        this.turn=true;
        
        this.darts =darts;
                
        register(new ScoardTeam("player1",this.darts)); 
        register(new ScoardTeam("player2",this.darts));
    }
    
    private void register(ScoardTeam team){
        teams.add(team);
    }
    
    public void register(ScoardTeam teamA, ScoardTeam teamB){
        teams.add(teamA);
        teams.add(teamB);
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

    
    public String checkout(int value){
        if(value>170){
            
                return "No tips";
        }
        else{
        switch(value){
            
            case 170:
                return "T20 + T20 + BULL";
                //break;
            case 167:
                return "T20 + T19 + BULL";
                //break;
            case 164:
                return "T19 + T19 + BULL";
                //break;
            case 161:
                return "T20 + T17 + BULL";
                //break;
            case 160:
                return "T20 + T20 + D20";
                //break;
            case 158:
                return "T20 + T20 + D19";
                //break;
            case 157:
                return "T19 + T20 + D20";
                //break;
            case 156:
                return "T20 + T20 + D18";
                //break;
            case 155:
                return "T20 + T19 + D19";
                //break;
            case 154:
                return "T20 + T18 + D20";
                //break;
            case 153:
                return "T20 + T19 + D18";
                //break;
            case 152:
                return "T20 + T20 + D16";
                //break;
            case 151:
                return "T20 + T17 + D20";
                //break;
            case 150:
                return "T20 + T18 + D18";
                //break;
            
            case 149:
                return "T20 + T19 + D16";
                //break;
            case 148:
                return "T20 + T20 + D14";
                //break;
            case 147:
                return "T20 + T17 + D18";
                //break;
            case 146:
                return "T20 + T18 + D16";
                //break;
            case 145:
                return "T20 + T15 + D20";
                //break;
            case 144:
                return "T20 + T20 + D12";
                //break;
            case 143:
                return "T20 + T17 + D16";
                //break;
            case 142:
                return "T20 + T14 + D20";
                //break;
            case 141:
                return "T20 + T15 + D18";
                //break;
            case 140:
                return "T20 + T16 + D16";
                //break;
                
            case 139:
                return "T20 + T13 + D20";
                //break;
            case 138:
                return "T20 + T16 + D15";
                //break;
            case 137:
                return "T18 + T17 + D16";
                //break;
            case 136:
                return "T20 + T20 + D8";
                //break;
            case 135:
                return "T20 + T13 + D18";
                //break;
            case 134:
                return "T20 + T14 + D16";
                //break;
            case 133:
                return "T20 + T19 + D8";
                //break;
            case 132:
                return "T20 + T16 + D12";
                //break;
            case 131:
                return "T20 + T13 + D16";
                //break;
            case 130:
                return "T20 + T18 + D8";
                //break;
                
            case 129:
                return "T19 + T16 + D12";
                //break;
            case 128:
                return "T20 + T20 + D4";
                //break;
            case 127:
                return "T20 + T17 + D8";
                //break;
            case 126:
                return "T19 + 19 + BULL";
                //break;
            case 125:
                return "T20 + T19 + D4";
                //break;
            case 124:
                return "T20 + T16 + D8";
                //break;
            case 123:
                return "T20 + T13 + D12";
                //break;
            case 122:
                return "T18 + 18 + BULL";
                //break;
            case 121:
                return "T19 + 14 + BULL";
                //break;
            case 120:
                return "T20 + 20 + D20";
                //break;
                
            case 119:
                return "T20 + 19 + D20";
                //break;
            case 118:
                return "T20 + 18 + D20";
                //break;
            case 117:
                return "T20 + 17 + D20";
                //break;
            case 116:
                return "T20 + 16 + D20";
                //break;
            case 115:
                return "T20 + 15 + D20";
                //break;
            case 114:
                return "T20 + 14 + D20";
                //break;
            case 113:
                return "T20 + 13 + D20";
                //break;
            case 112:
                return "T20 + 12 + D20";
                //break;
            case 111:
                return "T20 + 19 + D16";
                //break;
            case 110:
                return "T20 + 10 + D20";
                //break;
                
            case 109:
                return "T19 + 12 + D20";
                //break;
            case 108:
                return "T20 + 16 + D16";
                //break;
            case 107:
                return "T19 + 10 + D20";
                //break;
            case 106:
                return "T20 + 10 + D18";
                //break;
            case 105:
                return "T20 + 13 + D16";
                //break;
            case 104:
                return "T20 + 12 + D16";
                //break;
            case 103:
                return "T19 + 10 + D18";
                //break;
            case 102:
                return "T20 + 10 + D16";
                //break;
            case 101:
                return "T17 + 10 + D20";
                //break;
            case 100:
                return "T20 + D20";
                //break;
            case 99:
                return "T19 + 10 + D16";
                //break;
            case 98:
                return "T20 + D19";
                //break;
            case 97:
                return "T19 + D20";
                //break;
            case 96:
                return "T20 + D18";
                //break;
            case 95:
                return "T19 + D19";
                //break;
            case 94:
                return "T18 + D20";
                //break;
            case 93:
                return "T19 + D18";
                //break;
            case 92:
                return "T20 + D16";
                //break;
            case 91:
                return "T17 + D20";
                //break;
            case 90:
                return "T18 + D18";
                //break;
                
            case 89:
                return "T19 + D16";
                //break;
            case 88:
                return "T16 + D20";
                //break;
            case 87:
                return "T17 + D18";
                //break;
            case 86:
                return "T18 + D16";
                //break;
            case 85:
                return "T15 + D20";
                //break;
            case 84:
                return "T16 + D18";
                //break;
            case 83:
                return "T17 + D16";
                //break;
            case 82:
                return "T14 + D20";
                //break;
            case 81:
                return "T15 + D18";
                //break;
            case 80:
                return "T16 + D16";
                //break;
                
            case 79:
                return "T13 + D20";
                //break;
            case 78:
                return "T18 + D12";
                //break;
            case 77:
                return "T15 + D16";
                //break;
            case 76:
                return "T20 + D8";
                //break;
            case 75:
                return "T13 + D18";
                //break;
            case 74:
                return "T14 + D16";
                //break;
            case 73:
                return "T19 + D8";
                //break;
            case 72:
                return "T16 + D12";
                //break;
            case 71:
                return "T13 + D16";
                //break;
            case 70:
                return "T18 + D8";
                //break;
                
            case 69:
                return "T19 + BULL";
                //break;
            case 68:
                return "T20 + D4";
                //break;
            case 67:
                return "T17 + D8";
                //break;
            case 66:
                return "T10 + D18";
                //break;
            case 65:
                return "T19 + D4";
                //break;
            case 64:
                return "T16 + D8";
                //break;
            case 63:
                return "T13 + D12";
                //break;
            case 62:
                return "T10 + D16";
                //break;
            case 61:
                return "T15 + T20";
                //break;
            case 60:
                return "20 + D20";
                //break;
                
            case 59:
                return "19 + D20";
                //break;
            case 58:
                return "18 + D20";
                //break;
            case 57:
                return "17 + D20";
                //break;
            case 56:
                return "16 + D20";
                //break;
            case 55:
                return "15 + D20";
                //break;
            case 54:
                return "14 + D20";
                //break;
            case 53:
                return "13 + D20";
                //break;
            case 52:
                return "12 + D20";
                //break;
            case 51:
                return "19 + D16";
                //break;
            case 50:
                return "10 + D20";
                //break;
                
            case 49:
                return "17 + D16";
                //break;
            case 48:
                return "16 + D16";
                //break;
            case 47:
                return "15 + D16";
                //break;
            case 46:
                return "6 + D20";
                //break;
            case 45:
                return "13 + D16";
                //break;
            case 44:
                return "12 + D16";
                //break;
            case 43:
                return "3 + D20";
                //break;
            case 42:
                return "10 + D16";
                //break;
            case 41:
                return "9 + D16";
                //break;
                
            default:
                return " You need Just a Double score!!";
            }   
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
    
    public ScoardTeam returnFirstTeam() {
        return teams.firstElement();
    }

    public ScoardTeam returnSecondTeam() {
        return teams.lastElement();
    }
    
    public static ScoardField darts;
    private Vector<ScoardTeam> teams;
    private static int storePoint;
    
    public static String winner="";

    public void finish() {
        
        darts.endGame();
    }
}
