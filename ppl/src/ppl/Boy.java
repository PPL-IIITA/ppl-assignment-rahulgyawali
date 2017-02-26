
package ppl;
import java.lang.*;

public class Boy {
    
    String name;
    String pairedto;
    int intelligence;
    int attractiveness;
    int budget;
    int minattr;
    String type;
    String xfactor; 
    
    Boy() {
        
    }
    
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
