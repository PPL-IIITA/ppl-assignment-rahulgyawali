/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rahul
 */




public class Randomx {
   
    
    /**
     * This Method randomly Generates Boys.txt and Girl.txt Files.
     * @param ngirls This is the first parameter i.e. no. of boys
     * @param nboys This is the second parameter i.e. no. of girls
     * @throws IOException 
     */
    public void Randfilein(int ngirls,int nboys) throws IOException
    {
        BufferedWriter bw = null;
        
        File file = new File("Boys.txt");
        
        if (!file.exists()) {
            
	     file.createNewFile();
	   }
        
        FileWriter fw = new FileWriter(file);
	bw = new BufferedWriter(fw);
        
        java.util.Random r = new java.util.Random();
        int tmp;
        int i;
        String s;
        
        for(i = 0; i < nboys; i++)
        {
            s = "boy" + String.valueOf(i);
            bw.write(s);
            bw.write(",");
            
            s = "none";                     
            bw.write(s);
            bw.write(",");
            
            tmp = ((int)(Math.random()*10)+1);  
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
            
            tmp =  ((int)(Math.random()*10)+1);  
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
            tmp =   ((int)(Math.random()*10))*4000 + 5000; 
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
            tmp =   ((int)(Math.random()*10)+1); 
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
             int xs = r.nextInt(4 - 1) + 1;
         
            if (xs == 1) {
                
                bw.write("Miser");
                       
                
            } else if (xs == 3) {
               
                bw.write("Generous");
                
                
            } else if (xs == 2) {
                
                bw.write("Geeky");
                
            }
          
            
            bw.newLine();
           
        }
        
        bw.close();
        
        file = new File("Girls.txt");
        
        if (!file.exists()) {

	       file.createNewFile();
           
	    }
        
        fw = new FileWriter(file);
	bw = new BufferedWriter(fw);
        
        for(i = 0;i < ngirls;i++)
        {
            s = "girl" + String.valueOf(i);
            bw.write(s);
            bw.write(",");
            
            
            s = "none";
            bw.write(s);
            bw.write(",");
            
            tmp = (int)(Math.random()*10)+1;                 
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
            tmp =   ((int)(Math.random()*10)+1);             
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
            tmp =  (((int)(Math.random()*10))*4000 + 5000);    
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
           
            int xs = r.nextInt(4 - 1) + 1;
        
            
            if (xs == 1) {
                
                bw.write("Desperate");
                        
            } else if (xs == 2) {
            
                bw.write("Choosy");
          
                
            } else if (xs == 3) {
                
                bw.write("Normal");
               
            }
          
            bw.newLine();
        }
        bw.close();
    }
    
}

    



