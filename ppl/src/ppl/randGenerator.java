package ppl;

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
        
        for(i = 0;i < nboys;i++)
        {
            s = "boy" + String.valueOf(i);
            bw.write(s);
            bw.newLine();
            
            s = "x";                     //paired to
            bw.write(s);
            bw.newLine();
            
            tmp = ((int)(Math.random()*10)+1);  //in
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            
            
            tmp =  ((int)(Math.random()*10)+1);  //attr
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            
            tmp =   ((int)(Math.random()*10))*4000 + 10000; //budget
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            
            
            
            tmp = (r.nextInt(9-5) + 5);     //min attraction
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
                       
            s = String.valueOf(r.nextInt(4 - 1) + 1);
         
            if (s == String.valueOf(1)) {
             
                bw.write("Geeky");
                bw.newLine();
                bw.write("Intelligence");
                bw.newLine();
                        
            } else if (s == String.valueOf(2)) {
            
                bw.write("Miser");
                bw.newLine();
                bw.write("Handsome");
                bw.newLine();
                
            } else if (s == String.valueOf(3)) {
               
                bw.write("Generous");
                bw.newLine();
                bw.write("Average");
                bw.newLine();
            }
             
            
           
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
            bw.newLine();
            
            s = "x";
            bw.write(s);
            bw.newLine();
            
            tmp = (int)(Math.random()*10)+1;                 //int
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            
            tmp =   ((int)(Math.random()*10)+1);             //attr
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            
            tmp =  (((int)(Math.random()*10))*4000 + 8000);     //budget
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            
                                    //pairedto
            
            tmp =  (((int)(Math.random()*10))*4000 + 8000);     //budget
            s = String.valueOf(tmp);
            bw.write(s);
            bw.newLine();
            
           
            s = String.valueOf(r.nextInt(4 - 1) + 1);
        
           
            
            if (s == String.valueOf(1)) {
                
                bw.write("Desperate");
                bw.newLine();
                bw.write("Average");
                bw.newLine();
                
                        
            } else if (s == String.valueOf(2)) {
            
                bw.write("Choosy");
                bw.newLine();
                bw.write("Handsome");
                bw.newLine();
                
                
            } else if (s == String.valueOf(3)) {
                
                bw.write("Normal");
                bw.newLine();
                bw.write("Intelligent");
                bw.newLine();
                
                 
                 
            }
            
            
        }
        bw.close();
    }
    
}
