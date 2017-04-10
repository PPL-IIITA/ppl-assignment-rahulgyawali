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
public class MiserBoy extends Boy{
    
    /**
   * This is the Default Constructor. 
   * 
   */
    
    MiserBoy() {
                
    }
    
     /**
   * This is Constructor which takes following parameters.
   * @param name This is the first paramter to MiserBoy Constructor.
   * @param pairedto This is the second parameter to MiserBoy Constructor.
   * @param budget This is the third parameter to MiserBoy Constructor.
   * 
   */
    
    MiserBoy(String name,String pairedto ,String budget) {
        
        super(name,pairedto,budget);
    }
    
    /**
   * This Abstract method is used to find happiness of MiserBoy.
   * @return double  This returns happiness of MiserBoy.
   */
    
    @Override 
    
    public double happiness() {
        
        double x = 0.0;
        
        
        return x;
    }
    
}
