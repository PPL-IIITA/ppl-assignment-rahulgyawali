package ppl;

/**
 *
 * @author rahul
 * @since 2017-02-24
 */

import java.util.Random;
import java.io.*;
import java.lang.*;



public class Ppl {

    /**
     * This is the main method that calls other classes and modules inside them
     * @return void
     */
   
    public static void main(String[] args) throws IOException{
         
        randGenerator h = new randGenerator();
        h.randfilein(30,50);
        
        Init i = new Init();
        Init j = new Init();
        
        Boy[] boy = i.BoysInitial();
        Girl[] girl = j.GirlsInitial();
        
        
        pairup p = new pairup();
        p.pair(boy, girl);
        
        
        
    }
    
    
}
