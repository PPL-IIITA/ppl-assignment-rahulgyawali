/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author rahul
 */

public class Couple {
    
    String Boy;
    String Girl;
    String BType;
    String GType;
    int Budget;
    int Maintenance;
    int Happiness;
    int compatibility;
    int spent;
    int extra;
    int left;
   
    Couple() {
    
    }
    
    Couple (String B,String G,String x,String y,String Bx,String Gx) {
     
        Boy = B;
        Girl = G;
        Budget = Integer.parseInt(x);
        Maintenance = Integer.parseInt(y);
        BType = Bx;
        GType = Gx;
        spent = 0;
        left = Budget;
        extra = 0;
    }
    
    public void Happiness (int bh,int gh) {
        
        Happiness = bh + gh;
        
    }
    
      
    ArrayList <Couple> xcouple ( ) throws IOException {
      
      ArrayList<Couple> C = new ArrayList<>();  
      int i;
      
      
      FileInputStream fstream = new FileInputStream("../ppl/couple.txt");
      DataInputStream in = new DataInputStream(fstream);
      BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
      String strLine1 = "";
     
      
      
      for (i = 0; i < 10; i++) {
      
        strLine1 = br.readLine();
          
        
        String tokens [] = strLine1.split(",");
        
        String bo = tokens[0];
        String k = tokens[1];
        String gl = tokens[2];
        String bt = tokens[3];
        String ss = (tokens[5]);
        String gt = tokens[7];
        
        C.add(new Couple (bo,gl,k,ss,bt,gt));
         
      }
      
      in.close();
      
      return C;
    
    
    }
    
}
