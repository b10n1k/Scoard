/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardLib;

/**
 *
 * @author j0ni
 */
public class ExtendedIntegerClassFunction {
    private Integer a;
    private Integer b;
    private Integer[] array;
    
    public ExtendedIntegerClassFunction(int a, int b){
        this.array=new Integer[2];
        this.a=Integer.valueOf(a);
        this.b=Integer.valueOf(b);
    }
    
     public ExtendedIntegerClassFunction(Integer a, Integer b){
        this.array=new Integer[2];
        this.a=a;
        this.b=b;
    }
    
    public void setValues(Integer a, Integer b){
        this.array[0]=a;this.array[1]=b;
    }
    
    public Integer[] getValues(){
        return this.array;
    }
    
    public int[] parseValues(){
        int[] arr=new int[2];
        arr[0]=a.intValue();
        arr[1]=b.intValue();
        return arr;
    }
    
    
    public String toString(){
        int[] totext=parseValues();
        return totext[0]+" "+totext[1];
    }
}
