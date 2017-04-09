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

public class Couple {
    String Boy;
    String Girl;
    int Happiness;
    int compatibility;
   
    Couple() {
    
    }
    
    Couple (String B,String G) {
     
        Boy = B;
        Girl = G;
    }
    
    public void Happiness (int bh,int gh) {
        
        Happiness = bh + gh;
        
    }
}
