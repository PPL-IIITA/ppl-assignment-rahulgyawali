/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;


/**
 *
 * @author rahul
 */

public class Gift {
    
    int type;   //3 for Luxury , 2 for Utility , 1 for Essential
    int price;
    int value;
    
    Gift() {
        
        type = 1;
        price = 0;
        value = 0;
    }
    
    Gift (int pr,int p ,int q) {    
        
        type = pr;
        price = p;
        value = q;
    }
    
}
