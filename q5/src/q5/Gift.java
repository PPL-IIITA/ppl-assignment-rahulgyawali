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
abstract public class Gift {
    
    int price;
    int value;
    
    /**
   * This is the Default Constructor. 
   * 
   */
    
    
    Gift () {
        
    }
    
    /**
   * This is Constructor which takes following parameters.
   * @param x This is the first paramter to Boy Constructor.
   * @param y This is the second parameter to Boy Constructor.
   */ 
    
    Gift(int x,int y) {
        
        price = x;
        value = y;
    }
}

