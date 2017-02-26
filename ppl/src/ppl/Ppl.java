package ppl;

import java.util.Random;
import java.io.*;
import java.lang.*;

public class Ppl {

   
    public static void main(String[] args) throws IOException{
         
        randGenerator h = new randGenerator();
        h.randfilein(10,50);
        
        Init i = new Init();
        Init j = new Init();
        
        Boy[] boy = i.BoysInitial();
        Girl[] girl = j.GirlsInitial();
        
        
        pairup p = new pairup();
        p.pair(boy, girl);
        
        
        
    }
    
    
}
