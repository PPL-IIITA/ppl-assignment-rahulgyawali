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
public class GeeksBoy extends Boy {
    
     /**
   * This is the Default Constructor. 
   * 
   */
    
    
    GeeksBoy() {
                
    }
    
     /**
   * This is Constructor which takes following parameters.
   * @param name This is the first paramter to GeeksBoy Constructor.
   * @param pairedto This is the second parameter to GeeksBoy Constructor.
   * @param budget This is the third parameter to GeeksBoy Constructor.
   * 
   */ 
     
    
    GeeksBoy(String name,String pairedto ,String budget) {
        
        super(name,pairedto,budget);
    }
    
     /**
   * This Abstract method is used to find happiness of GeeksBoy.
   * @return double  This returns happiness of GeeksBoy.
   */
    
    @Override 
    
    public double happiness() {
        
        double x = 0.0;
        
        
        return x;
    }
}
