package ppl;

/**
 *
 * @author rahul
 * @since 2017-02-24
 */

import java.io.*;
import java.util.Random;

public class randGenerator {
    
  
    void randfilein(int ngirls,int nboys) throws IOException
    {
        BufferedWriter bw = null;
        
        File file = new File("boys.txt");
        
        if (!file.exists()) {
            
	     file.createNewFile();
	   }
        
        FileWriter fw = new FileWriter(file);
	    bw = new BufferedWriter(fw);
        
        Random r = new Random();
        int tmp;
        int i;
        String s;
        
        for(i = 0; i < nboys; i++)
        {
            s = "boy" + String.valueOf(i);
            bw.write(s);
            bw.write(",");
            
            s = "none";                     //paired to
            bw.write(s);
            bw.write(",");
            
            tmp = ((int)(Math.random()*10)+1);  //in
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
            
            tmp =  ((int)(Math.random()*10)+1);  //attr
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
            tmp =   ((int)(Math.random()*10))*4000 + 8000; //budget
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
          
            tmp = (r.nextInt(9-5) + 5);     //min attraction
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
                       
            int xs = r.nextInt(4 - 1) + 1;
         
            if (xs == 1) {
                
                bw.write("Miser"+ ",");
                
                bw.write("Handsome");
                
                
            } else if (xs == 3) {
               
                bw.write("Generous" + ",");
                
                bw.write("Average");
                
            } else if (xs == 2) {
                bw.write("Geeky" + ",");
                
                bw.write("Intelligence");
            }
             
            bw.newLine();
           
        }
        bw.close();
        
        file = new File("girls.txt");
        
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
            
            tmp = (int)(Math.random()*10)+1;                 //int
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
            tmp =   ((int)(Math.random()*10)+1);             //attr
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
            tmp =  (((int)(Math.random()*10))*4000 + 8000);     //budget
            s = String.valueOf(tmp);
            bw.write(s);
            bw.write(",");
            
           
            int xs = r.nextInt(4 - 1) + 1;
        
            
            if (xs == 1) {
                
                bw.write("Desperate");
                bw.write(",");
                bw.write("Average");
                
                
                        
            } else if (xs == 2) {
            
                bw.write("Choosy");
                bw.write(",");
                bw.write("Handsome");
                
                
                
            } else if (xs == 3) {
                
                bw.write("Normal");
                bw.write(",");
                bw.write("Intelligent");
                
                 
                 
            }
            
            bw.newLine();
        }
        bw.close();
    }
    
}
