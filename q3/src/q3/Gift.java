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
    
    Gift() {
        
    }
    
    Gift(int p,int v) {
        
        price = p;
        value = v;
    }
}
