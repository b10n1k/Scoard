/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

import ScoardUI.ScoardField;
import java.lang.Math;
import java.util.Random;
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
    
    public Game() {
        teams=new Vector<ScoardTeam>();
        this.turn=true;
    }
    
    private void register(ScoardTeam team){
        teams.add(team);
    }
    
    public void register(ScoardTeam teamA, ScoardTeam teamB){
        teams.add(teamA);
        teams.add(teamB);
    }
    
    public void register(String name){
        teams.add(new ScoardTeam(name,this.darts));
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
                return calculator(value,2);
                //return "T20 + D19";
                //break;
            case 97:
                return calculator(value,2);
                //return "T19 + D20";
                //break;
            case 96:
                return calculator(value,2);
                //return "T20 + D18";
                //break;
            case 95:
                return calculator(value,2);
                //return "T19 + D19";
                //break;
            case 94:
                return calculator(value,2);
                //return "T18 + D20";
                //break;
            case 93:
                return calculator(value,2);
                //return "T19 + D18";
                //break;
            case 92:
                return calculator(value,2);
                //return "T20 + D16";
                //break;
            case 91:
                return calculator(value,2);
                //return "T17 + D20";
                //break;
            case 90:
                return calculator(value,2);
                //return "T18 + D18";
                //break;
                
            case 89:
                return calculator(value,2);
                //return "T19 + D16";
                //break;
            case 88:
                return calculator(value,2);
                //return "T16 + D20";
                //break;
            case 87:
                return calculator(value,2);
                //return "T17 + D18";
                //break;
            case 86:
                return calculator(value,2);
                //return "T18 + D16";
                //break;
            case 85:
                return calculator(value,2);
                //return "T15 + D20";
                //break;
            case 84:
                return calculator(value,2);
                //return "T16 + D18";
                //break;
            case 83:
                return calculator(value,2);
                //return "T17 + D16";
                //break;
            case 82:
                return calculator(value,2);
                //return "T14 + D20";
                //break;
            case 81:
                return calculator(value,2);
                //return "T15 + D18";
                //break;
            case 80:
                return calculator(value,2);
                //return "T16 + D16";
                //break;
                
            case 79:
                return calculator(value,2);
                //return "T13 + D20";
                //break;
            case 78:
                return calculator(value,2);
                //return "T18 + D12";
                //break;
            case 77:
                return calculator(value,2);
                //return "T15 + D16";
                //break;
            case 76:
                return calculator(value,2);
                //return "T20 + D8";
                //break;
            case 75:
                return calculator(value,2);
                //return "T13 + D18";
                //break;
            case 74:
                return calculator(value,2);
                //return "T14 + D16";
                //break;
            case 73:
                return calculator(value,2);
                //return "T19 + D8";
                //break;
            case 72:
                return calculator(value,2);
                //return "T16 + D12";
                //break;
            case 71:
                return calculator(value,2);
                //return "T13 + D16";
                //break;
            case 70:
                return calculator(value,2);
                //return "T18 + D8";
                //break;
                
            case 69:
                return calculator(value,2);
                //return "T19 + BULL";
                //break;
            case 68:
                return calculator(value,2);
                //return "T20 + D4";
                //break;
            case 67:
                return calculator(value,2);
                //return "T17 + D8";
                //break;
            case 66:
                return calculator(value,2);
                //return "T10 + D18";
                //break;
            case 65:
                return calculator(value,2);
                //return "T19 + D4";
                //break;
            case 64:
                return calculator(value,2);
                //return "T16 + D8";
                //break;
            case 63:
                return calculator(value,2);
                //return "T13 + D12";
                //break;
            case 62:
                return calculator(value,2);
                //return "T10 + D16";
                //break;
            case 61:
                return calculator(value,2);
                //return "T15 + T20";
                //break;
            case 60:
                return calculator(value,2);
                //return "20 + D20";
                //break;
                
            case 59:
                return calculator(value,2);
                //return "19 + D20";
                //break;
            case 58:
                return calculator(value,2);
                //return "18 + D20";
                //break;
            case 57:
                return calculator(value,2);
                //return "17 + D20";
                //break;
            case 56:
                return calculator(value,2);
                //return "16 + D20";
                //break;
            case 55:
                return calculator(value,2);
                //return "15 + D20";
                //break;
            case 54:
                return calculator(value,2);
                //return "14 + D20";
                //break;
            case 53:
                return calculator(value,2);
                //return "13 + D20";
                //break;
            case 52:
                return calculator(value,2);
                //return "12 + D20";
                //break;
            case 51:
                return calculator(value,2);
                //return "19 + D16";
                //break;
            case 50:
                return calculator(value,2);
                //return "10 + D20";
                //break;
                
            case 49:
                return calculator(value,2);
                //return "17 + D16";
                //break;
            case 48:
                return calculator(value,2);
                //return "16 + D16";
                //break;
            case 47:
                return calculator(value,2);
                //return "15 + D16";
                //break;
            case 46:
                return calculator(value,2);
                //return "6 + D20";
                //break;
            case 45:
                return calculator(value,2);
                //return "13 + D16";
                //break;
            case 44:
                return calculator(value,2);
                //return "12 + D16";
                //break;
            case 43:
                return calculator(value,2);
                //return "3 + D20";
                //break;
            case 42:
                return calculator(value,2);
                //return "10 + D16";
                //break;
            case 41:
                return calculator(value,2);
                //return "9 + D16";
                //break;
                
            default:
                return calculator(value,1);
                //return " You need Just a Double score!!";
            }   
        }
    }
    
    /**
     * 
     * @param score the score which be calculated
     * @param index the remained shoots
     * @return the hits tip
     */
    private String calculator2(int score,int index){
        int sh1=0;
        int sh2=0;
        String tip="";
        
        
        switch(index){
            
            case 2:
       // if((((score%2)==0) && (score<=40) || (score>1))){ //return the double value in the case is possible to finish just with a shoot
         //   String tmp=Integer.toString(score/2);
           // tip="D"+tmp;
        //} 
        //else 
            if(score==50) //consider a simple bull finishing
                tip="BULL";
        else { //if it needs 2 shoots to finish
            sh2=score; 
            while(sh2>40 && (sh2%2)!=0){
                sh2--;   // venus 1
                sh1=score-sh2; //and store to sh1 the remaining 
            }
                if(((sh1/2)+(sh2/2))==0){
                // if sh2>40 && (sh2%2)==0
                    //if((sh1%3)==0){
 //case 1
                    String tmp="D";
                        
                        tmp+=Integer.toString(sh1);
                        tmp+=" + D"+Integer.toString(sh2/2);
                        tip=tmp;
                }
                else
                if(((sh1/3)+(sh2/2))==0){
                        
                        String tmp="T";
                        
                        tmp+=Integer.toString(sh1);
                        tmp+=" + D"+Integer.toString(sh2/2);
                        tip=tmp;
                    }
                
                    //else{
                    //String tmp=Integer.toString(sh1);
                    //tmp+=" + D"+Integer.toString(sh2/2);
                  //  tip=tmp;
                   // }
        
               // }
                              
              
            }
                break;
            case 1:
                String tmp="D";
                tmp+=Integer.toString(score/2);
                tip=tmp;
                break;
        }
        return tip;
    }
    
    private String calculator(int score,int index){
        int sh1=0;
        int sh2=0;
        String tip="";
        
        
        switch(index){
            
            case 2:
                sh2=40;
                int remain=score-sh2;
                
                if(remain>60){
                    sh1=60;
                    int tmp=remain-sh1;
                    tip="T20 + "+tmp+" + D20";
                }
                else if(remain>50){
                    int tmp=remain-50;
                    tip="bull + "+tmp+" + D20";
                }
                else if(remain==50){
                    tip="BULL + D20";
                }
                else if(remain<50){
                    Random rand=new Random();
                    int ra=0;
                    int tmp=0;
                    do{
                    ra=rand.nextInt()%10;
                    tmp = remain-ra;
                        
                        sh1=tmp;
                    }while(tmp<=40 && sh1<=40 && (tmp%2)==0 && (sh1%2)==0);
                    ra/=2;
                    sh1/=2;
                    tip="D"+sh1+" + "+ra+" +D20";
                        /*
                        if(sh1<=20 && tmp<=20 || tmp!=25 && tmp!=0){
                            tip="D"+sh1+" + "+tmp+" +D20";
                        }
                        else if(sh1<=20 && tmp<=20 || tmp!=25 && tmp==0){
                            tip="D"+sh1+" + "+" + D20";
                        }
                        
                    }
                
                    else{
                        sh1=remain;
                        
                        int ra=rand.nextInt()*20;
                        sh1=sh1-ra;
                        
                        if(sh1<=20 && ra!=0){
                            tip="D"+sh1+" + "+ra+" +D20";
                        }
                        else if(sh1<=20 && ra==0){
                            tip="D"+sh1+" + "+" + D20";
                        }
                        
                    }
                }
                         * */
                         
                                 }
        
                else if(remain<20){
                    String tmp="D";
                    if((remain%2)==0){
                        tmp+=Integer.toString(remain/2);
                    }
                    else{
                        tmp=Integer.toString(remain);
                    }
                    tip=tmp+" + D20";
                
                }
                break;
            case 1:
                String tmp="D";
                tmp+=Integer.toString(score/2);
                tip=tmp;
                break;
        }
        return tip;
    }
        
    private String calculator3(int score,int index){
        int sh1=0;
        int sh2=0;
        String tip="";
        
        
        switch(index){
            
            case 2:
            if(score==50) //consider a simple bull finishing
                tip="BULL";
            else { //if it needs 2 shoots to finish
                sh1=score;
                if(sh1/2==score && (sh1%2)==0 && (sh1/2)<=20){
                    tip="D";
                    tip+=Integer.toString(sh1/2);
                }
                else if((sh1/2)<score && (sh1%2)==0 && (sh1/2)<20){
                    sh2=score-sh1;
                    if(sh2<=40){
                        tip="D";
                        tip+=Integer.toString(sh1/2)+" ";
                        tip+="D";
                        tip+=Integer.toString(sh2/2);
                    }
                    else{
                        tip="You can't finish!!";
                                
                    }
                }
                else{
                    if((sh1/3)<score && (sh1%3)==0 && (sh1/3)<20){
                         sh2=score-(sh1/3);
                    if(sh2<=40){
                        tip="T";
                        tip+=Integer.toString(sh1/2)+" ";
                        tip+="D";
                        tip+=Integer.toString(sh2/2);
                    }
                   
                    }
                }
           
              
            }
                break;
            case 1:
                String tmp="D";
                tmp+=Integer.toString(score/2);
                tip=tmp;
                break;
        }
        return tip;
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

    public void setDartsboard(ScoardField dartsboard) {
        darts = dartsboard;
    }
}
