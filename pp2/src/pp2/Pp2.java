/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;

/**
 *
 * @author rahul
 */
public class Pp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        
        
        
        
         GiftGenerator g = new GiftGenerator();
         Gift[] G = g.GiftGen();
         
         Gifting x =  new Gifting();
         x.Exchange(G, boy, girl);
    }
    
}
