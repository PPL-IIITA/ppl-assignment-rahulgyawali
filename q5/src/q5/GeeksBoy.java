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
   * @param pairedto This is the second paramter to GeeksBoy Constructor.
   * @param MBudget This is the third paramter to GeeksBoy Constructor.
   * @param intelligence This is the fourth paramter to GeeksBoy Constructor.
   * @param attractiveness This is the fifth paramter to GeeksBoy Constructor.
   * @param min This is the sixth paramter to GeeksBoy Constructor.
   */
       
    GeeksBoy (String name,String pairedto,String MBudget,String intelligence,String attractiveness,String min) {
        super(name,pairedto,MBudget,intelligence,attractiveness,min);
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
