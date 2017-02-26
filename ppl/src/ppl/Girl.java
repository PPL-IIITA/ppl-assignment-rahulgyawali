
package ppl;

/**
 *
 * @author rahul
 * @since 2017-02-24
 */


public class Girl {
    
    String name;
    String pairedto;
    int intelligence;
    int attractiveness;
    int mBudget;  
    String type;
    String pref;
    
    /**
     * <p> This is constructor for Girl() </p> 
     */
    
    Girl() {
        
    }
    
    /**
     * <p>This is constructor for Girl() </p>
     * @param n
     * @param p
     * @param i
     * @param a
     * @param b
     * @param t
     * @param pr 
     */
    
    
    Girl(String n,String p,String i,String a,String b,String t,String pr) {
        
        name = n;
        pairedto = p;
        intelligence = Integer.parseInt(i);
        attractiveness = Integer.parseInt(a);
        mBudget = Integer.parseInt(b); 
        type = t;
        pref = pr;
        
    }
    
}
