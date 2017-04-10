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
public class DesperateGirl extends Girl{
    
    /**
   * This is the Default Constructor. 
   * 
   */
    
      DesperateGirl() {
                
    }
    
     
      /**
   * This is Constructor which takes following parameters.
   * @param name This is the first paramter to DesperateGirl Constructor.
   * @param pairedto This is the second parameter to DesperateGirl Constructor.
   * @param intelligence This is the third parameter to DesperateGirl Constructor.
   * @param attractiveness This is the fourth paramter to DesperateGirl Constructor.
   * @param MBudgets This is the fifth parameter to DesperateGirl Constructor.
   * 
   */ 
      
    DesperateGirl(String name,String pairedto,String intelligence,String attractiveness,String MBudget) {
        super(name,pairedto,intelligence,attractiveness,MBudget);
    }
    
    /**
   * This method is used to calculate happiness of DesperateGirl.
   * @return double This returns happiness of DesperateGirl.
   */
    
    @Override 
    
    public double happiness() {
        
        double x = 0.0;
        
        
        return x;
    }
    
}
