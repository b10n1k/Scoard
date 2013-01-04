/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

import ScoardLib.ExtendedIntegerClassFunction;
import ScoardUI.ScoardField;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author j0ni
 */
public class Game {
    private boolean turn;
    private ExtendedIntegerClassFunction tbl;
    private HashMap<Integer,ExtendedIntegerClassFunction> tblindex=null;
    
    public Game(ScoardTeam t1, ScoardTeam t2, ScoardField darts) {
        teams=new Vector<ScoardTeam>();
        this.darts = darts;
        this.turn=true;
       
        create_tbls();
        register(t1); 
        register(t2);
    }

    public Game(ScoardField darts) {
        teams=new Vector<ScoardTeam>();
        this.turn=true;
        
        this.darts =darts;
                create_tbls();
        register(new ScoardTeam("player1",this.darts)); 
        register(new ScoardTeam("player2",this.darts));
    }
    
    public Game() {
        teams=new Vector<ScoardTeam>();
        this.turn=true;
        create_tbls();
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

    protected void create_tbls(){
        //working with sets
    //SetA array of multi by 2
        ArrayList<Integer> setBy2=new ArrayList<Integer>();
    
        for(int i=1;i<21;i++){
            setBy2.add(Integer.valueOf(i)*2);
            //{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40};
        }

    
    //SetA array of multi by 3
        ArrayList<Integer> setBy3=new ArrayList<Integer>();
    
        for(int i=1;i<21;i++){
            setBy3.add(Integer.valueOf(i)*3);    
        }
    
    //SetA array of common appearances
        ArrayList<Integer> setAB=new ArrayList<Integer>();
        
        for(Integer x:setBy2){
            for(Integer n:setBy3){
                if(x.compareTo(n)==0){
                    setAB.add(x);
            }
        }
    }
    
    
    //SetA array of common appearances
    HashSet<Integer> noset=new HashSet<Integer>();
    
    for(int i=1;i<60;i++){
            if(!setBy2.contains(Integer.valueOf(i)) && !setBy3.contains(i)){
                noset.add(i);        
        }
    }
    

    //An array of setA+setB combo from 
    tblindex=new HashMap<Integer,ExtendedIntegerClassFunction>();
    
        for(Integer b:setBy3){
            for(Integer a:setBy2){
                int key=a.intValue()+b.intValue();
              //  new ArrayInteger().setValues(a, b);// a b
                tblindex.put(new Integer(Integer.valueOf(key)),new ExtendedIntegerClassFunction(a,b)); //key(sum(a+b))-->values(a,b))
                
            }
        }
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
                return calcParse(calculator(value));
                //return "T20 + D19";
                //break;
            case 97:
                return calcParse(calculator(value));
                //return "T19 + D20";
                //break;
            case 96:
                return calcParse(calculator(value));
                //return "T20 + D18";
                //break;
            case 95:
                return calcParse(calculator(value));
                //return "T19 + D19";
                //break;
            case 94:
                return calcParse(calculator(value));
                //return "T18 + D20";
                //break;
            case 93:
                return calcParse(calculator(value));
                //return "T19 + D18";
                //break;
            case 92:
                return calcParse(calculator(value));
                //return "T20 + D16";
                //break;
            case 91:
                return calcParse(calculator(value));
                //return "T17 + D20";
                //break;
            case 90:
                return calcParse(calculator(value));
                //return "T18 + D18";
                //break;
                
            case 89:
                return calcParse(calculator(value));
                //return "T19 + D16";
                //break;
            case 88:
                return calcParse(calculator(value));
                //return "T16 + D20";
                //break;
            case 87:
                return calcParse(calculator(value));
                //return "T17 + D18";
                //break;
            case 86:
                return calcParse(calculator(value));
                //return "T18 + D16";
                //break;
            case 85:
                return calcParse(calculator(value));
                //return "T15 + D20";
                //break;
            case 84:
                return calcParse(calculator(value));
                //return "T16 + D18";
                //break;
            case 83:
                return calcParse(calculator(value));
                //return "T17 + D16";
                //break;
            case 82:
                return calcParse(calculator(value));
                //return "T14 + D20";
                //break;
            case 81:
                return calcParse(calculator(value));
                //return "T15 + D18";
                //break;
            case 80:
                return calcParse(calculator(value));
                //return "T16 + D16";
                //break;
                
            case 79:
                return calcParse(calculator(value));
                //return "T13 + D20";
                //break;
            case 78:
                return calcParse(calculator(value));
                //return "T18 + D12";
                //break;
            case 77:
                return calcParse(calculator(value));
                //return "T15 + D16";
                //break;
            case 76:
                return calcParse(calculator(value));
                //return "T20 + D8";
                //break;
            case 75:
                return calcParse(calculator(value));
                //return "T13 + D18";
                //break;
            case 74:
                return calcParse(calculator(value));
                //return "T14 + D16";
                //break;
            case 73:
                return calcParse(calculator(value));
                //return "T19 + D8";
                //break;
            case 72:
                return calcParse(calculator(value));
                //return "T16 + D12";
                //break;
            case 71:
                return calcParse(calculator(value));
                //return "T13 + D16";
                //break;
            case 70:
                return calcParse(calculator(value));
                //return "T18 + D8";
                //break;
                
            case 69:
                return calcParse(calculator(value));
                //return "T19 + BULL";
                //break;
            case 68:
                return calcParse(calculator(value));
                //return "T20 + D4";
                //break;
            case 67:
                return calcParse(calculator(value));
                //return "T17 + D8";
                //break;
            case 66:
                return calcParse(calculator(value));
                //return "T10 + D18";
                //break;
            case 65:
                return calcParse(calculator(value));
                //return "T19 + D4";
                //break;
            case 64:
                return calcParse(calculator(value));
                //return "T16 + D8";
                //break;
            case 63:
                return calcParse(calculator(value));
                //return "T13 + D12";
                //break;
            case 62:
                return calcParse(calculator(value));
                //return "T10 + D16";
                //break;
            case 61:
                return calcParse(calculator(value));
                //return "T15 + D20";
                //break;
            case 60:
                return calcParse(calculator(value));
                //return "20 + D20";
                //break;
                
            case 59:
                return calcParse(calculator(value));
                //return "19 + D20";
                //break;
            case 58:
                return calcParse(calculator(value));
                //return "18 + D20";
                //break;
            case 57:
                return calcParse(calculator(value));
                //return "17 + D20";
                //break;
            case 56:
                return calcParse(calculator(value));
                //return "16 + D20";
                //break;
            case 55:
                return calcParse(calculator(value));
                //return "15 + D20";
                //break;
            case 54:
                return calcParse(calculator(value));
                //return "14 + D20";
                //break;
            case 53:
                return calcParse(calculator(value));
                //return "13 + D20";
                //break;
            case 52:
                return calcParse(calculator(value));
                //return "12 + D20";
                //break;
            case 51:
                return calcParse(calculator(value));
                //return "19 + D16";
                //break;
            case 50:
                return calcParse(calculator(value));
                //return "10 + D20";
                //break;
                
            case 49:
                return calcParse(calculator(value));
                //return "17 + D16";
                //break;
            case 48:
                return calcParse(calculator(value));
                //return "16 + D16";
                //break;
            case 47:
                return calcParse(calculator(value));
                //return "15 + D16";
                //break;
            case 46:
                return calcParse(calculator(value));
                //return "6 + D20";
                //break;
            case 45:
                return calcParse(calculator(value));
                //return "13 + D16";
                //break;
            case 44:
                return calcParse(calculator(value));
                //return "12 + D16";
                //break;
            case 43:
                return calcParse(calculator(value));
                //return "3 + D20";
                //break;
            case 42:
                return calcParse(calculator(value));
                //return "10 + D16";
                //break;
            case 41:
                return calcParse(calculator(value));
                //return "9 + D16";
                //break;
                
            default:
                return "D"+(value/2);
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
      private ExtendedIntegerClassFunction calculator(int score){
          //TODO Give the standard hit row for the current score (in a table), and check if it s changed.
        //ArrayList<Integer> sa;
        //ArrayList<Integer> sb;
        Integer key=Integer.valueOf(score);
    
        //int[] points={90,89,87,86,85,84,83,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,25};
    //score
    
        if(tblindex.containsKey(key)){
            return tblindex.get(key);
        }
        
        return null;
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

    private String calcParse(ExtendedIntegerClassFunction hashvalues) {
        String da="D";
        String dd="D";
        String tt="T";
        String strvar1="";
        String strvar2="";
        String mes="";
        //ExtendedIntegerClassFunction values = tblindex.get(hashvalues);
        //System.out.println(">>>"+hashvalues.toString());
        int[] arr=hashvalues.parseValues();
        int var1=arr[1];
        //parse var1
        if(var1!=25 || var1!=50){
            if(var1<=40)
                strvar1="D"+Integer.toString(var1/2);
            else if(var1>40)
                strvar1="T"+Integer.toString(var1/3);
            else 
                strvar1=Integer.toString(var1);
        }
        else
            strvar1.concat(" or "+var1);
        int var2=arr[0];
        //parse var2
        
        if(var2!=25 || var2!=50){
            if(var2<=40)
                strvar2="D"+Integer.toString(var2/2);
            else if(var2>40)
                strvar2="T"+Integer.toString(var2/3);
            else 
                strvar2=Integer.toString(var2);
        }
        else
            strvar2.concat(" or "+var2);
        
        if(var1==0 )
            mes=strvar2;
        else
            if(var2==0)
                mes=strvar1;
        else
             if((var1+var2)<=40 && ((var1+var2)%2)==0)
                 mes="D"+Integer.toString((var1+var2)/2);
        else
                mes=strvar1+" "+strvar2;
        return mes;
    }   
}
