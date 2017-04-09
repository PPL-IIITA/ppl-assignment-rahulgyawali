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
    
    Gift () {
        
    }
    
    Gift(int x,int y) {
        
        price = x;
        value = y;
    }
}

