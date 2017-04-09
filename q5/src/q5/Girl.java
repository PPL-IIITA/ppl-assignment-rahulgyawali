/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author rahul
 */
abstract public class Girl {
    String name;
    String pairedto;
    int intelligence;
    int attractiveness;
    int mBudget; 
    
    
     Girl() {
        
    }
    
     
    Girl(String n,String p,String i,String a,String b) {
        
        name = n;
        pairedto = p;
        intelligence = Integer.parseInt(i);
        attractiveness = Integer.parseInt(a);
        mBudget = Integer.parseInt(b); 
        
        
    }
    
    abstract public double happiness();
    
}
