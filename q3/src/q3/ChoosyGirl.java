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
public class ChoosyGirl extends Girl {
    
    /**
   * This is the Default Constructor. 
   * 
   */
    
     ChoosyGirl() {
                
    }
    
     /**
   * This is Constructor which takes following parameters.
   * @param name This is the first paramter to ChoosyGirl Constructor.
   * @param pairedto This is the second parameter to ChoosyGirl Constructor.
   * @param intelligence This is the third parameter to ChoosyGirl Constructor.
   * @param MBudgets This is the fourth parameter to ChoosyGirl Constructor.
   * 
   */
     
    ChoosyGirl(String name,String pairedto,String intelligence,String MBudget) {
        super(name,pairedto,intelligence,MBudget);
    }
    
     /**
   * This method is used to calculate happiness of ChoosyGirl.
   * @return double This returns happiness of ChoosyGirl.
   */
    
    
    @Override 
    
    public double happiness() {
        
        double x = 0.0;
        
        
        return x;
    }
    
    
    
}
