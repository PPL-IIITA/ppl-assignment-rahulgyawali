/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.*;
import java.io.*;

/**
 *
 * @author rahul
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Couple x = new Couple();
        ArrayList<Couple> c = x.xcouple();
        
        GiftDistribute g =  new GiftDistribute();
        ArrayList<Gift> Gifts = g.Gen();
        
        g.Distribute(c,Gifts);
        
    }
    
}
