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

public class Boy {
    
    String name;
    String type;
    String pairto;
    int Budget;
    int left;
    int given;
    
    Boy() {
        
        
    }
    
    Boy (String n,String t,String p,int b,int g) {
        
        name = n;
        type = t;
        pairto = p;
        Budget = b;
        left = b;
        given = 0;
        
    }
}
