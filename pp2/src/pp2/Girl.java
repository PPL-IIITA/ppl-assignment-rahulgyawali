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

public class Girl {
    
    String name;
    String type;
    String pairto;
    int mBudget;
    int luxcount;
    int luxvalue;
    int left;
    int over;
    int taken;
    
    
    Girl ()  {
        
        
    }
    
    
    Girl (String n,String ty, String p,int m,int o,int t) {
        
        name = n;
        type = ty;
        pairto = p;
        mBudget = m;
        luxcount = 0;
        luxvalue = 0;
        left = m;
        over = 0;
        taken = 0;
    }
    
}
