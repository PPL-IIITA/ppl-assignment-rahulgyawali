package ppl;

import java.util.Random;
import java.io.*;

public class Ppl {

   
    public static void main(String[] args) throws IOException{
         
        randGenerator h = new randGenerator();
        h.randfilein(10,20);
        
        Init i = new Init();
        Boy[] boy = i.BoysInitial();
        Girl[] girl = i.GirlsInitial();
        
        
        pairup p = new pairup();
        p.pair(boy, girl);
        
        
        
    }
    
    
}
