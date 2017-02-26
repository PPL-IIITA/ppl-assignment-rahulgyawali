/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;


/**
 *
 * @author rahul
 * @since 2017-02-24
 */

public class Gift {
    
    int type;   
    int price;
    int value;
    
    /**
     * This is Constructor for Gift() 
     * 
     */
    Gift() {
        
        type = 1;
        price = 0;
        value = 0;
    }
    
    /**
     * This is Another constructor for Gift() 
     * @param int pr This is the first paramter to Gift Constructor
     * @param int p  This is the second paramter to Gift Constructor
     * @param int q  This is the third paramter to Gift Constructor
     */
    
    Gift (int pr,int p ,int q) {    
        
        type = pr;
        price = p;
        value = q;
    }
    
}
