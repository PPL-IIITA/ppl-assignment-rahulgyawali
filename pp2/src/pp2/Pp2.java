/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;
import java.util.Scanner;

/**
 *
 * @author rahul
 * @since 2017-02-24
 */

public class Pp2 {

    /**
     * This is the main method that calls other classes and modules inside them
     * @return void
     */
    
    public static void main(String[] args)throws Exception {
          
        GiftGenerator g = new GiftGenerator();
        Gift[] G = g.GiftGen();
         
        Couple x = new Couple();
        Couple[] v = x.xcouple();
        
        Gifting l =  new Gifting();
        v  = l.Exchange(v,G);
        
        int k ;
        Scanner s = new Scanner(System.in);
        k = s.nextInt();
        
        Happiness j =  new Happiness();
        j.cal(v,k);
    }
    
}
