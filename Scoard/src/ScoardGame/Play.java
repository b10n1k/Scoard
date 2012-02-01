/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

import ScoardUI.ScoardField;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author j0ni
 */
public class Play implements Runnable{

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private synchronized int play(){
        while(enableToPlay=true){
            try {
                wait();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i=0;i<3;i++){
                    points[i]=getShoot();
            }
        }
        notifyAll();
        return x;
        
    }
    
    private int getShoot() {
        return ScoardField.getValue();
    }
    
    int[] points=new int[3];

}
