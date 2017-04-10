/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author rahul
 */
abstract public class Girl {
    
    String name;
    String pairedto;
    int intelligence;
    
    int mBudget; 
    
    /**
   * This is the Default Constructor. 
   * 
   */
    
     Girl() {
        
    }
    /**
   * This is Constructor which takes following parameters.
   * @param n This is the first paramter to Girl Constructor.
   * @param p This is the second parameter to Girl Constructor.
   * @param i This is the third parameter to Girl Constructor.
   * @param b This is the fourth parameter to Girl Constructor.
   * 
   */ 
     
    Girl(String n,String p,String i,String b) {
        
        name = n;
        pairedto = p;
        intelligence = Integer.parseInt(i);
        
        mBudget = Integer.parseInt(b); 
        
        
    }
    /**
   * This Abstract method is used to find happiness of Girl.
   * @return double  This returns happiness of Girl.
   */
    
    abstract public double happiness();
}
