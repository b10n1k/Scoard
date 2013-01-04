/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardException;

import java.io.IOException;

/**
 *
 * @author j0ni
 */
public class TextFormatException extends RuntimeException{
    /**
     * Constructs a <code>TextFormatException</code> with no detail message.
     */
    public TextFormatException () {
	super();
       
    }

    /**
     * Constructs a <code>TextFormatException</code> with the 
     * specified detail message. 
     *
     * @param   s   the detail message.
     */
    public TextFormatException (String s) {
	super (s);
    }

    /**
     * Factory method for making a <code>TextFormatException</code>
     * given the specified input which caused the error.
     *
     * @param   s   the input causing the error
     */
    static TextFormatException forInputString(String s) {
        return new TextFormatException("For input string: \"" + s + "\"");
    }
    
    private void testString(){
        
    }
}
