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

    /**
   * This is the Default Constructor. 
   * 
   */
    
    
     Boy() {
        
    }
     
    /**
   * This is Constructor which takes following parameters.
   * @param n This is the first paramter to Boy Constructor.
   * @param p This is the second parameter to Boy Constructor.
   * @param b This is the third parameter to Boy Constructor.
   * 
   */ 
     
     
    Boy (String n,String p,String b) {
        
        name = n;
        pairedto = p;
        spent = 0;
        left = 0;
        budget = Integer.parseInt(b);
        
        
    }
    /**
   * This Abstract method is used to find happiness of Boy.
   * @return double  This returns happiness of Boy.
   */
      
     abstract public double happiness(); 
    
}
