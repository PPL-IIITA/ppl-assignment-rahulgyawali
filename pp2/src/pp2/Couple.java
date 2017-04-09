/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rahul
 * @since 2017-02-24
 */

public class Couple {
    String boy;
    String girl;
    int m;
    int bd;
    String btype;
    String gtype;
    int lc;
    int lv;
    int spend;
    double hp;
    double ghp;
    double bhp;
    int extra;
    int in;
    
    Couple () {
        
        
    }
    
    
    Couple (String a,String b,String c,String d,String e,String y,String k) {
        
        boy = a;
        girl = b;
        m = Integer.parseInt(c);
        bd = Integer.parseInt(d);
        btype = e;
        gtype = y;
        lc  = 0; 
        lv  =   0;
        spend = 0;
        hp = 0.0;
        extra = 0;
        bhp = 0.0;
        ghp = 0.0;
        in = Integer.parseInt(k);
    }

    /**<p> Xcouple assigns Value to Array of Object Couple</p>
     * This method is used to assign Couple array with their attributes 
    * @return Couple[]
   */
    
    
    
    Couple[] xcouple ( ) throws IOException {
      
      Couple [] arr = new Couple[10];  
      int i;
      
      
      FileInputStream fstream = new FileInputStream("../ppl/couple.txt");
      DataInputStream in = new DataInputStream(fstream);
      BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
      String strLine1 = "";
     
      for (i = 0; i < 10; i++) {
          
          arr[i] = new Couple();
      }
      
      
      for (i = 0; i < 10; i++) {
      
        strLine1 = br.readLine();
          
        
        String tokens [] = strLine1.split(",");
        
        String bo = tokens[0];
        String k = tokens[1];
        String gl = tokens[4];
        String by = tokens[3];
        String ss = (tokens[5]);
        String hj = tokens[7];
        String pp = tokens[8];
         
        arr[i] = new Couple(bo,gl,ss,k,by,hj,pp);
            
         
      }
      
      in.close();
      
      return arr;
      
  }
    
    
       
    
}
