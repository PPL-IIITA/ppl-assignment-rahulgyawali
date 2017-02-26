
package ppl;
import java.lang.*;

/**
 *
 * @author rahul
 * @since 2017-02-24
 */

public class Boy {
    
    String name;
    String pairedto;
    int intelligence;
    int attractiveness;
    int budget;
    int minattr;
    String type;
    String xfactor; 
    
    
    /**
     * <p> This is constructor for Boy(). </p>
     * 
     * 
     * 
     * 
    */
    
    Boy() {
        
    }
    
    /**
     * <p> This is constructor for Boy(). </p>
     * @param n is first argument sent to Constructor Boy()
     * @param p is  argument sent to Constructor Boy()
     * @param i is argument  sent to Constructor Boy()
     * @param a is argument  sent to Constructor Boy()
     * @param b is argument  sent to Constructor Boy()
     * @param m is argument  sent to Constructor Boy()
     * @param t is argument sent to Constructor Boy()
     * @param xr is name sent to Constructor Boy()
     */
    
    
    
    
    Boy (String n,String p,String i,String a,String b,String m,String t,String xr) {
        
        name = n;
        pairedto = p;
        intelligence = Integer.parseInt(i);
        attractiveness = Integer.parseInt(a);
        budget = Integer.parseInt(b);
        minattr = Integer.parseInt(m);
        type = t;
        xfactor = xr;
        
    }
    
    
}
