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
    
     /**
   * This is the Default Constructor. 
   * 
   */
   
    Couple() {
    
    }
    
    
     /**
   * This is Constructor which takes following parameters.
   * @param B This is the first paramter to Couple Constructor.
   * @param G This is the second parameter to Couple Constructor.
   * .
   * 
   */ 
    
    Couple (String B,String G) {
     
        Boy = B;
        Girl = G;
    }
    
     /**
   * This method is used to add two integers. 
   * @param bh This is the first paramter to Happiness method
   * @param gh  This is the second parameter to Happiness method
   * 
   */
    
    
    
    public void Happiness (int bh,int gh) {
        
        Happiness = bh + gh;
        
    }
}
