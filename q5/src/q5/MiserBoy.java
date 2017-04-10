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
   * @param MBudget This is the third parameter to MiserBoy Constructor.
   * @param intelligence This is the fourth paramter to MiserBoy Constructor.
   * @param attractiveness This is the fifth paramter to MiserBoy Constructor.
   * @param m  This is the sixth paramter to MiserBoy Constructor.
   */    
        
    MiserBoy (String name,String pairedto,String MBudget,String intelligence,String attractiveness,String m) {
        super(name,pairedto,MBudget,intelligence,attractiveness,m);
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
