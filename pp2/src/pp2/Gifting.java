/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;
import java.io.*;
/**
 *
 * @author rahul
 * @since 2017-02-24
 */

public class Gifting {

    /**
   * This method is used to assign gifts to various couples depending upon their type 
   * @param Couple[] v This is the first paramter to Exchange method
   * @param Gift[] GThis is the second parameter to Exchange method
   * @return Couple[]
   */
    
    
    
    Couple[] Exchange (Couple[] v,Gift[] G) throws IOException{
        
      
        int i;
        String y;
        int s = 0;
        int e = 99;
        
        for (i = 0; i < 10; i++) {
            
            y = v[i].btype;
            
            
            if ("Generous" == y) {
                
                if ((v[i].spend <= v[i].bd)) {
                    
                    if (v[i].spend <= v[i].m) {
                    
                        v[i].lc = v[i].lc + 1;
                        v[i].lv = v[i].lv + G[e].price;
                        v[i].spend = v[i].spend +G[e].price;
                        e--;
                    
                   }else {
                        
                        v[i].lc = v[i].lc + 1;
                        v[i].lv = v[i].lv + G[e].price;
                        v[i].spend = v[i].spend +G[e].price;
                        v[i].extra = v[i].extra + G[e].price;
                        e--;
                        
                        
                   }
                    
                }
                
            }else if ("Miser" == y) {
            
                if (v[i].spend <= v[i].m) {
                    
                    v[i].spend = v[i].spend + G[s].price;
                    s++;
                }
                
                
            }else if ("Geeky" == y) {
                
                if (v[i].spend <= v[i].m) {
            
                    v[i].spend = v[i].spend + G[s].price;
                    s++;
                }else {
                    
                    v[i].spend = v[i].spend + G[e].price;
                    v[i].extra = v[i].extra + G[e].price;
                    
                }   
           }
        
        
        
        }

    return v;
}

}