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
abstract public class Gift {
    
    int price;
    int value;
    
     /**
   * This is the Default Constructor. 
   * 
   */
    
    
    Gift() {
        
    }
    
    /**
   * This is Constructor which takes following parameters.
   * @param p This is the first paramter to Boy Constructor.
   * @param v This is the second parameter to Boy Constructor.
   */ 
    
    Gift(int p,int v) {
        
        price = p;
        value = v;
    }
}
