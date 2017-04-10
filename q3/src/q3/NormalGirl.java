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
public class NormalGirl extends Girl{
    
     
    /**
   * This is the Default Constructor. 
   * 
   */
    NormalGirl() {
                
    }
    
       /**
   * This is Constructor which takes following parameters.
   * @param name This is the first paramter to NormalGirl Constructor.
   * @param pairedto This is the second parameter to NormalGirl Constructor.
   * @param intelligence This is the third parameter to NormalGirl Constructor.
   * @param MBudgets This is the fourth parameter to NormalGirl Constructor.
   * 
   */
    
    NormalGirl(String name,String pairedto,String intelligence,String MBudget) {
        super(name,pairedto,intelligence,MBudget);
    }
    
    /**
   * This method is used to calculate happiness of NormalGirl.
   * @return double This returns happiness of NormalGirl.
   */
    
    @Override 
    
    public double happiness() {
        
        double x = 0.0;
        
        
        return x;
    }
    
    
}
