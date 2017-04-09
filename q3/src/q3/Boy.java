/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;
import java.util.*;
/**
 *
 * @author rahul
 */
abstract public class Boy {
    String name;
    String pairedto;
    int budget;
    int spent;
    int left;

     Boy() {
        
    }
     
    Boy (String n,String p,String b) {
        
        name = n;
        pairedto = p;
        spent = 0;
        left = 0;
        budget = Integer.parseInt(b);
        
        
    }
      
     abstract public double happiness(); 
    
}
