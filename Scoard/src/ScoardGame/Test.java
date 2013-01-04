/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoardGame;

/**
 *
 * @author j0ni
 */
public class Test {
    private void calculator(int score){
        int sh1=0;
        int sh2=20;
        
        int nums[]={score,0,0};
        
        int sval=0;
        //int rem=score-(sh2*2);
        if(score>60){
            System.out.println("if(score>60)\n");
            int val=score;
        
        while((sh1*3+sh2*2)!=score && sh2>=0 && sh2<=20){ 
            System.out.println("while((sh1*3+sh2*2)!=score)\n");
            //pattern Tx + Dy
            if((sh2%2)==0){
                sh1=0;
                System.out.println("if((sh2%2)==0)\n");
               
               while(sh1<20){
                   if((sh1%3)==0){
                   System.out.println("if/while((sh1%3)==0)\n");
                    sval=sh1*3 + sh2*2;
                    
                        if((val-sval)!=0){
                            System.out.println("if((val-sval)!=0)\n");
                            sh1++;
                            System.out.println("sh1="+sh1);
                        }
                        else if((val-sval)==0){
                            System.out.println("else if((val-sval)==0)\n");
                            nums[1]=sh1;
                            nums[2]=sh2;
                        }
                    }
               
               else{
                   sh1++;
                        System.out.println(" else: sh1="+sh1);
               }
               }
                sh2--;
                System.out.println("sh2="+sh2);
                }
            else{
                sh2--;
                System.out.println("else: sh2="+sh2);
            }
            
                System.out.println("end while\n");
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>"+nums[1]+" "+nums[2]);
    }
    
   // public static void main(String[] args){
     //   new Test().calculator(80);
   // }
}
