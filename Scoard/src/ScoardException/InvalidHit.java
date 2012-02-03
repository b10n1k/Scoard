/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardException;

/**
 *
 * @author j0ni
 */
public class InvalidHit extends Exception{

    public InvalidHit(String message) {
        super(message);
    }

    public InvalidHit() {
    }
    
    private String errmsg="";
    
}
