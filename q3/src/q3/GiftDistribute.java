/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;
import java.io.*;
import java.util.*;


public class GiftDistribute {
    
     public ArrayList<Gift> Gen () {
        
        ArrayList<Gift> arr = new ArrayList<Gift>();
        
        int i;
        int temp;
        int m;
        int n;
        Random x = new Random();
        
        for (i = 0; i < 300; i++) {
            
            temp = (x.nextInt(4-1) + 1);
            
            if (temp == 1) {
              
                m = ((int)(Math.random()*10))*400 + 3500;
                n = 8;
                arr.add(new UtilityGift(m,n));
                
            }else if (temp == 2) {
                
                m = ((int)(Math.random()*10))*400 + 4000;
                n = 10;
                arr.add(new LuxuryGift(m,n));
                 
            }else if (temp == 3) {
                
                m = ((int)(Math.random()*10))*400 + 3000;
                n = 8;
                arr.add(new EssentialGift(m,n));
                
                
            }
            
        }
        return arr;
    }  
    
     public void Distribute (ArrayList<Couple> c,ArrayList<Gift> g) {
         
         int i;
         String y;
         int s = 0;
         
         for (i = 0; i < c.size(); i++) {
            
            y = c.get(i).BType;
            
            
            if ("Generous" == y) {
                
                if ((c.get(i).spent <= c.get(i).Budget)) {
                    
                    if (c.get(i).spent <= c.get(i).Maintenance) {
                    
             
                        c.get(i).spent = c.get(i).spent +g.get(s).price;
                        s++;
                    
                    }
                    
                }
                
            }else if ("Miser" == y) {
            
                if (c.get(i).spent <= c.get(i).Maintenance) {
                    
                    c.get(i).spent = c.get(i).spent +g.get(s).price;
                    s++;
                }
                
                
            }else if ("Geeky" == y) {
                
                if (c.get(i).spent <= c.get(i).Maintenance) {
            
                    c.get(i).spent = c.get(i).spent +g.get(s).price;
                    s++;
                }
            } 
            
          }
        
         
         
         
     }
     
}
