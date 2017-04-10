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
public class GenerousBoy extends Boy{
    /**
   * This is the Default Constructor. 
   * 
   */
    
    GenerousBoy() {
                
    }
    
     /**
   * This is Constructor which takes following parameters.
   * @param name This is the first paramter to GenerousBoy Constructor.
   * @param pairedto This is the second parameter to GenerousBoy Constructor.
   * @param budget This is the third parameter to Boy GenerousConstructor.
   * 
   */
    
    
    GenerousBoy(String name,String pairedto ,String budget) {
        
        super(name,pairedto,budget);
    }
    /**
   * This Abstract method is used to find happiness of GenerousBoy.
   * @return double  This returns happiness of MiserBoy.
   */
    
    @Override 
    
    public double happiness() {
        
        double x = 0.0;
        
        
        return x;
    }
}