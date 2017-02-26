
package ppl;


public class Girl {
    
    String name;
    String pairedto;
    int intelligence;
    int attractiveness;
    int mBudget;  
    String type;
    String pref;
    
    Girl() {
        
    }
    
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
