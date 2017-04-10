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
abstract public class Boy {
    String name;
    String pairedto;
    int intelligence;
    int attractiveness;
    int budget;
    int spent;
    int left;
    int min;

    
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
   * @param a This is the fourth parameter to Boy Constructor.
   * @param m This is thw fifth parameter to Boy Constructor.
   * 
   */ 
     
     
    Boy (String n,String p,String b,String i,String a, String m) {
        
        name = n;
        pairedto = p;
        spent = 0;
        left = 0;
        budget = Integer.parseInt(b);
        intelligence = Integer.parseInt(i);
        attractiveness = Integer.parseInt(a);
        min = Integer.parseInt(m);
    }
      
    /**
   * This Abstract method is used to find happiness of Boy.
   * @return double  This returns happiness of Boy.
   */
     abstract public double happiness(); 
}
